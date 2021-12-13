package model.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.vo.BbsVO;

public class OracleDaoImpl implements OracleDao {
	
	public static final String DRIVER = "oracle.jdbc.driver.OracleDriver" ; 
	public static final String URL    = "jdbc:oracle:thin:@127.0.0.1:1521:xe" ;		
	public static final String USER   = "hr" ;
	public static final String PASSWD = "hr" ;
	
	public OracleDaoImpl() {
		try {
			Class.forName(DRIVER) ;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public int insertRow(Object obj) {
		System.out.println("dao insertRow");
		Connection        conn  = null ; 
		PreparedStatement pstmt = null ;
		int flag = 0 ; 
		String SQL = "INSERT INTO BBS_TBL VALUES(BBS_SEQ.NEXTVAL,?,?,?,SYSDATE,0)" ; 
		try {
			conn  = DriverManager.getConnection(URL, USER, PASSWD) ; 
			//////////////////
			pstmt = conn.prepareStatement(SQL) ; 
			pstmt.setString(1, ((BbsVO)obj).getSubject() ) ; 
			pstmt.setString(2, ((BbsVO)obj).getContent() ) ;
			pstmt.setString(3, ((BbsVO)obj).getWriter()  ) ;
			//////////////////
			flag = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if( conn != null ) {
					conn.close();
				}
			}catch(Exception ee) {
				ee.printStackTrace();
			}
		}
		return flag;
	}

	@Override
	public int updateRow(Object obj) {
		Connection        conn  = null ; 
		PreparedStatement pstmt = null ;
		int flag = 0 ; 
		String SQL = "UPDATE BBS_TBL "
				+ "   SET SUBJECT = ? , CONTENT = ? , REGDATE = SYSDATE "
				+ "   WHERE SEQ = ?" ; 
		try {
			conn  = DriverManager.getConnection(URL, USER, PASSWD) ;
			pstmt = conn.prepareStatement(SQL) ; 
			///////////////////////////////////////
			pstmt.setString(1, ((BbsVO)obj).getSubject() ) ;
			pstmt.setString(2, ((BbsVO)obj).getContent() ) ;
			pstmt.setInt(3, ((BbsVO)obj).getSeq() ) ;
			/////////////////////////////////////////
			flag = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if( conn != null ) {
					conn.close();
				}
			}catch(Exception ee) {
				ee.printStackTrace();
			}
		}
		return flag;
	}

	@Override
	public int deleteRow(Object obj) {
		Connection        conn  = null ; 
		PreparedStatement pstmt = null ;
		int flag = 0 ; 
		String SQL = "DELETE FROM BBS_TBL WHERE SEQ = ? " ;  
		try {
			conn  = DriverManager.getConnection(URL, USER, PASSWD) ;
			pstmt = conn.prepareStatement(SQL) ; 
			///////////////////////////////////////
			pstmt.setInt(1, ((BbsVO)obj).getSeq() ) ;
			/////////////////////////////////////////
			flag = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if( conn != null ) {
					conn.close();
				}
			}catch(Exception ee) {
				ee.printStackTrace();
			}
		}
		return flag;
	}

	@Override
	public List<Object> selectRow() {
		Connection        conn  = null ; 
		PreparedStatement pstmt = null ;
		ResultSet		  rset  = null ; 
		List<Object> list       = new ArrayList() ; 
		String SQL = "SELECT "
				+ " SEQ, SUBJECT, CONTENT, WRITER, "
				+ " TO_CHAR(REGDATE, 'YYYY-MM-DD'), "
				+ " VIEWCNT "
				+ " FROM BBS_TBL "
				+ " ORDER BY SEQ DESC" ; 
		try {
			conn  = DriverManager.getConnection(URL, USER, PASSWD) ;
			pstmt = conn.prepareStatement(SQL) ; 
			/////////////////////
			rset = pstmt.executeQuery() ; 
			while(rset.next()) {
				list.add(new BbsVO(
						rset.getInt(1) ,
						rset.getString(2) , 
						rset.getString(3) ,
						rset.getString(4) ,
						rset.getString(5) ,
						rset.getInt(6) )) ; 
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if( conn != null ) {
					conn.close();
				}
			}catch(Exception ee) {
				ee.printStackTrace();
			}
		}
		return list;
	}
	
	private void upCnt(Object obj) {
		System.out.println("dao upCnt viewcnt ++ ");
		Connection conn = null ;
		PreparedStatement pstmt = null ;
		String SQL = "UPDATE BBS_TBL "
				+			" SET VIEWCNT = VIEWCNT + 1 "
				+			" WHERE SEQ = ? " ;
		try {
			conn  = DriverManager.getConnection(URL, USER, PASSWD) ;
			pstmt = conn.prepareStatement(SQL) ; 
			/////////////////////
			pstmt.setInt(1, ((BbsVO)obj).getSeq() );
			//// 
			int flag = pstmt.executeUpdate() ;
			System.out.println("update viewcnt = " + flag);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		
	}

	@Override
	public Object selectRow(Object obj) {
		System.out.println("dao selectRow ");
		
		// viewcnt update
				upCnt(obj) ;
				
		Connection        conn  = null ; 
		PreparedStatement pstmt = null ;
		ResultSet		  rset  = null ; 
		Object            row   = null ;  
		String SQL = "SELECT * FROM BBS_TBL WHERE SEQ = ?"  ;
		try {
			conn  = DriverManager.getConnection(URL, USER, PASSWD) ;
			pstmt = conn.prepareStatement(SQL) ; 
			/////////////////////
			pstmt.setInt(1, ((BbsVO)obj).getSeq() );
			//// 
			rset = pstmt.executeQuery() ; 
			if( rset.next()) {
				row = new BbsVO(
						rset.getInt(1) ,
						rset.getString(2) , 
						rset.getString(3) ,
						rset.getString(4) ,
						rset.getString(5) ,
						rset.getInt(6) ) ; 
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if( conn != null ) {
					conn.close();
				}
			}catch(Exception ee) {
				ee.printStackTrace();
			}
		}
		return row;
	}


}

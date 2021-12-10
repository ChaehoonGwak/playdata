package model.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
		Connection        conn  = null ; 
		PreparedStatement pstmt = null ;
		int flag = 0 ; 
		String SQL = "INSERT INTO BBS_TBL VALUES(BBS_SEQ.NEXTVAL,?,?,?,SYSDATE,?)" ; 
		try {
			conn  = DriverManager.getConnection(URL, USER, PASSWD) ; 
			
			pstmt = conn.prepareStatement(SQL) ; 
			pstmt.setString(1, ((BbsVO)obj).getSubject() ) ; 
			pstmt.setString(2, ((BbsVO)obj).getContent() ) ;
			pstmt.setString(3, ((BbsVO)obj).getWriter() ) ;
			pstmt.setInt(4,    ((BbsVO)obj).getViewcnt() ) ;
			
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
		try {
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		return flag;
	}

	@Override
	public int deleteRow(Object obj) {
		Connection        conn  = null ; 
		PreparedStatement pstmt = null ;
		int flag = 0 ; 
		try {
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		return flag;
	}

	@Override
	public List<Object> selectRow() {
		Connection        conn  = null ; 
		PreparedStatement pstmt = null ;
		ResultSet		  rset  = null ; 
		List<Object> list       = null ;  
		try {
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		return list;
	}

	@Override
	public Object selectRow(Object obj) {
		Connection        conn  = null ; 
		PreparedStatement pstmt = null ;
		ResultSet		  rset  = null ; 
		Object            row   = null ;  
		try {
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		return row;
	}


}

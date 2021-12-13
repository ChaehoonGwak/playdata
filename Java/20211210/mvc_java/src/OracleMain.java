import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

import model.vo.UserVO;

public class OracleMain {
	/**
	 *  JDBC 절차(java.sql.*)
	 *  - ORM - VO - Table Mapping
	 *  예외발생 - try ~ catch ~ finally
	 *  1. Driver loading
	 *  2. Connection
	 *  3. Statement(query)
	 *  4. execute(DML, SELECT)
	 *  - select 	- 	executeQuery() 		- ResultSet
	 *  - dml 		-	executeUpdate()	-	int(1, 0)
	 *  5. ResultSet(결과집합)
	 *  6. close
	 */
	
	public static final String DRIVER = "oracle.jdbc.driver.OracleDriver" ; 
	public static final String URL    = "jdbc:oracle:thin:@127.0.0.1:1521:xe" ;		
	public static final String USER   = "hr" ;
	public static final String PASSWD = "hr" ;


	public static void main(String[] args) {
		try {
			Class.forName(DRIVER)	;
			System.out.println("1. Driver loading ok!!");
			Connection conn = DriverManager.getConnection(URL, USER, PASSWD);
			System.out.println("2. Conntection ok!!" + conn);
			
			/* insert
			UserVO user = new UserVO("chgwak", "chgwak", "곽채훈", 1000);
			System.out.println("user info >> " + user);
			
			String insertSQL = "INSERT INTO USER_TBL VALUES(?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(insertSQL);
			pstmt.setString(1, user.getId() );
			pstmt.setString(2, user.getPwd());
			pstmt.setString(3, user.getName());
			pstmt.setInt(4, user.getPoint());
			
			int flag = pstmt.executeUpdate();
			System.out.println("result flag >> "+flag);
			*/
			
			String selectSQL = "SELECT ID, PWD, NAME, POINT FROM USER_TBL"
					+ " WHERE ID =  ? AND PWD = ? ";
			PreparedStatement pstmt = conn.prepareStatement(selectSQL);
			pstmt.setString(1, "chgwak");
			pstmt.setString(2, "chgwak");
			ResultSet rset = pstmt.executeQuery();
			UserVO user = null ;
			while(rset.next()) {
				String id 		= rset.getString(1);
				String pwd 	= rset.getString(2);
				String name 	= rset.getString(3);
				int point 		= rset.getInt(4);
				
				user = new UserVO(id, pwd, name, point);
			}
			
			System.out.println(">><<");
			if(user != null) {
				System.out.println("로그인 환영합니다!!" + user.getName());
			}else {
				System.out.println("로그인 정보를 확인하세요!!");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

package encore.user.model.sql;

import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class UserDaoImpl implements UserDao{
	
	private static SqlSessionFactory factory ; 
	SqlSession session ; 
	static {
		System.out.println("------------------- mybatis loading --------------------"); 
		try{
			factory = new SqlSessionFactoryBuilder().build(
		Resources.getResourceAsReader("resource/config/configuration.xml"));
		}catch(Exception e) {
			e.printStackTrace() ;
		}
	}
	
	public UserDaoImpl() {
		session = factory.openSession(true);
		System.out.println(">>> dao session"+session);
	}
	
	@Override
	public Object loginRow(Object obj) {
		System.out.println(">>> dao loginRow");
		return session.selectOne("encore.user.loginRow", obj);
	}

	@Override
	public int registerRow(Object obj) {
		System.out.println(">>> user dao registerRow");
		return session.insert("encore.user.insertRow", obj);
	}

	@Override
	public List<Object> bbsListRow() {
		System.out.println(">>> user dao bbs list");
		return session.selectList("encore.user.listRow");
	}
	
}

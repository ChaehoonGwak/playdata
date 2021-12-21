package encore.bbs.model.sql;

import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BbsDaoImpl implements BbsDao{
	
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
	
	public BbsDaoImpl() {
		session = factory.openSession(true);
		System.out.println(">>> dao session"+session);
	}

	@Override
	public List<Object> listRow() {
		System.out.println(">>> dao listRow");
		return session.selectList("encore.bbs.listRow");
	}

	@Override
	public int insertRow(Object obj) {
		System.out.println(">>> dao insertRow");
		return session.insert("encore.bbs.insertRow", obj);
	}

	@Override
	public Object selectRow(Object obj) {
		System.out.println(">>> dao selectRow");
		return session.selectOne("encore.bbs.selectRow" ,  obj);
	}

	@Override
	public int updateRow(Object obj) {
		System.out.println(">>> dao updateRow");
		return session.update("encore.bbs.updateRow" , obj);
	}

	@Override
	public int deleteRow(Object obj) {
		System.out.println(">>> dao deleteRow");
		return session.delete("encore.bbs.deleteRow" , obj);
	}

}

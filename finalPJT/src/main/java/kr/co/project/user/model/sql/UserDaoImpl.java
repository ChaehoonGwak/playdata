package kr.co.project.user.model.sql;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

@Repository("userD")
public class UserDaoImpl implements UserDao {
	
	@Resource(name="sqlSession")
	private SqlSession session ; 
	
	
	@Override
	public Object loginRow(Object obj) {
		System.out.println(">>> user dao loginRow");
		return session.selectOne("encore.project.user.loginRow", obj);
	}

	@Override
	public int registerRow(Object obj) {
		System.out.println(">>> user dao registerRow");
		return session.insert("encore.user.insertRow", obj) ;
	}

	
}



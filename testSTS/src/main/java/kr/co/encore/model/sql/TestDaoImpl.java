package kr.co.encore.model.sql;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.encore.model.vo.BbsVO;

// container -> TestDao testD = new TestDaoImpl()	;
@Repository("testD")
public class TestDaoImpl implements TestDao{
	
	
	@Resource(name="sqlSession")
	private SqlSession session;
	
	@Override
	public void row() {
		System.out.println(">>> dao row");
		System.out.println(">>> dao mybatis session : "+session);
		List<Object> list = session.selectList("encore.listRow");
		for(Object obj : list) {
			System.out.println((BbsVO)obj);
		}
	}
}

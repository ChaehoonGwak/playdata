package kr.co.encore.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.co.encore.model.sql.TestDao;

// container -> TestServiceImple testS = new TestServiceImpl();
@Service("testS")
public class TestServiceImpl implements TestService{
	
	@Resource(name="testD")
	private TestDao dao ;
//	public TestServiceImpl(TestDao dao) {
//		this.dao = dao;
//	}
	
	public void service() {
		System.out.println("test service bean");
		System.out.println("service dao >>>> "+dao);
		dao.row();
	}
}

package test.service;

import test.model.dao.TestDAO;
import test.model.vo.TestVO;

/*
 * Business Logic 처리
 * SQL X
 */
public class TestServiceImpl {
	private TestDAO dao	;
	
	public TestServiceImpl() {
		dao = new TestDAO()	;
	}
	
	public int insertService(TestVO vo) {
		System.out.println("Service >>>> ")	;
		return dao.insertRow(vo)		;
	}

}

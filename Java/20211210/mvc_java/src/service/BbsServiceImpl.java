package service;

import java.util.List;

import model.sql.OracleDao;
import model.sql.OracleDaoImpl;

public class BbsServiceImpl implements BbsService {
	
	// DI
	private OracleDao dao	;
	public BbsServiceImpl() {
		dao = new OracleDaoImpl()	;
	}

	@Override
	public int insertBiz(Object obj) {
		System.out.println("service insertBiz");
		return dao.insertRow(obj);
	}

	@Override
	public int updateBiz(Object obj) {
		System.out.println("service updateBiz");
		return 0;
	}

	@Override
	public int deleteBiz(Object obj) {
		System.out.println("service deleteBiz");
		return 0;
	}

	@Override
	public List<Object> selectBiz() {
		System.out.println("service selectBiz");
		return null;
	}

	@Override
	public Object selectBiz(Object obj) {
		System.out.println("service selectBiz read");
		return null;
	}
	

}

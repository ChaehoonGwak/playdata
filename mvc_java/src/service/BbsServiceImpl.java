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
		return dao.updateRow(obj);
	}

	@Override
	public int deleteBiz(Object obj) {
		System.out.println("service deleteBiz");
		return dao.deleteRow(obj);
	}

	@Override
	public List<Object> selectBiz() {
		System.out.println("service selectBiz");
		return dao.selectRow();
	}

	@Override
	public Object selectBiz(Object obj) {
		System.out.println("service selectBiz read");
		return dao.selectRow(obj) ; 
	}
	
	@Override
	public List<Object> searchBiz(Object obj) {
		System.out.println("service searchBiz");
		return dao.searchRow(obj) ; 
	}
	

}

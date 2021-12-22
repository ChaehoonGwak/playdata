package encore.bbs.service;

import java.util.List;

import encore.bbs.model.sql.BbsDao;
import encore.bbs.model.sql.BbsDaoImpl;

public class BbsServiceImpl implements BbsService{
	
	private BbsDao dao ;
	public BbsServiceImpl() {
		dao = new BbsDaoImpl();
	}

	@Override
	public List<Object> listService() {
		System.out.println(">>> bbs service listService");
		return dao.listRow();
	}

	@Override
	public int postService(Object obj) {
		System.out.println(">>> bbs service postService");
		return dao.insertRow(obj);
	}

	@Override
	public Object readService(Object obj) {
		System.out.println(">>> bbs service readService");
		return dao.selectRow(obj);
	}

	@Override
	public int updateService(Object obj) {
		System.out.println(">>> bbs service updateService");
		return dao.updateRow(obj);
	}

	@Override
	public int deleteService(Object obj) {
		System.out.println(">>> bbs service deleteService");
		return dao.deleteRow(obj);
	}

	@Override
	public List<Object> searchService(Object obj) {
		System.out.println(">>> bbs service searchService");
		return dao.searchRow(obj);
	}

}
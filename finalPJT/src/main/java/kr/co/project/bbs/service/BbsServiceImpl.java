package kr.co.project.bbs.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.co.project.bbs.model.sql.BbsDao;

@Service("bbsS")
public class BbsServiceImpl implements BbsService{
	
	@Resource(name="bbsD")
	private BbsDao dao ;

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

	@Override
	public List<Object> replyPostService(Object obj) {
		System.out.println(">>> bbs service replyPostService");
		return dao.replyPostRow(obj);
	}

	@Override
	public List<Object> replyDeleterService(Object obj) {
		System.out.println(">>> bbs service replyDeleterService");
		return null;
	}

}

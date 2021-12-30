package kr.co.project.bbs.service;

import java.util.List;

public interface BbsService {
	public List<Object> listService();
	public int postService(Object obj);
	public Object readService(Object obj);
	public int updateService(Object obj);
	public int deleteService(Object obj);
	
	public List<Object> searchService(Object obj);
	public List<Object> replyPostService(Object obj);
	public List<Object> replyDeleteService(Object obj);
}
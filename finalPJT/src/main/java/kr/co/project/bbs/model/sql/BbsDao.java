package kr.co.project.bbs.model.sql;

import java.util.List;

public interface BbsDao {
	public List<Object> listRow() ;
	public int insertRow(Object obj);
	public Object selectRow(Object obj);
	public int updateRow(Object obj);
	public int deleteRow(Object obj);
	
	public List<Object> searchRow(Object obj);
	public List<Object> replyPostRow(Object obj);
	public List<Object> replyDeleteRow(Object obj);
}

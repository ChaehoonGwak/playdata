package service;

import java.util.List;

public interface BbsService {
	
	// DML
	public int insertBiz(Object obj)	;
	public int updateBiz(Object obj)	;
	public int deleteBiz(Object obj)	;
	
	// Select
	public List<Object> 	selectBiz()	;
	public Object 			selectBiz(Object obj) ;
	public List<Object> searchBiz(Object obj) ;


}

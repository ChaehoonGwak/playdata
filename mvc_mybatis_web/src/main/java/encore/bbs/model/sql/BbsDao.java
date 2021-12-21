package encore.bbs.model.sql;

import java.util.List;

public interface BbsDao {
	public List<Object> listRow() ;
	public int insertRow(Object obj);
	public Object selectRow(Object obj);
	public int updateRow(Object obj);
	public int deleteRow(Object obj);

}

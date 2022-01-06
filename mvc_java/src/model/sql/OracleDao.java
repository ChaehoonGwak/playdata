package model.sql;

import java.util.List;

public interface OracleDao {
	// DML
	public int insertRow(Object obj) ; 
	public int updateRow(Object obj) ;
	public int deleteRow(Object obj) ;
	// Select
	public List<Object> 	selectRow() ; 
	public Object			selectRow(Object obj) ; 
	// Search
	public List<Object> searchRow(Object obj) ; 
}

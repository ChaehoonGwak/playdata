package model.vo;

public class FilterVO {
	
	private String searchCondition ; 
	private String searchKeyword ;
	
	public FilterVO() {
	}
	public FilterVO(String searchCondition, String searchKeyword) {
		this.searchCondition = searchCondition;
		this.searchKeyword = searchKeyword;
	}
	
	public String getSearchCondition() {
		return searchCondition;
	}
	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}
	public String getSearchKeyword() {
		return searchKeyword;
	}
	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}
	
	@Override
	public String toString() {
		return "FilterVO [searchCondition=" + searchCondition + ", searchKeyword=" + searchKeyword + "]";
	} 
	
	
}

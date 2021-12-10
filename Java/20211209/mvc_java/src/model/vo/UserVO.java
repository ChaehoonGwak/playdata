package model.vo;
/*
 * 기본 : char , byte, short, int, long, float, double, boolean
 * int x = 10 
 * 참조 : 기본타입이 아닌 모든 것(주소 값 = 객체생성)
 * Test t = new Test() 
 */

public class UserVO {
	private String 	id , pwd , name ; 
	private int		point ;
	public UserVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserVO(String id, String pwd, String name, int point) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.point = point;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	@Override
	public String toString() {
		return "UserVO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", point=" + point + "]";
	} 
	
	
}

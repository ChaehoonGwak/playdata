package kr.co.encore.model.vo;

public class TestVO {
	String id, pwd;

	public TestVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TestVO(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
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

	@Override
	public String toString() {
		return "TestVO [id=" + id + ", pwd=" + pwd + "]";
	}
	

}

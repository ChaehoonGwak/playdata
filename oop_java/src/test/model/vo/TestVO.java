package test.model.vo;

public class TestVO {
	
	private String		name	;
	private int 		age		;
	private String		address	;
	
	// Default Constructor
	public TestVO() {
	}
	
	// Special Constructor
	public TestVO(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String info() {
		return name+"\t"+age+"\t"+address	;
	}
	
}

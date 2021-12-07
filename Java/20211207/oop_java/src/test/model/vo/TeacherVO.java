package test.model.vo;

public class TeacherVO extends PersonVO {
	
	private String subject ; 
	
	public TeacherVO() {
	}
	public TeacherVO(String name, int age, String address, String subject) {
		super(name, age, address) ; 
		this.subject = subject ;
	}
	public void setSubject(String subject) {
		this.subject = subject ;
	}
	public String getSubject() {
		return this.subject ;
	}
	public String teaInfo() {
		return super.perInfo()+"\t"+subject ; 
	}
	@Override
	public String perInfo() {
		return super.perInfo()+"\t"+subject ; 
	}
	
}






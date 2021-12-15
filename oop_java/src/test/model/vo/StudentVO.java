package test.model.vo;

public class StudentVO extends PersonVO {
		private String ssn	;
		
		public StudentVO() {
		}

		public StudentVO(String name, int age, String address, String ssn) {
			super(name, age, address);
			this.ssn = ssn;
		}

		public String getSsn() {
			return ssn;
		}

		public void setSsn(String ssn) {
			this.ssn = ssn;
		}
		
		public String stuInfo() {
			return super.perInfo()+"\t"+ssn	;
		}
		
		@Override
		public String perInfo() {
			return super.perInfo()+"\t"+ssn	;
		}
}

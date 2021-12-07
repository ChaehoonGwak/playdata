import test.model.vo.PersonVO;
import test.model.vo.StudentVO;
import test.service.BusinessServiceImpl;

public class OopMain {

	public static void main(String[] args) {
//		StudentVO stu = new StudentVO("chgwak", 28, "수원", "1994")	;
//		System.out.println(stu.stuInfo());
		////
		BusinessServiceImpl service = new BusinessServiceImpl();
		service.makePer(1, "곽채훈", 28, "수원", "1992");
		service.makePer(2, "임정섭", 49, "서울", "자바");
		service.makePer(3, "공영진", 30, "대전", "교육");
		
		PersonVO [] ary = service.getAry();
		for(int idx=0 ; idx < ary.length ; idx++ ) {
			PersonVO per = ary[idx]	;
			if(per == null) {
				break;
			}
			System.out.println(per.perInfo());
		}
	}

}

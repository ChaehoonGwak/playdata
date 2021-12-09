import java.util.List;

import test.model.vo.PersonVO;
import test.model.vo.StudentVO;
import test.service.BusinessServiceImpl;

public class OopMain {

	public static void main(String[] args) {
//		StudentVO stu = new StudentVO("chgwak", 28, "수원", "1994")	;
//		System.out.println(stu.stuInfo());
		////
		BusinessServiceImpl service = new BusinessServiceImpl();
		service.makePer(1, "곽채훈", 28, "수원", "1992")	;
		service.makePer(2, "임정섭", 49, "서울", "자바")	;
		service.makePer(3, "공영진", 30, "대전", "교육")	;
		
		System.out.println(">>전체 출력<<");
		List<PersonVO> ary = service.getAry();
		int size = ary.size();
		for(int idx=0 ; idx < size ; idx++ ) {
			PersonVO per = ary.get(idx)	;
			if(per == null) {
				break;
			}
			System.out.println(per.perInfo());
		}
		System.out.println();
		System.out.println();
		
		System.out.println(">> 찾기 <<");
		PersonVO search = service.searchPer("곽채훈");
		if(search != null) {
			System.out.println(search.perInfo());
		}else {
			System.out.println("데이터가 존재하지 않습니다...");
		}
	}
}

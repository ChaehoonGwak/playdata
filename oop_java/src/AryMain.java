import test.model.vo.ManagerVO;
import test.model.vo.PersonVO;
import test.model.vo.StudentVO;
import test.model.vo.TeacherVO;

public class AryMain {

	public static void main(String[] args) {
		// 배열 객체 생성 - int 타입을 담을 수 있는 
		int [] intAry = new int [10] ; 
		intAry[0] = 'c' ;
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(intAry[i]);
		}
		System.out.println();
		System.out.println();
		
		PersonVO [] stuAry  =  new PersonVO[10]; 
		
		PersonVO stu = new StudentVO("최윤미", 29, "대전", "1992") ;
		stuAry[0] = stu ; 
		
		stuAry[1] = new TeacherVO("최윤미", 29, "대전", "1992") ;
		stuAry[2] = new ManagerVO("최윤미", 29, "대전", "1992") ;
		
		for(int idx=0 ; idx < stuAry.length ; idx++ ) {
			PersonVO per = stuAry[idx] ; 
			if(per != null) {
				if( per instanceof StudentVO ) {
					System.out.println( ((StudentVO)per).stuInfo() );
				}
				if( per instanceof TeacherVO ) {
					System.out.println( ((TeacherVO)per).teaInfo() );
				}
				if( per instanceof ManagerVO ) {
					System.out.println( ((ManagerVO)per).empInfo() );
				}
			}
			
		}
		System.out.println();
		System.out.println();
		
		for(int idx=0 ; idx < stuAry.length ; idx++ ) {
			PersonVO per = stuAry[idx] ; 
			System.out.println(per.perInfo()); 
		}
		
		
		
		
	}

}






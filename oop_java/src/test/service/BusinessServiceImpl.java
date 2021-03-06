package test.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import test.model.util.TV;
import test.model.vo.ManagerVO;
import test.model.vo.PersonVO;
import test.model.vo.StudentVO;
import test.model.vo.TeacherVO;

/*
 * 업무로직을 처리하는 클래스
 * vo 객체를 생성하고 관리(배열)하는 업무를 수행
 * 수정, 삭제, 찾기
 */
public class BusinessServiceImpl {
	
	//private PersonVO [] perAry ; 
	private List<PersonVO> perAry;
	private int idx ; 
	
	public BusinessServiceImpl() {
		perAry = new  ArrayList<PersonVO>()	;
	}
	
	/*
	 * 인자로 들어온 값을 받고 
	 * division을 구분하여 각 타입의 객체를 생성하고 배열에 저장할려고한다.
	 * division 1 = stu , 2 = tea , 3 = man
	 * 배열에 저장할 때는 구현된 setAry() 호출하면 된다. 
	 */
	public void makePer(int division, String name, int age, String address, String comm) {
		PersonVO per = null	;
		
		switch(division) {
		case 1:
			per = new StudentVO(name, age, address, comm);
			break;
		case 2:
			per = new TeacherVO(name, age, address, comm);
			break;
		case 3:
			per = new ManagerVO(name, age, address, comm);
			break; 
			
		}
		setAry(per)	;
	}
	public void setAry(PersonVO per) {
		perAry.add(per)	;
	}
	public List<PersonVO> getAry() {
		return perAry ; 
	}
	
	public PersonVO searchPer(String name) {
		PersonVO per = null	;
//		for(int i=0 ; i < perAry.size(); i++ ) {
//			PersonVO entity = perAry.get(i);
//			if( entity.getName().equals(name) ) {
//				per = entity	;
//				break	;
//			}
//		}
		Iterator<PersonVO> ite = perAry.iterator()	;
		while(ite.hasNext()) {
			PersonVO entity = ite.next()	;
			if(entity.getName().equals(name) ) {
				per = entity	;
				break	;
			}
		}
		return per	;
	}
}









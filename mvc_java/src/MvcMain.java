import java.util.List;

import model.sql.OracleDao;
import model.sql.OracleDaoImpl;
import model.vo.BbsVO;

public class MvcMain {

	public static void main(String[] args) {
		OracleDao dao = new OracleDaoImpl() ; 
		/*
		System.out.println(">> 게시물 작성");
		BbsVO bbs = new BbsVO();
		bbs.setSubject("휴강안내");
		bbs.setContent("뻥이야~");
		bbs.setWriter("chgwak");
		bbs.setViewcnt(0);
		
		int insertFlag = dao.insertRow(bbs) ; 
		String result = (insertFlag != 0) ? "insert ok" : "insert error" ;  
		System.out.println(result); 
		*/
		//////////////////////////////////////////////////////////////////
		/*
		System.out.println(">>수정<<");
		BbsVO bbs = new BbsVO();
		bbs.setSubject("즐거운 금요일");
		bbs.setContent("강사님과 함께하는 JDBC");
		bbs.setSeq(1) ;
		
		int updateFlag = dao.updateRow(bbs) ;
		String result = (updateFlag != 0) ? "update ok" : "update error" ;  
		System.out.println(result); 
		*/
		/*
		System.out.println(">>삭제<<");
		BbsVO bbs = new BbsVO();
		bbs.setSeq(1) ;
		
		int deleteFlag = dao.deleteRow(bbs) ;
		String result = (deleteFlag != 0) ? "delete ok" : "delete error" ;  
		System.out.println(result); 
		*/
		/*
		System.out.println(">>게시물 리스트<<"); 
		List<Object> list = dao.selectRow() ; 
		for(Object obj : list) {
			BbsVO bbs = (BbsVO)obj ; 
			System.out.println(bbs);
		}
		*/
		System.out.println(">>게시물 상세정보<<"); 
		BbsVO bbs = new BbsVO();
		bbs.setSeq(2) ;
		Object obj = dao.selectRow(bbs); 
		System.out.println( (BbsVO)obj );
		
	}

}






import model.sql.OracleDao;
import model.sql.OracleDaoImpl;
import model.vo.BbsVO;

public class MvcMain {

	public static void main(String[] args) {
		OracleDao dao = new OracleDaoImpl() ;
		
		
		System.out.println(">> 게시물 작성") ;
		BbsVO bbs = new BbsVO();
		bbs.setSubject("휴강안내");
		bbs.setContent("뻥이야");
		bbs.setWriter("chgwak");
		bbs.setViewcnt(0);
		
		int insertFlag = dao.insertRow(bbs) ;
		String result = (insertFlag != 0) ? "insert ok"	:	"insert error" ;
		System.out.println(); 
		
		
	}

}

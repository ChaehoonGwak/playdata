import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import encore.bbs.model.vo.BbsVO;

public class JsonMain {

	public static void main(String[] args) {
		BbsVO bbs = new BbsVO(1,"공지","냉무","임정섭","오늘",0);
//		JSONObject jObj = new JSONObject(bbs);
//		System.out.println(jObj.toString());
		List<Object> list = new ArrayList<>();
		list.add(bbs);list.add(bbs);list.add(bbs);
		JSONArray jAry = new JSONArray(list);
		System.out.println(jAry.toString());
		
	}

}

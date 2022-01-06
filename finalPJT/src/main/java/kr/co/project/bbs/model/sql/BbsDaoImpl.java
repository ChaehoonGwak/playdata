package kr.co.project.bbs.model.sql;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.project.bbs.model.vo.BbsVO;
import kr.co.project.bbs.model.vo.ReplyVO;

@Repository("bbsD")
public class BbsDaoImpl implements BbsDao{
	
	@Resource(name="sqlSession")
	private SqlSession session;

	@Override
	public List<Object> listRow() {
		System.out.println(">>> dao listRow");
		return session.selectList("encore.project.bbs.listRow");
	}

	@Override
	public int insertRow(Object obj) {
		System.out.println(">>> dao insertRow");
		return session.insert("encore.project.bbs.insertRow" , obj);
	}

	@Override
	public Object selectRow(Object obj) {
		System.out.println(">>> dao selectRow");
		upCnt(obj);
		BbsVO bbs = session.selectOne("encore.project.bbs.selectRow", obj);
		
		List<ReplyVO> rlist = session.selectList("encore.project.bbs.replyRow", obj);
		bbs.setRlist(rlist);
		return bbs;
	}

	@Override
	public int updateRow(Object obj) {
		System.out.println(">>> dao updateRow");
		return session.update("encore.project.bbs.updateRow", obj);
	}

	@Override
	public int deleteRow(Object obj) {
		System.out.println(">>> dao deleteRow");
		return session.delete("encore.project.bbs.deleteRow", obj);
	}
	
	private void upCnt(Object obj) {
		System.out.println(">>> dao upCnt");
		session.update("encore.project.bbs.upCnt" , obj);
	}

	@Override
	public List<Object> searchRow(Object obj) {
		System.out.println(">>> dao searchRow");
		return session.selectList("encore.project.bbs.searchRow", obj);
	}

	@Override
	public List<Object> replyPostRow(Object obj) {
		System.out.println(">>> dao replyPostRow");
		int flag = session.insert("encore.project.bbs.replyInsertRow", obj);
		System.out.println(">>> dao reply insert "+flag);
		return session.selectList("encore.project.bbs.replyRow", obj);
	}

	@Override
	public List<Object> replyDeleteRow(Object obj) {
		System.out.println(">>> dao replyDeleteRow");
		int flag = session.delete("encore.project.bbs.replyDeleteRow", obj);
		System.out.println(">>> dao reply delete "+flag);
		return session.selectList("encore.project.bbs.replyRow", obj);
	}

}

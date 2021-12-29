package kr.co.project.bbs.model.vo;

import java.util.List;

public class BbsVO {
	private int 	seq ; 
	private String	subject , content , writer , regdate ; 
	private int		viewcnt ;
	/////////////////////
	private List<ReplyVO> rlist ;
	
	public BbsVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BbsVO(int seq, String subject, String content, String writer, String regdate, int viewcnt) {
		super();
		this.seq = seq;
		this.subject = subject;
		this.content = content;
		this.writer = writer;
		this.regdate = regdate;
		this.viewcnt = viewcnt;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}
	
	public List<ReplyVO> getRlist() {
		return rlist;
	}
	public void setRlist(List<ReplyVO> rlist) {
		this.rlist = rlist;
	}
	@Override
	public String toString() {
		return "BbsVO [seq=" + seq + ", subject=" + subject + ", content=" + content + ", writer=" + writer
				+ ", regdate=" + regdate + ", viewcnt=" + viewcnt + "]";
	} 
	
	public String info() {
		return "BbsVO [seq=" + seq + ", subject=" + subject + ", content=" + content + ", writer=" + writer
				+ ", regdate=" + regdate + ", viewcnt=" + viewcnt + "]";
	}
}

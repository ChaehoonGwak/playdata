package kr.co.project.bbs.model.vo;

/*
 * CREATE TABLE REPLY_TBL(
	RSEQ 		NUMBER PRIMARY KEY ,
	SEQ			NUMBER REFERENCES BBS_TBL(SEQ) ,
	RWRITER	VARCHAR2(20)	,
	RCONTENT 	VARCHAR2(1000) ,
	RDATE 		DATE DEFAULT SYSDATE
) ;
 */

public class ReplyVO {
	private int rseq , seq ;
	private String rwriter, rcontent, rdate ;
	public ReplyVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReplyVO(int rseq, int seq, String rwriter, String rcontent, String rdate) {
		super();
		this.rseq = rseq;
		this.seq = seq;
		this.rwriter = rwriter;
		this.rcontent = rcontent;
		this.rdate = rdate;
	}
	public int getRseq() {
		return rseq;
	}
	public void setRseq(int rseq) {
		this.rseq = rseq;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getRwriter() {
		return rwriter;
	}
	public void setRwriter(String rwriter) {
		this.rwriter = rwriter;
	}
	public String getRcontent() {
		return rcontent;
	}
	public void setRcontent(String rcontent) {
		this.rcontent = rcontent;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	@Override
	public String toString() {
		return "ReplyVO [rseq=" + rseq + ", seq=" + seq + ", rwriter=" + rwriter + ", rcontent=" + rcontent + ", rdate="
				+ rdate + "]";
	}
	
	

}

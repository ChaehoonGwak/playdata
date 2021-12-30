<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib 	uri="http://java.sun.com/jsp/jstl/core" 
			prefix="c"%>


<%@include file="./include/header.jsp"%>

<!-- Main content -->
<section class="content">
	<div class="row">
		<!-- left column -->
		<div class="col-md-12">
			<!-- general form elements -->
			<div class="box box-primary">
				<div class="box-header">
					<h3 class="box-title">READ BOARD</h3>
				</div>
				<!-- /.box-header -->

<form role="form" method="post" action="ooo">

	<input type='hidden' name='seq' id="seq" value="${bbs.seq}">


	<div class="box-body">
		<div class="form-group">
			<label for="exampleInputEmail1">Subject</label> <input type="text"
				name='subject' class="form-control" value="${bbs.subject}"
				readonly="readonly">
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Content</label>
			<textarea class="form-control" name="content" rows="3"
				readonly="readonly">${bbs.content}</textarea>
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">Writer</label> <input type="text"
				name="writer" class="form-control" value="${bbs.writer}"
				readonly="readonly">
		</div>
	</div>
</form>

<!-- /.box-body -->

<div class="box-footer">
	<c:if test="${ loginUser.name == bbs.writer }">
	<button type="button" id="modifyBtn" class="btn btn-warning">Modify</button>
	<button type="button" id="removeBtn" class="btn btn-danger">REMOVE</button>
	</c:if>
	
	<button type="button" id="listBtn" class="btn btn-primary">LIST ALL</button>
</div>

<div class="row">
		<div class="col-md-12">
			<div class="box box-success">
				<div class="box-header">
					<h3 class="box-title">ADD NEW REPLY</h3>
				</div>
				<div class="box-body">
					<label for="exampleInputEmail1">Writer</label>
					<input class="form-control" 
					type="text" 
					placeholder="USER ID"    
					id="newReplyWriter"
					value="${loginUser.name }"
					readonly>
					<label for="exampleInputEmail1">Reply Text</label>
					<input class="form-control" type="text" placeholder="REPLY TEXT" id="newReplyText">
				</div>
				<!-- /.box-body -->
				<div class="box-footer">
					<button type="button" class="btn btn-primary" id="replyAddBtn">ADD REPLY</button>
				</div>
			</div>
		
		<!-- The time line -->
		<ul class="timeline">
		  	<!-- timeline time label -->
			<li class="time-label" id="repliesDiv">
			  <span class="bg-green">
			    Replies List <small id='replycntSmall'> [ 000 ] </small>
			  </span>
			</li>
		</ul>
		<!--  -->
		<ul id="rlist">
				<c:forEach items="${bbs.rlist}" var="reply">
					<c:if test="${reply.rwriter == loginUser.name}">
						<li class="time-label">	
							${reply.rseq }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							${reply.rwriter }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							${reply.rcontent}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<a href="javascript:removeReply(${reply.rseq })">X</a>
						</li>
					</c:if>
					<c:if test="${reply.rwriter != loginUser.name}">
						<li class="time-label">	
							${reply.rseq }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							${reply.rwriter }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							${reply.rcontent}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						</li>
					</c:if>
				</c:forEach>
		</ul>
		<!--  -->
			<div class='text-center'>
				<ul id="pagination" class="pagination pagination-sm no-margin ">
				</ul>
			</div>
		</div>
		<!-- /.col -->
	</div>
	<!-- /.row -->

<script>
	function removeReply(rseq){
		$.ajax({
			url  : "bbs_replyDelete" , 
			type : "post" ,
			data : {	rseq  : rseq ,
						seq  : $("#seq").val() } , 
			dataType : "json" , 
			success  : function(data) {
				$("#rlist").empty();
				lis = "";
				$.each(data, function(idx, obj) {
					if(obj.rwriter == "${loginUser.name}"){
					lis += "<li class='time-label'>"
					lis += obj.rseq+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
					lis += obj.rwriter+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
					lis += obj.rcontent+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
					lis += "<a href='javascript:removeReply("+obj.rseq+")'>X</a>"
					lis += "</li>"
					}else{
						lis += "<li class='time-label'>"
						lis += obj.rseq+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
						lis += obj.rwriter+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
						lis += obj.rcontent+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
						lis += "</li>"
					}
				}) 
				$("#rlist").html(lis);
			}
		})
	}
	$(document).ready(function(){
		$("#listBtn").click(function() {
			location.href="bbs_list";
		});
		$("#modifyBtn").click(function() {
			location.href="bbs_modifyForm?seq="+$("#seq").val() ;
		});
		$("#removeBtn").click(function() {
			location.href="bbs_remove?seq="+$("#seq").val() ;
		});
		$("#replyAddBtn").click(function(){
			//alert("btn click")
			
			$.ajax({
				url  : "bbs_replyPost" , 
				type : "post" ,
				data : {	seq  : $("#seq").val() ,
					     	rwriter : $("#newReplyWriter").val() ,
					     	rcontent : $("#newReplyText").val() } , 
				dataType : "json" , 
				success  : function(data) {
					$("#rlist").empty();
					lis = "";
					$.each(data, function(idx, obj) {
						if(obj.rwriter == "${loginUser.name}"){
						lis += "<li class='time-label'>"
						lis += obj.rseq+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
						lis += obj.rwriter+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
						lis += obj.rcontent+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
						lis += "<a href='javascript:removeReply("+obj.rseq+")'>X</a>"
						lis += "</li>"
						}else{
							lis += "<li class='time-label'>"
							lis += obj.rseq+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
							lis += obj.rwriter+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
							lis += obj.rcontent+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
							lis += "</li>"
						}
					}) 
					$("#rlist").html(lis);
				}
			})

		});
	});
</script>




			</div>
			<!-- /.box -->
		</div>
		<!--/.col (left) -->

	</div>
	<!-- /.row -->
</section>
<!-- /.content -->
</div>
<!-- /.content-wrapper -->

<%@include file="./include/footer.jsp"%>

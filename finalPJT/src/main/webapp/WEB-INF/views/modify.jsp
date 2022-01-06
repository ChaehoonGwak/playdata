<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="./include/header.jsp"%>

<!-- Main content -->
<section class="content">
	<div class="row">
		<!-- left column -->
		<div class="col-md-12">
			<!-- general form elements -->
			<div class="box box-primary">
				<div class="box-header">
					<h3 class="box-title">Modify BOARD</h3>
				</div>
				<!-- /.box-header -->

<form role="form" id="fmt" method="post">

	<div class="box-body">

		<div class="form-group">
			<label for="exampleInputEmail1">BNO</label> <input type="text"
				name='seq' class="form-control" value="${bbs.seq}"
				readonly="readonly">
		</div>

		<div class="form-group">
			<label for="exampleInputEmail1">Subject</label> <input type="text"
				name='subject' class="form-control" value="${bbs.subject}">
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Content</label>
			<textarea class="form-control" name="content" rows="3">${bbs.content}</textarea>
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">Writer</label> <input
				type="text" name="writer" class="form-control"
				value="${bbs.writer}" readonly>
		</div>
	</div>
	<!-- /.box-body -->
</form>


<div class="box-footer">
	<button type="button" id="updateBtn" class="btn btn-primary">UPDATE</button>
	<button type="submit" class="btn btn-warning">CANCEL</button>
</div>

<script>
	$(document).ready(function() {
		$("#updateBtn").click(function() {
			$("#fmt").prop("action" , "bbs_modify").submit() ;
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

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div id= "result"></div>
	<br/>
	<button type="button" id="btn" class="btn">scriptBtn</button>
	<hr/>
	제조사
	<select id="maker">
		<option>benz</option>
		<option>audi</option>
		<option>bmw</option>
	</select>
	모델
	<select id="model">
		<option>선택하세요</option>
	</select>
	
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script type="text/javascript">
	var obj = {seq :1, title :' 공지'}
	var ary = [{seq :1, title :' 공지1'},
		{seq :2, title :' 공지2'},
		{seq :3, title :' 공지3'}];
	var models = {
		benz : ['c200','e200','s500'],
		audi : ['a4','a6','a8'],
		bmw : ['320d','520d','740d']
		
	};
	function displayAry(ary) {
		var options = "<option>선택하세요</option>";
		$.each(ary , function(idx, data) {
			options += "<option>"+data+"</option>"	
		})
		$("#model").html(options);
	}

	$(document).ready(function(){
		$(".btn").click(function(){
//			$("#result").html("<h1>"+obj.title+"</h1>")
		
			$.each(ary, function(idx,obj){
				alert(obj.seq+" , "+obj.title)
			})
		});
		$("#maker").change(function() {
			var maker = $(this).val()
			if( maker == 'benz') {
				displayAry(models.benz) ;
			}
			if( maker == 'audi') {
				displayAry(models.audi) ;
			}
			if( maker == 'bmw') {
				displayAry(models.bmw) ;
			}
		});

	});
	</script>

</body>
</html>
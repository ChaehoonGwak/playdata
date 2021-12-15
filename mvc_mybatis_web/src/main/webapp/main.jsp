<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">WEB FRAMEWORK</div>
	<hr/>
	<div align="right">
		<form action="login.encore" method="post">
		<label>아이디</label>
		<input type="text" name="id" placeholder="아이디" />
		<label>패스워드</label>
		<input type="password" name="pwd" placeholder="패스워드" />
		
		<input type="submit" value="로그인" />
		</form>
	</div>
	
	<div align="left">
		<a href="list.encore">게시물 목록보기</a>	
	</div>
	
</body>
</html>







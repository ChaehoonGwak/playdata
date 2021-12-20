<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">WEB FRAMEWORK</div>
	<hr />
	<div align="right">

		<c:if test="${ loginUser == null}">
			<form action="login.encore" method="post">
				<label>아이디</label> <input type="text" name="id" placeholder="아이디" />
				<label>패스워드</label> <input type="password" name="pwd"
					placeholder="패스워드" /> <input type="submit" value="로그인" />
				&nbsp;&nbsp;&nbsp; <a href="registerForm.encore">[회원가입]</a>
			</form>
		</c:if>

		<c:if test="${ loginUser != null}">
			<font color='blue'>${loginUser.name}</font> 님 환영합니다!!
			&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="logout.encore">로그아웃</a>
		</c:if>

	</div>
	<c:if test="${ loginUser != null}">
		<div align="left">
			<a href="bbs/list.encore">게시물 목록보기</a>
		</div>
	</c:if>

</body>
</html>
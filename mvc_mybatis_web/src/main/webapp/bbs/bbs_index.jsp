<%@ page 	language="java" 
					contentType="text/html; charset=UTF-8"
    				pageEncoding="UTF-8"%>
<%@ taglib 	uri="http://java.sun.com/jsp/jstl/core"
					prefix="c" %>


<!DOCTYPE html > 
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
	
	<script type="text/javascript">
	</script>
	
</head>
<body>
	<table align=center border=0 width=100%>
	<tr>
		<td align=left >
			page
		</td>
		<td align="right" >
			<form id="searchFmt" method="post" action="">
				<select id="condition" name="condition">
					<option value="subject">제목</option>
					<option value="content">내용</option>
				</select>
				<input type="text" name="keyword" id="keyword" size="30">
				<input type="submit" value="검색" id="searchBtn">
			</form>
		</td>
	</tr>
	</table>
	<%-- ////////////////// --%>
	<table align=center width="100%" border=0 cellspacing=0 cellpadding=3>

	<tr align=center bgcolor=#D0D0D0 height=120%>
	<td width="15%"> 번 호 </td><td width="15%"> 이 름 </td><td width="35%"> 제 목</td><td width="20%"> 날 짜 </td><td width="15%">조회수</td>
	</tr>
	
	<c:forEach items="${ boards }" var="bbs">
		<tr> 
			<td align=center>${ bbs.seq }</td>
			<td align=center>${ bbs.writer }</td>
			<td><a href="read.encore?seq=${bbs.seq }">${ bbs.subject }</a></td>
			<td align=center>${ bbs.regdate }</td>
			<td align=center>${ bbs.viewcnt }</td>
		</tr>
	 </c:forEach>
	
	<tr>
		<td align="right" colspan="5"> 
			<a href="postForm.encore" >[글쓰기]</a> 
			<a href="../index.encore">[처음으로]</a> 
		</td>
	</tr>
	
	<%-- /////////////////////////////////////////// --%>
		

</table>


</body>
</html>





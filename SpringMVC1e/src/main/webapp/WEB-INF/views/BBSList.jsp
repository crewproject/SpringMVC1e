<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/resources/View.css">
</head>
<body>
	<table border="1">
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		<c:forEach var="vo" items="${vo}" >
			<tr>
				<td><a href='/getone/${vo.id}'>${vo.id}</a></td>
				<td>${vo.title}</td>
				<td>${vo.name}</td>
				<td>${vo.wdate}</td>
				<td>${vo.see}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
<%@page import="org.apache.catalina.connector.Response"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String id = (String)request.getAttribute("text");
		String msg = (String)request.getAttribute("msg");
	%>
	<div style = "border : 1px solid;">
		<%= id%> 님이 <%= msg%>
		<a href="./book.html">도서등록</a>
		<a href="./login.html">로그아웃</a>
	</div>
</body>
</html>
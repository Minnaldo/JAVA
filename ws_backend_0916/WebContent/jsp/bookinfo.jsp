<%@page import="org.apache.catalina.connector.Response"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <style type="text/css">

	table, th, td {
	    border: 1px solid black;
	}
	.title{
	text-align:center;	
	background-color:#eaeaea;
	}
	table{
	margin-left:33%;
	
	}
	.info{
	width:500px;
	}
	</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String isbn = (String)request.getParameter("isbn");
		String title = (String)request.getParameter("title");
		String catalogue = (String)request.getParameter("catalogue");
		String nation = (String)request.getParameter("nation");
		String publisheDate = (String)request.getParameter("publisheDate");
		String publisher = (String)request.getParameter("publisher");
		String author = (String)request.getParameter("author");
		String price = (String)request.getParameter("price");
		String description = (String)request.getParameter("description");
	%>


	<div style="text-align:center; ">
		<h1>입력된 도서 정보</h1>
	</div>
	<div class="table_wrapper">
		<table>
			<tr>
				<td colspan="2" class="title">  도서정보
				</td>
			</tr>
			<tr>
				<td class="title">도서번호
				</td>
				<td class="info"><%= isbn %>
				</td>
			</tr>
			<tr>
				<td class="title">도서명
				</td>
				<td class="info"><%= title %>
				</td>
			</tr>
			<tr>
				<td class="title">도서분류
				</td>
				<td class="info"><%= catalogue %>
				</td>
			</tr>
			<tr>
				<td class="title">도서국가
				</td>
				<td class="info"><%= nation %>
				</td>
			</tr>
			<tr>
				<td class="title">출판일
				</td>
				<td class="info"><%= publisheDate %>
				</td>
			</tr>
			<tr>
				<td class="title">출판사
				</td>
				<td class="info"><%= publisher %>
				</td>
			</tr>
			<tr>
				<td class="title">저자
				</td>
				<td class="info"><%= author %>
				</td>
			</tr>
			<tr>
				<td class="title">도서가격
				</td>
				<td class="info"><%= price %>원
				</td>
			</tr>
			<tr>
				<td class="title">도서설명
				</td>
				<td class="info"><%= description %>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>
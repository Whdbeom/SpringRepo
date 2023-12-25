<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>글작성</h1>
	<form action="/app/board/write" method="post">
	<input type="text" name="title" placeholder="제목"> 
	<br>
	<textarea rows="" cols="" name="content" placeholder="내용"></textarea>
	<br>
	<input type="text" name="writer" placeholder="작성자">
	<button>눌러</button>
	</form>
</body>
</html>
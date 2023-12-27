<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="wrap">
		<%@ include file = "/WEB-INF/views/common/header.jsp" %>
		
		<div class="main">
			<form action="/app/member/join" method="post">
				<input type="text" name="id" placeholder="아이디 입력">
				<br>
				<input type="password" name="pwd" placeholder="비밀번호 입력">
				<br>
				<input type="text" name="nick" placeholder="닉네임 입력">
				<br>
				<input type="submit" value="가입하기">
			</form>
		</div>
		<h1> 회원가입 ㅡㅡ </h1>
	</div>
	
</body>
</html>
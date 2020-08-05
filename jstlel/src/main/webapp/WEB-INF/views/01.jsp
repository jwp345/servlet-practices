<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% pageContext.setAttribute("newline", "\n"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>값 받아보기</h1>
	${ival } <br>
	${lval } <br>
	${fval } <br>
	${bval } <br>
	<p style='width:200px; height:150px; border:1px solid #0000ff'>
		${fn:replace(sval, newline, "<br>") }
	</p>
	${sval } <br>
	--${obj}--
	${userVo.no } <br>
	${userVo.name } <br>
	
	<h1>map으로 값 받아오기</h1>
	${m.i } <br>
	${m.l } <br>
	${m.s } <br>
	
	<h1>산술연산</h1>
	${3+10*20 } <br>
	${ival + 20 } <br>
	
	<h1>관계연산</h1>
	${ival == 10 } <br>
	${ival < 5 } <br>
	${object == null } <br>
	${vo != null } <br>
	${empty obj } <br>
	${not empty obj } <br>
	
	<h1>논리연산</h1>
	${ival + 10 == 10 || lval < 1234567891 } <br>
	${ival + 10 == 12 && lval < 1234567891 } <br>
	
	<h1>요청 파라미터</h1>
	${param.a } <br>
	${param.email } <br>
</body>
</html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int count1 = 1;
	pageContext.setAttribute("count2", 2);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSTL(forEach) Tag</h1>
	<c:set var='listCount' value="${fn:length(list) }" />
	<ul>
		<c:forEach items="${list }" var="vo" varStatus="status">
				<li>[${listCount - status.index }] [${status.index }:${status.count }][no: ${vo.no }, name : ${vo.name }] </li>
		</c:forEach>
	</ul>
	
	<c:set var='count3' value="3" />
	======== ${count1 }======<br>
	======== ${count2 }======<br>
	======== ${count3 }======<br>
	
</body>
</html>
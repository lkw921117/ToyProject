<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Test view DB 연동 확인!!

	<c:forEach var="item" items="${list}" varStatus="idx"> 
 	${idx.index}st, Hello! ${item.name} <br />
	</c:forEach>

</body>
</html>
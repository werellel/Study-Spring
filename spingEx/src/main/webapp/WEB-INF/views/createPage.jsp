<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
createPage
<br/>

<%
	String conPath = request.getContextPath();
%>

<form action="<%=conPath%>/student/create">
	�̸�: <input type="text" name="name" value="${student.name}"> <br/>
	���̵�: <input type="text" name="id" value="${student.id}"> <br/>
	<input type="submit" value="����"> <br/>
</form>

</body>
</html>
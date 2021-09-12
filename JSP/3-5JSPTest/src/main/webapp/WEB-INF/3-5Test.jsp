<%@ page language="java" contentType="text/html; charset=UTF-8" import = "java.util.Date, java.sql.*, java.sql.*" %>
<html>
<body>
<%
	Calendar today = Calendar.getInstance();
	int year = today.get(Calendar.YEAR);
	int month = today.get(Calender.MONTH) + 1;
	int date = today.get(Calender.DATE);
%>

오늘은 <%= year %>년 <%= month %>월 <%= date %>일입니다.
</body>
</html>
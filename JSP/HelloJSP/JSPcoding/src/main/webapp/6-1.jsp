<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.Enumeration" %>
<html>
<body>
<%
	Enumeration<String> e = application.getInitParameterNames();
	while(e.hasMoreElements()) {
		String n = e.nextElement();
		out.print(n + " = " + application.getInitParameter(n) + "<br>");
	}
%>
</body>
</html>
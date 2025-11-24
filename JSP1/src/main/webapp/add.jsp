<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add</title>
</head>
<body>
		<%!
		  int a = 100;
		  int b = 100;
		
		  public int add(){
			  return a+b;
		  }
		%>
		
		<%
		out.print(add());
		%>
</body>
</html>
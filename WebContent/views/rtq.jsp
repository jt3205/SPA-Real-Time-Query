<%@page import="util.crawler.RTQCrawler"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% 
	RTQCrawler crawler = new RTQCrawler();
	String rtq[] = crawler.crawlRank();
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
	<% for(String str : rtq){%>
		<%= str %>
		<br>
	<%	} %>
</body>
</html>
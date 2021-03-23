<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
body {font-family:Verdana;}
</style>
<title>FTT JSP</title>
</head>
<body>
<h1>FTT - JSP</h1>

<h2><%= new java.util.Date() %></h2>
<p>
<ul>
<% for (int i=0; i<10; i++) {  %>
<li>Item <%= i %></li>
<% } %>
<pre>
JSP
PHP
Cold Fusion
ASP
Etc...
</pre>
<p>
Nuvem:
<ul>
<li>Instalar servidor Linux (VM), e JDK, Tomcat, configurar SSL (AWS, Google, Azure, etc...)</li>
<li>Subir um Docker em nuvem com o Tomcat (AWS, Google, Azure, etc...)</li>
<li>Subir Java Serverless APP (AWS, Google, Azure, etc...)</li>
</ul>
<p>
<ol>
<li>WAR - Web Archive - Usando um APP/WEB Server - Tomcat (Apache), JBOSS (Redhat), Weblogic (Oracle), Websphere (IBM), Glassfish (Sun/Oracle) ...</li>
<li>JAR - Java Archive</li>
</ol>
</p>
</p>
</ul>
</p>
</body>
</html>
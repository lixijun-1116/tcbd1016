<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/12/5
  Time: 22:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<frameset rows="15%,*" frameborde="yes" border="1">
	<frame src="${pageContext.request.contextPath}/users/toTop">
	<frameset cols="20%,*" frameboder="yes" border="1">
		<frame src="${pageContext.request.contextPath}/users/toLeft">
		<frame src="${pageContext.request.contextPath}/users/toMain" name="main">
	</frameset>
</frameset>
</html>

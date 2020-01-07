<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/12/5
  Time: 23:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>
        欢迎：${sessionScope.loginUser.realName},
        <a href="${pageContext.request.contextPath}/users/logout" target="_top">退出登录</a>
    </h3>
</body>
</html>

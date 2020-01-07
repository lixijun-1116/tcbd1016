<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/12/4
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div align="center">
        <p>
            登 录
        </p>
        <form action="${pageContext.request.contextPath}/user/login" method="post">
            <p>
                账号：<input type="text" name="userName"/>
            </p>
            <p>
                密码：<input type="password" name="password"/>
            </p>
            <p>
                <input type="submit" value="登录"/>
            </p>
        </form>
    </div>
    <div align="center">
        ${msg}
    </div>
</body>
</html>

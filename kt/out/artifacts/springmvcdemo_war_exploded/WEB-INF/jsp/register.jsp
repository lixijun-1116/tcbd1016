<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/11/29
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/user/registerSuccess" method="post">
        账号：<input type="text" name="account"/><br>
        密码：<input type="text" name="password"/><br>
        昵称：<input type="text" name="nickName"/><br>
        年龄：<input type="text" name="age"/><br>
        <input type="submit" value="注册">
    </form>
</body>
</html>

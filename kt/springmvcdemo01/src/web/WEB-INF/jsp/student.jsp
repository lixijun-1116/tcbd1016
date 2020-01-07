<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/11/29
  Time: 18:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/student/add" method="post">
        姓名：<input type="text" name="nickName"/><br>
        年龄：<input type="text" name="age"/><br>
        性别：<input type="text" name="gender"/><br>
        <input type="submit" value="注册"/>
    </form>
</body>
</html>

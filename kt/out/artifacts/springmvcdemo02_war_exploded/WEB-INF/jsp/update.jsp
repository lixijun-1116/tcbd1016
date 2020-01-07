<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/11/29
  Time: 19:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/student/updateStudent" method="post">
        id:<input type="text" name="id" value="1"/>
        姓名:<input type="text" name="nickName" value="admin"/>
        年龄:<input type="text" name="age" value="20"/>
        性别:<input type="text" name="gender" value="男"/>
        <input type="submit" value="修改"/>
    </form>
</body>
</html>

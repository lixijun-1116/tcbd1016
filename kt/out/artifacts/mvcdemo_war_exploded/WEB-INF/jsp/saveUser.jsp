<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/12/2
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div align="center">
        <form action="${pageContext.request.contextPath}/user/saveUser" method="post">
            <h3>注册用户</h3>
            <p>
                用户名：<input type="next" name="userName"/><br>
            </p>
            <p>
                密码：<input type="password" name="password"/><br>
            </p>
            <p>
                昵称：<input type="next" name="nickName"/><br>
            </p>
            <p>
                年龄：<input type="next" name="age"/><br>
            </p>
            <p>
                <input type="submit" value="注册"/>
            </p>
        </form>
    </div>
</body>
</html>

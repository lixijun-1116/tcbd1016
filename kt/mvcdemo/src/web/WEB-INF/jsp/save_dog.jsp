<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/12/2
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-3.4.1.min.js"></script>
</head>

<body>
    <div align="center">
        <h2>宠物信息的录入</h2>
        <form action="${pageContext.request.contextPath}/dog/saveDog" method="post">
            <p>
                宠物昵称:<input type="text" name="name"/>
            </p>
            <p>
                宠物年龄:<input type="number" name="age"/>
            </p>
            <p>
                亲密度:<input type="number" name="love"/>
            </p>
            <p>
                <input type="submit" value="录入"/>
            </p>
        </form>
    </div>
</body>
</html>

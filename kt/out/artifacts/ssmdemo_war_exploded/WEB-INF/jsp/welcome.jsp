<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/12/4
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#logout").click(function () {
                location.href = "${pageContext.request.contextPath}/user/logout"
            })
        })
    </script>
</head>
<%--<body>
    <div align="center">
        <h3>登录成功</h3>
        欢迎：${sessionScope.loginUser.nickName}
        <p>
            <a href="${pageContext.request.contextPath}/grade/queryGrade">班级管理</a>
        </p>
        <p>
            <button id="logout">退出</button>
        </p>
    </div>
</body>--%>
<frameset rows="15%,*" frameborde="yes" border="1">
    <frame src="${pageContext.request.contextPath}/user/toTop">
    <frameset cols="20%,*" frameboder="yes" border="1">
        <frame src="${pageContext.request.contextPath}/user/toLeft">
        <frame src="${pageContext.request.contextPath}/user/toMain" name="main">
    </frameset>
</frameset>
</html>

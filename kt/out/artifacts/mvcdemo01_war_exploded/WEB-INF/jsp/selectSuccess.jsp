<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/12/3
  Time: 8:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/return.js"></script>
</head>
<body>
    查询成功
    ${sessionScope.game1}
    <p>
        <form>
            <input type="button" id="btn" value="返回"/>
        </form>
    </p>
</body>
</html>

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
    <div align="center">
        <p>
            <h3>
                <a href="${pageContext.request.contextPath}/product/toSelect" target="main">销售</a>
            </h3>
        </p>
        <p>
            <h3>
                <a href="${pageContext.request.contextPath}/sale/queryAll" target="main">销售信息查询</a>
            </h3>
        </p>
        <p>
            <h3>
                <a href="${pageContext.request.contextPath}/product/toSelect1" target="main">查看库存</a>
            </h3>
        </p>

    </div>
</body>
</html>

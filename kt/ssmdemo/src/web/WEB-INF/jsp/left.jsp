<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/12/5
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div align="center">
        <c:forEach items="${list}" var="menu">
            <c:if test="${menu.parentId==0}">
                <p>
                    <a target="main">${menu.menuName}</a>
                </p>
            </c:if>
            <c:if test="${menu.parentId!=0}">
                <p>
                    <a href="${pageContext.request.contextPath}${menu.menuUrl}" target="main">${menu.menuName}</a>
                </p>
            </c:if>
        </c:forEach>
    </div>
</body>
</html>

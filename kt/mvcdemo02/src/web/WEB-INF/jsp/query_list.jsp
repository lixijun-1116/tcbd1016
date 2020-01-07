<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/12/3
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div align="center">
        <table border="1px" cellspacing="1px" cellpadding="1px" width="30%">
            <tr>
                <td>预定编号</td>
                <td>会议室</td>
                <td>预定人</td>
                <td>日期</td>
            </tr>
            <c:forEach items="${list}" var="meetingRoom">
                <tr>
                    <td>${meetingRoom.id}</td>
                    <td>${meetingRoom.meetingName}</td>
                    <td>${meetingRoom.advanceName}</td>
                    <td>
                        <fmt:formatDate value="${meetingRoom.meetingOrder}" pattern="yyyy-MM-dd"/>
                    </td>
                </tr>

            </c:forEach>
            <tr>
                <td colspan="4" align="right">
                    <a href="${pageContext.request.contextPath}/meetingRoom/toAdd">预定会议室</a>
                </td>
            </tr>
        </table>

    </div>
</body>
</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/12/4
  Time: 20:05
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
            查 询
        </p>
        <form action="${pageContext.request.contextPath}/student/query" method="post">
            <p>
                请输入班级名称：<input type="text" name="gradeName"/>
            </p>
            <p><input type="submit" value="查询"/></p>
        </form>
    </div>
    <div align="center">
        <table border="1px" cellpadding="0px" cellspacing="0px">
            <tr>
                <td>学生id</td>
                <td>学生姓名</td>
                <td>学生性别</td>
                <td>学生年龄</td>
                <td>班级名称</td>
            </tr>
            <c:forEach items="${list}" var="student">
                <tr>
                    <td>${student.id}</td>
                    <td>${student.studentName}</td>
                    <td>${student.gender}</td>
                    <td>${student.age}</td>
                    <td>${student.grade.gradeName}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
<div align="center">
    <p>
       ${msg}
    </p>
</div>
</body>
</html>

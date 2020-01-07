<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/12/3
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        $(function () {

            $("button[name='query']").click(function () {
                //获取学生id button no属性的值
                var id = $(this).attr("no");//获取当前按钮的no属性的值
                //ajax请求查询学生的详情
                $.get("${pageContext.request.contextPath}/student/queryById","id="+id,function (result) {
                    //根据后台返回的结果对页面进行血染
                    $("#studentId").text(result.id);
                    $("#studentName").text(result.studentName);
                    $("#studentAge").text(result.age);
                    $("#studentGender").text(result.gender);
                })
            })
        })
    </script>
</head>
<body>
    <div align="center">
		<h2>学生列表</h2>
        <table border="1px" cellpadding="0px" cellspacing="0px" align="center">
            <tr align="center">
                <td>id</td>
                <td>学生姓名</td>
                <td>学生年龄</td>
                <td>学生性别</td>
                <td>操作</td>
            </tr>
            <c:forEach items="${list}" var="student">
                <tr align="center">
                    <td>${student.id}</td>
                    <td>${student.studentName}</td>
                    <td>${student.age}</td>
                    <td>${student.gender}</td>
                    <td>
                        <button name="query" no="${student.id}">详情</button>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <div align="center">
        <h2>学生详情</h2>
        <table  border="1px" cellpadding="0px" cellspacing="0px" align="center" width="30%">
            <tr align="center">
                <td width="150px">学生id</td>
                <td id="studentId"></td>
            </tr>
            <tr align="center">
                <td width="150px">学生姓名</td>
                <td id="studentName"></td>
            </tr>
            <tr align="center">
                <td width="150px">学生年龄</td>
                <td id="studentAge"></td>
            </tr>
            <tr align="center">
                <td width="150px">学生性别</td>
                <td id="studentGender"></td>
            </tr>
        </table>
    </div>
</body>
</html>

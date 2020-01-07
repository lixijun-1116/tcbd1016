<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/12/8
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("tr:odd").css("background","green");
        })
    </script>
</head>
<body>
    <div align="center">
        <p>
            <h2>在线问答</h2>
        </p>
        <p>
            <a href="${pageContext.request.contextPath}/questions/toSave">我要提问</a>
        </p>
        <table border="1px" cellspacing="0" cellpadding="0">
            <tr align="center">
                <td>序号</td>
                <td>问题</td>
                <td>回答次数</td>
                <td>最后修改</td>
            </tr>
            <c:forEach items="${allQuestions}" var="questions">
                <c:if test="${questions.answerCount==0}">
                    <tr align="center">
                        <td>${questions.id}</td>
                        <td><a href="${pageContext.request.contextPath}/questions/queryByQid?id=${questions.id}" style="color: red" >${questions.title}</a></td>
                        <td>${questions.answerCount}</td>
                        <td>
                            <fmt:formatDate value="${questions.lastModified}" pattern="yyyy-MM-dd"/>
                        </td>
                    </tr>
                </c:if>
                <c:if test="${questions.answerCount!=0}">
                    <tr align="center">
                        <td>${questions.id}</td>
                        <td><a href="${pageContext.request.contextPath}/questions/queryByQid?id=${questions.id}" style="color: blue">${questions.title}</a></td>
                        <td>${questions.answerCount}</td>
                        <td>
                            <fmt:formatDate value="${questions.lastModified}" pattern="yyyy-MM-dd"/>
                        </td>
                    </tr>
                </c:if>
            </c:forEach>
        </table>
    </div align="center">
</body>
</html>

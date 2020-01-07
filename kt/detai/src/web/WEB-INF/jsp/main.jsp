<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/12/8
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            var qid = ${Questions.id}
            $("#btn").click(function () {

                var ansContent = $("#ansContent").val()
                var data = {
                    qid : qid,
                    ansContent : ansContent
                }
                alert(qid)
                $.post("${pageContext.request.contextPath}/questions/insert",data,function (rs) {
                    alert("添加成功")
                    location.href = "${pageContext.request.contextPath}/questions/query"
                })
            })
        })
    </script>

</head>
<body>
    <div align="center">
        <p id="">
            问题：${Questions.title}
        </p>
        <p>
            问题描述：${Questions.detailDesc}
        </p>
        <div align="center">
            网友回答：
            <c:forEach items="${answersList}" var="answers">
                <fmt:formatDate value="${answers.ansDate}" pattern="yyyy-MM-dd"/>
                <br>
                ${answers.ansContent}<br>
            </c:forEach>
        </div>
    </div>
<div align="center">
    <form>


        <p>
            我来回答：
            <textarea name="ansContent" id="ansContent"  rows="3" cols="15"></textarea>
        </p>
        <p>
            <input type="button" id="btn" value="提交答案"/>
            <a href="${pageContext.request.contextPath}/questions/query">返回首页</a>
        </p>
    </form>
</div>
</body>
</html>

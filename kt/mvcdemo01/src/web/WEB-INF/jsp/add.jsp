<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/12/3
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/add.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/return.js"></script>
</head>
<body>
<div align="center">
    <form>
        <p><h3>添加游戏</h3></p>
        <p>
            游戏名称:<input type="text" name="gameName" id="gameName"/><label id ="checkmsg"></label>
        </p>
        <p>
            游戏类别:<input type="text" name="gameType" id="gameType"/>
        </p>
        <p>
            发行公司:<input type="text" name="gameCompany" id="gameCompany"/>
        </p>
        <p>
            发行年份:<input type="text" name="gameYear" id="gameYear"/>四位数字
        </p>
        <p>
            <input type="button" id="btn02" value="添加"/>
            <input type="button" id="btn" value="返回"/>
        </p>
    </form>
</div>
</body>
</html>

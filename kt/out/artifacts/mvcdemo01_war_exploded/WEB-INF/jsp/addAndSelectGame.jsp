<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/12/2
  Time: 22:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/toAdd.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/select.js"></script>
</head>
<body>
    <div align="center">
        <form>
            <p><h3>游戏查询</h3></p>
            <p>
                游戏名称:<input type="text" name="gameName" id="gameName"/>
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
                <input type="button" id="btn01" value="查询"/>
                <input type="button" id="btn02" value="新增"/>
            </p>
        </form>
    </div>
</body>
</html>

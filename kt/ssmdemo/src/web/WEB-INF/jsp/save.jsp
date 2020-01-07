<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/12/6
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div align="center">
        <form action="${pageContext.request.contextPath}/grade/save">
            <h3>添加班级</h3>
            <p>
                班级名称：<input type="text" name="gradeName"/>
            </p>
            <p>
                班级描述：
                <textarea rows="3" cols="15" id="details" name="details">

                </textarea>
            </p>
            <p>
                <input type="submit" value="保存"/>
                <input type="reset" value="重置"/>
            </p>
        </form>
    </div>
</body>
</html>

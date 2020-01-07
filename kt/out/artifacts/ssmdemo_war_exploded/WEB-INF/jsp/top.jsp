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
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript" >
        $(function () {
            var date = new Date();
            var hour = date.getHours();
            var hourStr;
            if (hour < 12){
                hourStr = "上午好！";
            }else if(hour > 12 && hour < 18){
                hourStr = "下午好！";
            }else{
                hourStr = "晚上好";
            }
            $("#da").html(hourStr)
        })
    </script>
</head>
<body>
    <div align="center">
        <h2>唐城教务管理系统</h2>

    </div>

    <div align="right">
        ${loginUser.nickName}
<a href="${pageContext.request.contextPath}/user/logout" target="_top">退出登录</a>
    </div>
    <div align="left" id="da"></div>
</body>
</html>

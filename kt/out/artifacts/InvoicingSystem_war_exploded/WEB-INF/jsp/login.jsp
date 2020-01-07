<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/12/5
  Time: 22:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#btn").click(function () {

                var userName = $("#userName").val()
                var password = $("#password").val()
                var data = {
                    userName:userName,
                    password:password,
                }
                if(userName == null || userName == ''){
                    alert("用户名不能为空")
                    $("#userName").focus()
                }else if (password == null || password == ''){
                    alert("密码不能为空")
                    $("#password").focus()
                }else{

                   $.post("${pageContext.request.contextPath}/users/loginMsg",data,function (rs) {

                        if (rs.msg == "登录成功"){
                            location.href = "${pageContext.request.contextPath}/users/login?userName="+userName+"&password="+password
                        }else{
                            alert(rs.msg)
                            location.href = "${pageContext.request.contextPath}/users/toLogin"
                        }
                    })
                }
            })
        })
    </script>
</head>
<body>
    <div align="center">
        <p>
            <h2>小型进销存系统</h2>
        </p>
        <form>
            <p>
                用户名：<input type="text" name="userName" id="userName"/>
            </p>
            <p>
                密码：<input type="password" name="password" id="password"/>
            </p>
            <p>
                <input type="button" id="btn" value="登录"/>
            </p>
        </form>
    </div>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/12/2
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            //登录按钮的单击事件
            $("#btn1").click(function () {
                //获取表单中的数据
                var data = $("from").serialize();
                //发起ajax请求
                $.post("${pageContext.request.contextPath}/user/login3",data,function (result) {
                        alert(result.msg);
                });
            });

        })
    </script>
</head>
<body>
    <div align="center">
        <h2>
            登 录
        </h2>
        <form>
            <p>
                用户名：<input type="text" name="userName"/>
            </p>
            <p>
                密码：<input type="password" name="password"/>
            </p>
            <p>
                <input type="button" id="btn1" value="登录"/>
                   <input type="button"  id="btn2" value="登录"/>
            </p>
            <p>
                ${msg2}
            </p>
        </form>
    </div>
</body>
</html>

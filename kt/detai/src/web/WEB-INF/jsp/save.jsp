<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/12/8
  Time: 16:38
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
                var title = $("#title").val()
                //var data = $("form").serialize()
                if(title == null || title == ''){
                    alert("必须填写问题！")
                }else{
                    $.post("${pageContext.request.contextPath}/questions/save",data,function (rs) {
                        alert("添加成功")
                        location.href = "${pageContext.request.contextPath}/questions/query"
                    })

                }
            })
        })
    </script>
</head>
<body>
    <div align="center">
        <p>
            <h2>我要提问</h2>
        </p>
        <p>
            <a href="${pageContext.request.contextPath}/questions/query">返回首页</a>
        </p>
        <form>
            <p>
                问题：<input type="text" name="title" id="title"/>
            </p>
            <p>
                问题描述：
                <textarea name="detailDesc" id="detailDesc" rows="3" cols="15">

                </textarea>
            </p>
            <p>
                <input type="button" id="btn" value="保存问题"/>
            </p>
        </form>
    </div>
    <div align="center">
        ${msg}
    </div>

</body>
</html>

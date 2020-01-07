<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/12/6
  Time: 12:07
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
            $("#btn").click(function () {
                var id = $("#id").val()
                var data = {
                    id:id,
                }
                if(id == 0){
                    alert("请选择商品")
                    $("#id").focus()
                }else{
                    //alert(data)
                    $.post("${pageContext.request.contextPath}/product/query",data,function (rs) {
                        //alert(rs.msg)
                        $("#h").html()
                        $("#h").append(rs.msg)
                    })
                }
            })
        })
    </script>
</head>
<body>
    <div align="center">
            <form action="" method="post">
                <h3>查看库存：</h3>
                    商品名称：
                <select id="id" name="id">
                    <option value="0">--请选择商品--</option>
                    <c:forEach items="${productList}" var="produte">
                        <option value="${produte.id}">${produte.productName}</option>
                    </c:forEach>
                </select>
                <input type="button" id="btn" value="查询"/>

            </form>

    </div>
<div align="center">
    <h2 id="h"></h2>
</div>
</body>
</html>

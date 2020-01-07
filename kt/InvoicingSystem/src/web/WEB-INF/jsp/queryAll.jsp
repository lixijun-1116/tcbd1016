<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/12/6
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("button[name='page']").click(function () {
                var no = $(this).attr("no")
                var str = "${pageContext.request.contextPath}/sale/queryAll?pageNo="+no;
                location.href = str
            })
            $("tr:odd").css("background","lightgray")
        })

    </script>
</head>
<body>
    <div align="center">
        <p><h3>销售信息查询</h3></p>
        <table border="1px" cellpadding="0px" cellspacing="0px">
            <tr align="center">
                <td>ID</td>
                <td>商品</td>
                <td>单价</td>
                <td>数量</td>
                <td>总价</td>
                <td>销售日期</td>
                <td>销售员</td>
            </tr>
            <c:forEach items="${pageInfo.list}" var="sale">
                <tr align="center">
                    <td>${sale.id}</td>
                    <td>${sale.product.productName}</td>
                    <td>${sale.price}</td>
                    <td>${sale.quantity}</td>
                    <td>${sale.totalPrice}</td>
                    <td>
                        <fmt:formatDate value="${sale.saleDate}" pattern="yyyy-MM-dd"/>
                    </td>
                    <td>${sale.users.realName}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <div align="center">
        <p>
            <button name="page" no="${pageInfo.firstPage}">首页</button>
            <button name="page" no="${pageInfo.prePage}">上一页</button>|
            <button name="page" no="${pageInfo.nextPage}">下一页</button>|
            <button name="page" no="${pageInfo.lastPage}">末页</button>
            第${pageInfo.pageNum}页/共${pageInfo.pages}页（${pageInfo.total}条记录）
        </p>
    </div>
</body>
</html>

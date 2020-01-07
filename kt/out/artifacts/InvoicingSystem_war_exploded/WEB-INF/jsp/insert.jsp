<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/12/6
  Time: 9:39
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
                var productId = $("#productId").val()
                var price = $("#price").val()
                var quantity1 = $("#quantity").val()
                var quantity = parseInt(quantity1)
                var date = {
                    productId:productId,
                    price:price,
                    quantity:quantity1
                }
                if(productId == 0){
                    alert("请选择商品")
                    $("#productId").focus()
                }else if (price == null || price == ""){
                    alert("销售单价不能为空")
                    $("#price").focus()
                }else if (quantity == null || quantity == ""){
                    alert("销售数量不能为空")
                    $("#quantity1").focus()
                }else if (isNaN(quantity)){
                    alert("销量必须是数字")
                    $("#quantity1").focus()
                }else{
                    $.post("${pageContext.request.contextPath}/sale/insert",date,function (rs) {
                        alert("添加成功")
                        location.href = "${pageContext.request.contextPath}/product/toSelect"
                    })

                }
            })
        })
    </script>
</head>
<body>
    <div align="center">
        <p>
            <h3>添加销售</h3>
        </p>
        <form action="" method="post" target="main" id="form">
            <p>
                商品名称：
                <select id="productId" name="productId">
                    <option value="0">--请选择商品--</option>
                    <c:forEach items="${productNameList}" var="produte">
                        <option value="${produte.id}">${produte.productName}</option>
                    </c:forEach>
                </select>
            </p>
            <p>
                销售单价：<input type="text" id="price" name="price"/>
            </p>
            <p>
                销售数量：<input type="text" id="quantity" name="quantity"/>
            </p>
            <p>
                <input type="button" id="btn" value="保存"/>
            </p>
        </form>
    </div>
</body>
</html>

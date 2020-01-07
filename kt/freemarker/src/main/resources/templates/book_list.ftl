<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>$Title$</title>
    <script type="text/javascript" src="/static/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("tr:even").css("background","yellow");
        })

    </script>
</head>
<body>
    <div align="center">
        <p>图书数量：${books?size}</p>
        <table>
            <tr>
                <td>id</td>
                <td>图书名称</td>
                <td>价格</td>
                <td>出版日期</td>
                <td>状态</td>
            </tr>
            <#list books as book>
                <tr>
                    <td>${book.id}</td>
                    <td>${book.bookName}</td>
                    <td>${book.price}</td>
                    <td>${book.publishDate?string("yyyy-MM-dd")}</td>
                    <td>
                        <#if book.status==1>
                            已上架
                            <#elseIf book.status==2>
                            已下架
                            <#else >
                            库存不足
                        </#if>
                    </td>
                </tr>
            </#list>

        </table>
    </div>
</body>
</html>
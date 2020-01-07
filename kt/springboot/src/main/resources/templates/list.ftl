<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>$Title$</title>
    <script type="text/javascript" src="jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            //分页按钮单击
            $("button[name='page']").click(function () {
                //获取分页页码，当前按钮no属性值
                var no = $(this).attr("no");

                //查询请求
                var str = "/main?pageNum="+no;
                //alert(str)
                location.href = str;
            })
        })
    </script>
</head>
<body>
    <div align="center">
        <table align="center">
            <thead>
            <tr>
                <td>类别</td>
                <td>品种</td>
                <td>场地</td>
                <td>总重量(公斤)</td>
                <td>单价(元/公斤)</td>
                <td>操作</td>
            </tr>
            </thead>
            <tbody>
            <#list pageInfo.list as list>
                <tr>
                    <td>${list.type}</td>
                    <td>${list.breed}</td>
                    <td>${list.area}</td>
                    <td>${list.weight}</td>
                    <td>${list.price}</td>
                </tr>
            </#list>
            </tbody>
        </table>
    </div>
    <div align="center">
        <button  name="page" no="${pageInfo.navigateFirstPage}">首页</button>
        <button  name="page" no="${pageInfo.prePage}">上一页</button>
        <#list pageInfo.navigatepageNums as pa>
            <button  name="page" no="${pa}">${pa}</button>
        </#list>
        <button  name="page" no="${pageInfo.nextPage}">下一页</button>
        <button  name="page" no="${pageInfo.navigateLastPage}">末页</button>
        [
        ${pageInfo.pageNum}
        /
        ${pageInfo.pages}
        ]
        共${pageInfo.total}条记录

    </div>
</body>
</html>
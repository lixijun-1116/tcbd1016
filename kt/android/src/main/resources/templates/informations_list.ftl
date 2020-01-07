<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>$Title$</title>
    <script type="text/javascript" src="jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $(function () {

                $("button[name='page']").click(function () {

                    var no = $(this).attr("no");

                    //查询请求
                    var str = "/queryAll?pageNum="+no;
                    //alert(str)
                    location.href = str;
                })
            })
            $("tr:even").css("background","greenyellow")
        })
    </script>
</head>
<body>
    <div align="center">
        <h2>手机资讯</h2>
        <table border="1px" cellspacing="0" cellpadding="0">
            <tr align="center" style="background: darkgrey">
                <td>序号</td>
                <td>标题</td>
                <td>回复/查看</td>
                <td>发表时间</td>
                <td>最新回复</td>
            </tr>
            <#list pageInfo.list as info>
                <tr align="center">
                    <td>${info.id}</td>
                    <td><a href="/queryById?id=${info.id}">${info.title}</a></td>
                    <td>${info.replyCount}/${info.viewCount}</td>
                    <td>${info.reportTime?string("yyyy-MM-dd HH:mm:ss")}</td>
                    <td>${info.lastPostTime?string("yyyy-MM-dd HH:mm:ss")}</td>
                </tr>
            </#list>
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
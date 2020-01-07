<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/12/5
  Time: 9:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#logout").click(function () {
                location.href = "${pageContext.request.contextPath}/user/logout"
            })
            //分页按钮单击
            $("button[name='page']").click(function () {
                //获取分页页码，当前按钮no属性值
                var no = $(this).attr("no");
                //获取查询条件（班级名称）
                var data = $("form").serialize();
                //查询请求
                var str = "${pageContext.request.contextPath}/grade/queryGradeByGradeNamePaiXu?"+data+"&pageNo="+no;
                //alert(str)
                location.href = str;
            })
            $("tr:odd").css("background","yellow")
            var colName = "${colName}"
            if(colName != null && colName != ""){
                $("select").val(colName)
            }

        })
    </script>
   <%-- <script type="text/javascript">
        $(function () {
            $("#query").click(function () {
                alert("abc");
                var data = $("#formQuery").serialize();
                $.post("${pageContext.request.contextPath}/grade/queryByAjax", data, function (result) {
                    console.log(result);
                    $("#gradeList").html("");

                    /* $.each(result.result, function (index, value) {
                         var str1 = "";
                       /!*  alert("班级id：" + value.id);
                         alert("班级名称：" + value.gradeName);
                         alert("创建日期：" + value.createDate);
                         alert("班级描述：" + value.details);*!/
                         str1 = "<tr>" +
                             "<td>" + value.id + "</td>" +
                             "<td>" + value.gradeName + "</td>" +
                             "<td>" + value.createDate + "</td>" +
                             "<td>" + value.details + "</td>" +
                             "</tr>";

                         $("#gradeList").append(str1);
                      /!*   var str2 = " <tr><td>92</td><td>tcmp092</td><td>1519747200000</td><td>测试班级的描述</td></tr>"
                         $("#gradeList").append(str2);
                         $("#gradeList").append("asdfasfdasdfadfasfdasfasdfasdfasdf");*!/
                         //return false;
                     })*/


                    for (var i = 0; i < result.result.length; i++) {
                        var str1 = "";
                        str1 = "<tr>" + i +
                            "<td>" + result.result[i].id + "</td>" +
                            "<td>" + result.result[i].gradeName + "</td>" +
                            "<td>" + result.result[i].createDate + "</td>" +
                            "<td>" + result.result[i].details + "</td>" +
                            "</tr>";
                        $("#gradeList").append(str1);
                    }
                })
            })
        })
    </script>--%>
</head>
<body>
    <div align="center">
        欢迎：${sessionScope.loginUser.nickName}
        <form action="${pageContext.request.contextPath}/grade/queryGradeByGradeNamePaiXu">
            <p>
                <h3>班级管理</h3>
            </p>
            <p>
                请输入班级名称：<input type="text" name="gradeName" value="${gradeName}"/>
                排序：
                <select name="colName" id="colName">
                    <option value="">--请选择排序方式--</option>
                    <option value="id">班级id</option>
                    <option value="grade_name">班级名称</option>
                    <option value="create_date">班级创建时间</option>
                </select>
                <input type="submit" value="查询"/>
                <a href="${pageContext.request.contextPath}/grade/toSave">添加班级</a>
                <input type="button" id="logout" value="退出"/>
            </p>
        </form>
    </div>
    <div align="center">
        <table border="1px" cellspacing="0px" cellpadding="0px">
            <tr align="center">
                <td>班级id</td>
                <td>班级名称</td>
                <td>班级创建时间</td>
                <td>操作</td>
            </tr>
            <c:forEach items="${pageInfo.list}" var="grade">
                <tr align="center">
                    <td>${grade.id}</td>
                    <td>
                        <a>${grade.gradeName}</a>
                    </td>
                    <td>
                        <fmt:formatDate value="${grade.createDate}" pattern="yyyy-MM-dd"></fmt:formatDate>
                    </td>
                    <td>
                        <button>详情</button>
                        <button>修改</button>
                        <button>删除</button>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <div align="center">
        <p>
            [${pageInfo.pageNum}/${pageInfo.pages}]共${pageInfo.total}条数据
            <button name="page" no="${pageInfo.firstPage}">首页</button>
            <button name="page" no="${pageInfo.prePage}">上一页</button>
            <button name="page" no="${pageInfo.nextPage}">下一页</button>
            <button name="page" no="${pageInfo.lastPage}">末页</button>
        </p>
    </div>
    <div align="center">
        <p>
            ${msg}
        </p>
    </div>
</body>
</html>

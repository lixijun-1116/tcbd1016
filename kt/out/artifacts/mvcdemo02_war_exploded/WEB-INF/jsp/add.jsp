<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/12/3
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
                //alert(1)
            $("#btn").click(function () {
                //alert(2)
                var data = $("form").serialize()
                alert(data)
                $.post("${pageContext.request.contextPath}/meetingRoom/addSuccess",data,function (result) {
                    alert(result.msg);
                    window.location.href="${pageContext.request.contextPath}/meetingRoom/queryAll"
                })
            })
        })
    </script>
</head>
<body>
    <div align="center">
        <form>
            <table>
                <tr>
                    <td colspan="2">会议室预定</td>
                </tr>
                <tr>
                    <td>会议室</td>
                    <td>
                        <select name="meetingName">
                            <option id="a">${map.a}</option>
                            <option id="b">${map.b}</option>
                            <option id="c">${map.c}</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>申请人</td>
                    <td>
                        <input type="text" name="advanceName"/>
                    </td>
                </tr>
                <tr>
                    <td>预定时间</td>
                    <td><input type="text" name="meetingOrder"/>日期格式yyyy-MM-dd</td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="button" id="btn" value="申请"/>
                        <input type="reset" value="重置"/>
                    </td>

                </tr>
            </table>
        </form>
    </div>
</body>
</html>

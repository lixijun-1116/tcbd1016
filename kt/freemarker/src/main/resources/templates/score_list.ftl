<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>$Title$</title>
</head>
<body>
    <div align="center">
        <h2>成绩列表</h2>
        <table border="1px" cellpadding="0" cellspacing="0">
            <tr>
                <td>ID</td>
                <td>学号</td>
                <td>姓名</td>
                <td>科目</td>
                <td>成绩</td>
            </tr>
            <#list score_list as score>
                <tr>
                    <td>${score.id}</td>
                    <td>${score.student_num}</td>
                    <td>${score.student_name}</td>
                    <td>${score.course_name}</td>
                    <td>${score.score}</td>
                </tr>
            </#list>

        </table>
    </div>
</body>
</html>
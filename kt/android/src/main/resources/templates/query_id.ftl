<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>$Title$</title>
    <script type="text/javascript" src="jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#btn").click(function () {
                var content = $("#content").val()
                if(content == null || content == "" ){
                    alert("回复内容必填且不能多于 200字")
                    $("#cha").text("请填写回复内容!!!")
                }else{
                    var id = ${informations.id};
                    var replyCount = ${informations.replyCount};
                    var data = {
                        id :id,
                        replyCount : replyCount,

                        content :content,



                    }
                    $.post("/replies/insert",data,function (rs) {
                        if (rs == "success"){
                            location.href = "/queryById?id="+id
                            //location.href = "/queryAll"
                        }
                    },"text")
                }

            })

        })
    </script>
</head>
<body>
    <div>
        <h2>${informations.title}</h2>
        <p>
            发表于：${informations.reportTime?string("yyyy-MM-dd HH:mm:ss")}
        </p>
        <p>
            ${informations.content}
        </p>
        <p>
            <h3>读者回应</h3>
        </p>
        <#list informations.repliesList as replies>
            <p style="background-color: darkgrey">
                发表于：${replies.replyTime?string("yyyy-MM-dd HH:mm:ss")}<br>
                ${replies.content}
            </p>
        </#list>

        <form>
            <p>
                快速回复（字数200字以内）：<br>
                <textarea cols="15" rows="3" name="content" id="content"></textarea><span id="cha" style="color: red"></span>
            </p>
            <input type="button" id="btn" value="提交"/>
            <a href="/queryAll">返回首页</a>
        </form>
    </div>
</body>
</html>
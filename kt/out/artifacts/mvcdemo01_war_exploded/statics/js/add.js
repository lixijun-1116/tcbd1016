$(function () {
    let $url = "";
    $.post('statics/static/serverconfig.json', function (responseText, textStatus) {
        switch (textStatus) {
            case 'success':
                $url = responseText.protocol + responseText.domain + responseText.port + responseText.context;
                break;
            case 'error':
                alert("走丢了")

                break;
            default:
                break;
        }
    });

    $("#gameName").focus(function () {
        $("#checkmsg").text()
    })
    $("#gameName").blur(function () {
        $("#checkmsg").text()
    })
    $("#gameName").keyup(function () {
        $.ajax({
            type: "post",
            url: $url + "/game/checkmsg",
            dataType: "json",
            data:{gameName:$("#gameName").val()},
            success:function(rs){
                if (rs=="1"){
                    $("#checkmsg").text("名称已存在，请重新输入")
                    $("#btn02").attr('disabled',true)
                }else{
                    $("#checkmsg").text("名称可以使用")
                    $("#btn02").attr('disabled',false)
                }

            },
            error:function(){
                alert("服务器起飞了")
            }
        })
    })
    $("#btn02").click(function () {
        var data = $("from").serialize()
        $.post($url + "/game/add",data,function (result) {
            alert(result);
            if (result == "addSuccess"){
                window.location.href = $url + "/game/" + result
            }
        })
    });
})
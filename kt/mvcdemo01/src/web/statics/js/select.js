$(function () {
    let $url = "";
    $.get('statics/static/serverconfig.json', function (responseText, textStatus) {
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

    $("#btn01").click(function () {
        var gameName= $("#gameName").val();
        var gameType= $("#gameType").val();
        var gameCompany= $("#gameCompany").val();
        var gameYear = $("#gameYear").val()
        var data = $("form").serialize()
        alert(gameYear)
        if (gameYear>9999||gameYear<1000){
            alert("发行年份应为四位数，请重新输入")
        }else{
            $.post($url + "/game/select",data,function (result) {
                alert(result);
                if (result == "selectSuccess"){

                    window.location.href = $url + "/game/" + result
                }
            })
        }

    });
})
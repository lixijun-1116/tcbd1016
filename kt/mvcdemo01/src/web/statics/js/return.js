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

    $("#btn").click(function () {
        window.location.href = $url + "/game/toGame"
    });
})
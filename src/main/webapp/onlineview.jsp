<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>在线预览</title>
    <link rel="stylesheet" href="${APP_PATH}/lib//layui/css/layui.css" media="all">
    <link rel="stylesheet" href="${APP_PATH}/css/zui.min.css">
    <link rel="stylesheet" href="${APP_PATH}/css/style.css">
    <link rel="stylesheet" href="https://www.bootcss.com/p/buttons/css/buttons.css">
    <style type="text/css">
        html,body {
            height: 100%;
            width:100%
        }
    </style>

</head>
<div class="layui-row">
    <div class="layui-col-md-offset1 layui-col-md10">
        <div id="handout_wrap_inner" ></div>
    </div>
</div>

<script src="${APP_PATH}/js/jquery.min.js"></script>
<script src="${APP_PATH}/lib/layui/layui.js"></script>
<script src="${APP_PATH}/js/zui.min.js"></script>
<script src="${APP_PATH}/js/jquery.media.js"></script>
<script>
    var filename;
    (function ($) {
        $.getUrlParam = function (name) {
            var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
            var r = window.location.search.substr(1).match(reg);
            if (r != null) return unescape(r[2]);
            return null;
        }
    })(jQuery);
    $.ajax({
        url:"view/file?fileid="+ $.getUrlParam('fileid'),
        success:function (re) {
            if(re.result === "200"){
                filename = re.url;
                $('#handout_wrap_inner').media({
                    autoplay: true,
                    height: '650px',
                    width:'100%',
                    src:'${APP_PATH}/view-files/'+re.url
                });
            }else{
                showMsg(re.maessage,"danger");
            }
        }
    });


    //悬浮消息
    function showMsg(msg, mtype) {
        //mmtype:'primary'|'success'|'info'|'warning'|'danger'|'important'|'special'
        new $.zui.Messager(msg, {
            type: mtype // 定义颜色主题
        }).show();
    }
</script>
</body>
</html>
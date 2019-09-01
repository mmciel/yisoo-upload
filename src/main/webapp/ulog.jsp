<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>提交日志</title>
    <link rel="stylesheet" href="${APP_PATH}/lib//layui/css/layui.css" media="all">
    <link rel="stylesheet" href="${APP_PATH}/css/zui.min.css">
    <link rel="stylesheet" href="${APP_PATH}/css/style.css">
    <link rel="stylesheet" href="${APP_PATH }/css/buttons.min.css">
<%--    <link rel="stylesheet" href="https://www.bootcss.com/p/buttons/css/buttons.css">--%>


</head>
<body>
<div class="layui-carousel" id="test1">
    <div carousel-item>
        <div class="upload_main_bg00 ">
            <nav class="navbar " role="navigation">
                <div class="container-fluid">
                    <!-- 导航头部 -->
                    <div class="navbar-header">
                        <!-- 移动设备上的导航切换按钮 -->
                        <button type="button" class="navbar-toggle" data-toggle="collapse"
                                data-target=".navbar-collapse-example">
                            <span class="sr-only">切换导航</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <!-- 品牌名称或logo -->
                        <a class="navbar-brand" href="index.jsp">YiSoo</a>
                    </div>
                    <!-- 导航项目 -->
                    <div class="collapse navbar-collapse navbar-collapse-example ">
                        <!-- 一般导航项目 -->
                        <ul class="nav navbar-nav nav-secondary ">
                            <li><a href="index.jsp">主页</a></li>
                            <li class="active"><a href="#">文件采集</a></li>
                            <li><a href="air.jsp">文件空投</a></li>
                            <li><a href="update.jsp">系统更新</a></li>
                            <li><a href="https://github.com/mmciel/yisoo-upload">开源项目</a></li>
                            <li><a href="about.jsp">关于YiSoo</a></li>
                        </ul>
                        <ul class="nav navbar-nav nav-secondary navbar-right">
                            <li><a href="" id="btnUpload">文件上传</a></li>
                            <li class="active"><a href="" id="btnLog">提交日志</a></li>
                            <li ><a href="" id="btnSolve">快捷管理</a></li>
                        </ul>
                    </div><!-- END .navbar-collapse -->
                </div>
            </nav>
            <div>
                <div class="layui-row">
                    <div class="layui-col-md-offset1 layui-col-md10">
                        <br>
                        <span id="pTitle" style="font-size: 30px;"></span>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <i class="layui-icon">&#xe60e;</i>&nbsp;<span id="StartToEndTimeSpan"></span>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <i class="layui-icon">&#xe66f;</i>&nbsp;<span id="NameSpan"></span>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <i class="layui-icon">&#xe770;</i>&nbsp;<span id="GroupSpan"></span>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <hr>
                    </div>
                </div>
                <div class="layui-row">
                    <div class="layui-col-md-offset1 layui-col-md10">
                        <table class="layui-hide" id="uploadLogTable" lay-filter="logFilter"></table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script type="text/html" id="toolbarLog">
    <div class="layui-btn-container">
        <button class="layui-btn layui-btn-sm" lay-event="LogRecard">最近提交</button>
        <button class="layui-btn layui-btn-sm" lay-event="reLogRecard">未提交</button>
        <button class="layui-btn layui-btn-sm" lay-event="allLogRecard">全部提交</button>
    </div>
</script>
<script type="text/html" id="barSolve">
    <a class="layui-btn layui-btn-xs layui-btn-primary" lay-event="downUpload">下载文件</a>
    <a class="layui-btn layui-btn-xs " lay-event="modUpload">修改提交</a>
    <a class="layui-btn layui-btn-xs layui-btn-danger" lay-event="delUpload">删除记录</a>
</script>
<script src="${APP_PATH}/js/jquery.min.js"></script>
<script src="${APP_PATH}/lib/layui/layui.js"></script>
<script src="${APP_PATH}/js/zui.min.js"></script>
<script>

    var pdata;//项目数据
    var gdata;//组数据
    var udata;//提交数据
    var loginflag={
        flag:"-1",
        yisooid:"-1",
        userid:"-1",
        username:"-1"
    };
    //页面必要数据初始化
    (function ($) {
        $.getUrlParam = function (name) {
            var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
            var r = window.location.search.substr(1).match(reg);
            if (r != null) return unescape(r[2]);
            return null;
        }
    })(jQuery);
    //获取项目ID
    var projectid = $.getUrlParam('projectid');
    //初始化右边栏
    $('#btnLog').attr('href','./ulog.jsp?projectid='+projectid);
    $('#btnSolve').attr('href','./usolve.jsp?projectid='+projectid);
    $('#btnUpload').attr('href','./ushow.jsp?projectid='+projectid);
    //获取项目数据
    $.ajax({
        url: "show/init" + "?projectid=" + projectid,
        async: false,
        success: function (re) {
            pdata = re.data;
            gdata = re.groups;
            if (re.result === "200") {
                //初始化成功
                console.log(re);
            } else {
                //初始化异常
                showMsg(re.message, "warning");
            }
            //渲染页面：
            //    渲染标题 时间
            initTitleAndTime(pdata);
            //    渲染作者
            initAdmin(pdata.yisooId);
            //    渲染组别
            initGroup(pdata.yisooId,pdata.pGroupId);

        }
    });
    //悬浮消息
    function showMsg(msg, mtype) {
        //mmtype:'primary'|'success'|'info'|'warning'|'danger'|'important'|'special'
        new $.zui.Messager(msg, {
            type: mtype // 定义颜色主题
        }).show();
    }

    function initTitleAndTime(data) {
        $("#pTitle").text(data.pTitle);
        var str = currentTimeChangeStr(data.startTime) + " ~ " + currentTimeChangeStr(data.endTime);
        $("#StartToEndTimeSpan").text(str);
    }
    function initAdmin(data) {
        $.ajax({
            url:"get/user"+"?yisooid="+data,
            async:false,
            success:function (re) {

                if(re.result === 200){
                    $("#NameSpan").text(re.username);
                }
            }
        });
    }
    function initGroup(yisooid,groupid) {
        $.ajax({
            url:"group/get/data"+"?groupid="+groupid+"&yisooid="+yisooid,
            async:false,
            success:function (re) {
                if(re.result === "200"){
                    // console.log(re);
                    $("#GroupSpan").text(re.groupData.gName);
                }
            }
        });
    }

    //把时间转成字符串
    function currentTimeChangeStr(timestamp) {
        //获取当前时间
        var now = new Date(timestamp);
        //获取当前时间的年份
        var yy = now.getFullYear();      //年
        //获取当前时间的月份
        var mm = now.getMonth() + 1;     //月
        //获取当前时间的日期
        var dd = now.getDate();          //日
        //获取当前时间的小时
        var hh = now.getHours();         //时
        //获取当前时间的分
        var ii = now.getMinutes();       //分
        //获取当前时间的秒
        var ss = now.getSeconds();       //秒
        //把上述的时间转成字符串
        var clock = yy + "-";
        if (mm < 10) clock += "0";
        clock += mm + "-";
        if (dd < 10) clock += "0";
        clock += dd + " ";
        if (hh < 10) clock += "0";
        clock += hh + ":";
        if (ii < 10) clock += '0';
        clock += ii + ":";
        if (ss < 10) clock += '0';
        clock += ss;
        return clock;
    }
</script>
<script>
    layui.use(['carousel', 'layer','table'], function () {
        var carousel = layui.carousel
            , layer = layui.layer
            , table = layui.table;
        //建造实例
        carousel.render({
            elem: '#test1'
            , full: true
            , indicator: "none"
            , autoplay: false
            , arrow: 'none'
        });

        var upload_log_table = table.render({
            elem: '#uploadLogTable'
            , url: 'data/upload/log' + '?projectid=' + projectid
            , toolbar: '#toolbarLog'
            , title: '用户数据表'
            , cols: [[
                {field: 'uploadId', title: '提交ID', width: '10%',align:"center", sort: true}
                , {field: 'gNumber', title: '编号', width: '15%',align:"center", sort: true}
                , {field: 'gName', title: '姓名', width: '10%'}
                , {field: 'uploadTime', title: '提交时间', width: '20%',align:"center", sort: true,
                    templet: function (d) {
                        return  currentTimeChangeStr(d.uploadTime);
                    }
                }
                , {field: 'uploadIp', title: '提交地址',align:"center", width: '13%'}
                , {field: 'uploadStatus', title: '处理结果',align:"center", width: '12%',
                    templet: function (d) {
                        return  ' <span class="layui-badge layui-bg-blue">正常提交</span>';
                    }
                }
                , { fixed: 'right',title: '操作', toolbar: '#barSolve'}
            ]]
            , page: {
                limit:9
                ,limits:[9, 20, 30, 40, 50]
            }
        });
        table.on('tool(logFilter)', function (obj) {
            showMsg("权限不足！", "danger");
        });
        table.on('toolbar(logFilter)', function (obj) {
            switch (obj.event) {
                case 'LogRecard':
                    showMsg("权限不足！", "danger");
                    break;
                case 'reLogRecard':
                    showMsg("权限不足！", "danger");
                    break;
                case 'allLogRecard':
                    showMsg("权限不足！", "danger");
                    break;
            }
        });
    });
</script>
</body>
</html>
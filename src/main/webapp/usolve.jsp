<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>提交</title>
    <link rel="stylesheet" href="${APP_PATH}/lib//layui/css/layui.css" media="all">
    <link rel="stylesheet" href="${APP_PATH}/css/zui.min.css">
    <link rel="stylesheet" href="${APP_PATH}/css/style.css">
    <link rel="stylesheet" href="https://www.bootcss.com/p/buttons/css/buttons.css">

    <style>
        .box {
            width: 300px;
            padding: 40px;
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            background: #191919;
            text-align: center;
        }
        .box h1 {
            color: white;
            text-transform: uppercase;
            font-weight: 500;
        }
        .box input[type='text'],
        .box input[type='password'] {
            border: 0;
            background: none;
            display: block;
            margin: 20px auto;
            text-align: center;
            border: 2px solid #3498db;
            padding: 14px 10px;
            width: 200px;
            outline: none;
            color: white;
            border-radius: 24px;
            transition: 0.25s;
        }
        .box input[type='text']:focus,
        .box input[type='password']:focus {
            width: 280px;
            border-color: #2ecc71;
        }
        .submit {
            border: 0;
            background: none;
            margin: 20px auto;
            margin-top: 0;
            display: inline-block;
            text-align: center;
            border: 2px solid #3498db;
            padding: 10px 40px;
            outline: none;
            color: white;
            border-radius: 24px;
            transition: 0.25s;
            cursor: pointer;
            text-decoration: none;
            font-size: 12px;
        }
        .submit:hover {
            background: #2ecc71;
            border-color: #2ecc71;
        }
    </style>
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
                        <a class="navbar-brand" href="#">YiSoo</a>
                    </div>
                    <!-- 导航项目 -->
                    <div class="collapse navbar-collapse navbar-collapse-example ">
                        <!-- 一般导航项目 -->
                        <ul class="nav navbar-nav nav-secondary ">
                            <li><a href="#">主页</a></li>
                            <li class="active"><a href="#">文件采集</a></li>
                            <li><a href="#">文件空投</a></li>
                            <li><a href="#">系统更新</a></li>
                            <li><a href="#">开源项目</a></li>
                            <li><a href="#">关于YiSoo</a></li>
                        </ul>
                        <ul class="nav navbar-nav nav-secondary navbar-right">
                            <li><a href="" id="btnUpload">文件上传</a></li>
                            <li><a href="" id="btnLog">提交日志</a></li>
                            <li class="active"><a href="" id="btnSolve">快捷管理</a></li>
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
                        <%--                        <i class="layui-icon">&#xe672;</i>&nbsp;<a class="layui-badge" id="SolveAdmin" style="text-decoration: none">未登录</a>--%>
                        <button class="layui-btn layui-btn-xs layui-btn-danger" id="SolveAdmin"><i class="layui-icon">&#xe672;</i>&nbsp;<span>未登录</span></button>
                        <%--                        layui-btn-normal--%>
                        <hr>
                    </div>
                </div>
                <div class="layui-row">
                    <div class="layui-col-md-offset1 layui-col-md10">
                        <table class="layui-hide" id="uploadLogTable" lay-filter="solveFilter"></table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script type="text/html" id="toolbarSolve">
    <div class="layui-btn-container">
        <button class="layui-btn layui-btn-sm" lay-event="chooseRecard">下载选中</button>
        <button class="layui-btn layui-btn-sm" lay-event="allchooseRecard">全部下载</button>
        <button class="layui-btn layui-btn-sm" lay-event="emailRecard">发送至邮箱</button>
        <button class="layui-btn layui-btn-sm" lay-event="allemailRecard">全部发送至邮箱</button>
    </div>
</script>
<script type="text/html" id="barSolve">
    <a class="layui-btn layui-btn-xs layui-btn-warm" lay-event="oneDown">单独下载</a>
    <a class="layui-btn layui-btn-xs layui-btn-normal" lay-event="oneview">在线预览</a>
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
    //格式化文件大小
    function renderSize(value){
        if(null==value||value===''){
            return "0 Bytes";
        }
        var unitArr = ["Bytes","KB","MB","GB","TB","PB","EB","ZB","YB"];
        var index=0;
        var srcsize = parseFloat(value);
        index=Math.floor(Math.log(srcsize)/Math.log(1024));
        var size =srcsize/Math.pow(1024,index);
        size=size.toFixed(2);//保留的小数位数
        return size+unitArr[index];
    }
    $("#SolveAdmin").click(function () {

alert("SDa")
    });
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
            , url: 'data/upload/solve' + '?projectid=' + projectid
            , toolbar: '#toolbarSolve'
            , title: '用户数据表'
            // , skin: 'line'
            , even: true
            , cols: [[
                {type: 'checkbox', width: '5%',align:"center"}
                , {field: 'fileId', title: '文件ID', width: '7%',align:"center", sort: true}
                , {field: 'gNumber', title: '编号', width: '15%',align:"center", sort: true}
                , {field: 'gName', title: '姓名', width: '8%'}
                , {field: 'fileCreate', title: '提交时间', width: '20%',align:"center", sort: true,
                    templet: function (d) {
                        return  currentTimeChangeStr(d.fileCreate);
                    }
                }
                , {field: 'fileName', title: '文件名', width: '18%'}
                , {field: 'fileSize', title: '文件大小',align:"center", width: '12%',
                    templet: function (d) {
                        return  renderSize(d.fileSize);
                        // return  ' <span class="layui-badge layui-bg-blue">正常提交</span>';
                    }
                }
                , { fixed: 'right',title: '操作', toolbar: '#barSolve',align:"center"}
            ]]
            , page: {
                limit:9
                ,limits:[9, 20, 30, 40, 50]
            }
        });
        table.on('tool(solveFilter)', function (obj) {
            //未登录
            if(loginflag.flag !== "-1"){
                showMsg("权限不足！请先登录！", "danger");
            }else{
                var data = obj.data;
                console.log(obj)
                if(obj.event === 'oneDown'){
                //    单独下载
                    $.ajax({
                        url:"solve/one/down"
                        , type:"post"
                        , data:{
                            "projectid":projectid,
                            "fileid":data.fileId
                        }
                        , success:function (re) {
                            console.log(re);
                        }
                    });
                } else if(obj.event === 'oneView'){
                //    在线预览
                    showMsg("敬请期待", "info");
                    //     $.ajax({
                //         url:"solve/one/view"
                //         , type:"post"
                //         , data:{
                //             "projectid":projectid,
                //             "fileid":data.fileId
                //         }
                //         , success:function (re) {
                //             console.log(re);
                //         }
                //     });
                }
            }
        });
        table.on('toolbar(solveFilter)', function (obj) {
            //未登录
            if(loginflag.flag !== "-1"){
                showMsg("权限不足！请先登录！", "danger");
            }else {
                var checkStatus = table.checkStatus(obj.config.id);
                console.log(checkStatus);
                switch (obj.event) {
                    case 'chooseRecard':
                        //下载选中
                        break;
                    case 'emailRecard':
                        //发送至邮箱
                        break;
                    case 'allemailRecard':
                        //全部发送至邮箱
                        break;
                    case 'allchooseRecard':
                        //全部下载
                        break;
                }
            }
        });
    });
</script>
</body>
</html>
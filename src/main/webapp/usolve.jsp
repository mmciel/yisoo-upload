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
        .biu{
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
        .biu:focus {
            width: 280px;
            border-color: #2ecc71;
        }
        .submit {
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
        username:"-1",
        email:"-1"
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
        if (loginflag.flag === "1"){
            showMsg("您已经登录啦~","success");
            return ;
        }
        var indexlayer = layer.open({
            type: 1
            ,title: false //不显示标题栏
            ,closeBtn: false
            ,shadeClose:true
            ,area: ['400px', '375px']
            ,shade: 0.7
            ,anim: 2
            ,resize:false
            ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
            ,moveType: 1
            ,content:'<div style="height: 375px; padding: 40px; width: 400px;text-align: center;  line-height: 22px; background-color: #393D49;">' +
                '<h1 style="color: white;text-transform: uppercase;font-weight: 500;">快速登录YiSoo管理员</h1></br>' +
                '<input type="text" id="un" class="biu" placeholder="Username" /><input type="password" id="pw" class="biu" placeholder="Password" />' +
                '<button class="submit" id="loginbtn">一键登录</button></div>'
        });
        $("#loginbtn").click(function () {
            if($("#un").val() === "" || $("#pw").val() === ""){
                showMsg("请先输入~","warning");
                return false;
            }
            $.ajax({
                url:"user/login",
                type:"post",
                data:{
                    "userid":$("#un").val(),
                    "password":$("#pw").val(),
                },
                success:function (re){
                    if(re.result === 200){
                        // 登录成功
                        // console.log(re);
                        loginflag.flag = "1";
                        loginflag.yisooid = re.yisooId;
                        loginflag.userid = re.userId;
                        loginflag.username = re.username;
                        loginflag.email = re.email;
                        $("#SolveAdmin").text(loginflag.username);
                        $("#SolveAdmin").removeClass("layui-btn-danger");
                        $("#SolveAdmin").removeClass("layui-btn-normal");
                        showMsg("登录成功","success");
                        layer.closeAll('page');
                    }else{
                        // 登录失败
                        // window.location.href="#";
                        showMsg("登录失败","danger");
                        layer.closeAll('page');
                    }
                }
            });
        });
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
            if(loginflag.flag === "-1"){
                showMsg("权限不足！请先登录！", "danger");
            }else{
                var data = obj.data;
                console.log(obj)
                if(obj.event === 'oneDown'){
                //    单独下载
                    $.ajax({
                        url:"down/solve/one"
                        , type:"post"
                        , data:{
                            "projectid":projectid,
                            "yisooid":loginflag.yisooid,
                            "fileid":data.fileId
                        }
                        // ,async: false
                        ,beforeSend: function(){
                            layer.open({
                                type: 3
                            });
                        }
                        , success:function (re) {
                            layer.closeAll('loading');
                            window.open(re.url);
                            console.log(re);
                        }
                    });
                } else if(obj.event === 'oneView'){
                //    在线预览
                    showMsg("敬请期待", "info");
                }
            }
        });
        table.on('toolbar(solveFilter)', function (obj) {
            //未登录
            if(loginflag.flag === "-1"){
                showMsg("权限不足！请先登录！", "danger");
            }else {
                var checkStatus = table.checkStatus(obj.config.id).data;
                var ids = [];
                for(var i=0;i<checkStatus.length;i++){
                    ids.push(checkStatus[i].fileId);
                }
                // console.log(ids);
                switch (obj.event) {
                    case 'chooseRecard':
                        //下载选中
                        $.ajax({
                            url:"down/solve/part"
                            , type:"post"
                            , data:{
                                "projectid":projectid,
                                "yisooid":loginflag.yisooid,
                                "ids":ids
                            }
                            // ,async: false
                            ,beforeSend: function(){
                                layer.open({
                                    type: 3
                                });
                            }
                            , success:function (re) {
                                layer.closeAll('loading');
                                window.open(re.url);
                                console.log(re);
                            }
                        });
                        break;
                    case 'emailRecard':
                        //发送至邮箱
                        $.ajax({
                            url:"down/solve/part"
                            , type:"post"
                            , data:{
                                "projectid":projectid,
                                "yisooid":loginflag.yisooid,
                                "ids":ids
                            }
                            // ,async: false
                            ,beforeSend: function(){
                                layer.open({
                                    type: 3
                                });
                            }
                            , success:function (re) {
                                layer.closeAll('loading');
                                // console.log(re);
                                $.ajax({
                                    url:"down/email?downid="+re.type+"&type=part"
                                });
                                showMsg("稍后请查看邮箱~","info");
                            }
                        });
                        break;
                    case 'allemailRecard':
                        //全部发送至邮箱
                        $.ajax({
                            url:"down/solve/all"
                            , type:"post"
                            , data:{
                                "projectid":projectid,
                                "yisooid":loginflag.yisooid
                            }
                            // ,async: false
                            ,beforeSend: function(){
                                layer.open({
                                    type: 3
                                });
                            }
                            , success:function (re) {
                                layer.closeAll('loading');
                                // console.log(re);
                                $.ajax({
                                    url:"down/email?downid="+re.type+"&type=part"
                                });
                                showMsg("稍后请查看邮箱~","info");
                            }
                        });
                        break;
                    case 'allchooseRecard':
                        //全部下载
                        $.ajax({
                            url:"down/solve/all"
                            , type:"post"
                            , data:{
                                "projectid":projectid,
                                "yisooid":loginflag.yisooid
                            }
                            // ,async: false
                            ,beforeSend: function(){
                                layer.open({
                                    type: 3
                                });
                            }
                            , success:function (re) {
                                layer.closeAll('loading');
                                window.open(re.url);
                                console.log(re);
                            }
                        });
                        break;
                }
            }
        });
    });
</script>
</body>
</html>
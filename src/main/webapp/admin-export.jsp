<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>提交</title>
    <link rel="stylesheet" href="${APP_PATH}/lib/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="${APP_PATH}/css/zui.min.css">
    <link rel="stylesheet" href="${APP_PATH}/css/style.css">
<%--    <link rel="stylesheet" href="https://www.bootcss.com/p/buttons/css/buttons.css">--%>
</head>
<body>

<div class="layui-row">
    <div class="layui-col-md12">
        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
            <legend>项目内容选择</legend>
        </fieldset>
    </div>
</div>
<div class="layui-row">
    <form class="layui-form layui-form-pane">
        <div class="layui-col-md-offset1 layui-col-md6">
            <div class="layui-form-item">
                <label class="layui-form-label">项目名称</label>
                <div class="layui-input-block">
                    <select id="projectSelect" lay-filter="">
                    </select>
                </div>
            </div>
        </div>
    </form>
</div>
<div class="layui-row">
    <div class="layui-col-md12">
        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
            <legend>有效文件</legend>
        </fieldset>
    </div>
</div>
<div class="layui-row">
    <div class="layui-col-md-offset1 layui-col-md6">
        <div class="layui-progress layui-progress-big" lay-filter="demo" lay-showPercent="true">
            <div class="layui-progress-bar" id="projectProgess" lay-percent="0%"></div>
        </div>
    </div>
</div>

<div class="layui-row">
    <div class="layui-col-md12">
        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
            <legend>文件详览</legend>
        </fieldset>
    </div>
</div>
<div class="layui-row">
    <div class="layui-col-md-offset0 layui-col-md12">
        <table class="layui-hide" id="uploadLogTable" lay-filter="solveFilter"></table>
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

<button id="reloadTable"></button>



<script src="${APP_PATH}/js/jquery.min.js"></script>
<script src="${APP_PATH}/lib/layui/layui.js"></script>
<script src="${APP_PATH}/js/zui.min.js"></script>
<script>

    layui.use(['form',"element", 'layer','table'], function(){
        var form = layui.form
            , element = layui.element
            , layer = layui.layer
            , table = layui.table;


        var upload_log_table = table.render({
            elem: '#uploadLogTable'
            , url: 'data/upload/solve' + '?projectid=' + $("#projectSelect").val()
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
                            "projectid":$("#projectSelect").val(),
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
                    window.open("onlineview.jsp?fileid="+data.fileId);
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
                                "projectid":$("#projectSelect").val(),
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
                                "projectid":$("#projectSelect").val(),
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
                                "projectid":$("#projectSelect").val(),
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
                        // console.log(projectid);
                        $.ajax({
                            url:"down/solve/all"
                            , type:"post"
                            , data:{
                                "projectid":$("#projectSelect").val(),
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


        $("#reloadTable").click(function () {
            upload_log_table.reload();
        });

        form.on('select()', function(data){
            console.log(data.value);
            // 加载数据到进度条
            $.ajax({
                url:"count/upload"+"?projectid="+data.value,
                async:"false",
                success:function (re) {
                    element.progress('demo', re.progress);
                }
            });
            table.render({
                elem: '#uploadLogTable'
                , url: 'data/upload/solve' + '?projectid=' + $("#projectSelect").val()
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

        });
    });

</script>
<script type="text/javascript">
    var yisooid = "${sessionScope.yisooid}";
    var userid = "${sessionScope.userid}";
    var username = "${sessionScope.username}";
    var email = "${sessionScope.email}";
    var projectid;
    var loginflag={
        flag:"0",
        yisooid:yisooid,
        userid:userid,
        username:username,
        email:email
    };
    // 初始化下拉框
    $.ajax({
        url:"pro/view?yisooid="+yisooid+"&page=1&limit=9999999",
        success:function (re) {
            //初始化到下拉框
            initProjectSelect(re.data);
            // 加载数据到进度条
            getProgess(re.data[0].projectId);
            // $("#projectProgess").attr("lay-percent","45/60");
            projectid = re.data[0].projectId;
            // console.log(projectid);
            $("#reloadTable").click();
        }
    });

</script>
<script type="text/javascript">
    function initProjectSelect(data) {
        for (var i = 0; i < data.length; i++) {
            $("#projectSelect").append("<option value="+data[i].projectId+">"+data[i].pTitle+"</option>");
        }
    }
    function getProgess(data){
        $.ajax({
            url:"count/upload"+"?projectid="+data,
            success:function (re) {
                $("#projectProgess").attr("lay-percent",re.progress);
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
    function showMsg(msg, mtype) {
        //mmtype:'primary'|'success'|'info'|'warning'|'danger'|'important'|'special'
        new $.zui.Messager(msg, {
            type: mtype // 定义颜色主题
        }).show();
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
</script>


</body>
</html>
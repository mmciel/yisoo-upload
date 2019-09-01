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
    <link rel="stylesheet" href="https://www.bootcss.com/p/buttons/css/buttons.css">
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
            <legend>有效提交进度</legend>
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
            <legend>项目提交详览</legend>
        </fieldset>
    </div>
</div>
<div class="layui-row">
    <div class="layui-col-md-offset0 layui-col-md12">
        <table class="layui-hide" id="uploadLogTable" lay-filter="logFilter"></table>
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
                , url: 'data/upload/log' + '?projectid=' + data.value
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

        });
    });

</script>
<script type="text/javascript">
    var yisooid = "${sessionScope.yisooid}";
    var userid = "${sessionScope.userid}";
    var projectid;
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
</script>


</body>
</html>
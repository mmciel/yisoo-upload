<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>文件提交</title>
    <link rel="stylesheet" href="${APP_PATH}/lib//layui/css/layui.css" media="all">
    <link rel="stylesheet" href="${APP_PATH}/css/zui.min.css">
    <link rel="stylesheet" href="${APP_PATH}/css/style.css">
    <link rel="stylesheet" href="${APP_PATH }/css/buttons.min.css">
<%--    <link rel="stylesheet" href="https://www.bootcss.com/p/buttons/css/buttons.css">--%>
    <link rel="stylesheet" href="${APP_PATH}/css/selectFilter.css"/>
    <!--    文件上传样式 -->
    <link href="${APP_PATH}/css/zui.uploader.css" rel="stylesheet">
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
                            <li class="active"><a href="" id="btnUpload">文件上传</a></li>
                            <li><a href="" id="btnLog">提交日志</a></li>
                            <li><a href="" id="btnSolve">快捷管理</a></li>
                        </ul>
                    </div><!-- END .navbar-collapse -->
                </div>
            </nav>
            <div>
                <div class="layui-row">
                    <div class="layui-col-md-offset4 layui-col-md4">
                        <h1 id="pTitle" style="text-align:center;font-size: 40px;">标准项目</h1>
                    </div>
                    <div class="layui-col-md-offset4 layui-col-md4">
                        <hr>
                    </div>
                </div>
                <div class="layui-row">
                    <div class="layui-col-md-offset4 layui-col-md4">
                        <blockquote id="pWord" class="layui-elem-quote layui-quote-nm">
                        </blockquote>
                    </div>
                </div>
                <div class="layui-row">
                    <div class="layui-col-md-offset4 layui-col-md4">
                        <blockquote class="layui-elem-quote">
                            <i class="layui-icon">&#xe62c; </i><span id="CountTime"></span>
                        </blockquote>
                    </div>
                </div>

                <div class="layui-row">
                    <div class="layui-col-md-offset4 layui-col-md4">
                        <hr>
                    </div>
                    <div class="layui-col-md-offset4 layui-col-md4">
                        <!-- <input type="button" id="ddd" value="sadasd"> -->
                        <div class="filter-box">
                            <div class="filter-text">
                                <input class="filter-title" type="text" readonly placeholder="请选择学号"/>
                                <i class="icon-select icon-filter-arrow"></i>
                            </div>
                            <select id="gId" name="gId">
                                <option value="-1" selected>请选择...</option>
                            </select><br>
                        </div>
                    </div>
                </div>
                <div class="layui-row">
                    <div class="layui-col-md-offset4 layui-col-md4">
                        <div id="file_upload" class="uploader" data-ride="uploader" data-url="#">
                            <div class="uploader-message text-center">
                                <div class="content"></div>
                                <button type="button" class="close">×</button>
                            </div>
                            <div class="uploader-files file-list file-list-lg"
                                 data-drag-placeholder="请拖拽文件到此处"></div>
                            <div class="uploader-actions">
                                <div class="uploader-status pull-right text-muted"></div>
                                <button type="button" class="btn btn-link uploader-btn-browse"><i
                                        class="icon icon-plus"></i> 打开文件
                                </button>
                                <%--                                <button type="button" class="btn btn-link uploader-btn-start"><i--%>
                                <%--                                        class="icon icon-cloud-upload"></i> 上传--%>
                                <%--                                </button>--%>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="layui-row">
                    <div class="layui-col-md-offset7 layui-col-md1">
                        <input type="button" id="save" value="保存"
                               class="button button-glow button-border button-rounded button-primary button-small ">
                        <!--  button-caution -->
                    </div>
                </div>
                <div class="layui-row">
                    <div class="layui-col-md-offset4 layui-col-md4">
                        <hr>
                    </div>
                    <div class="layui-col-md-offset4 layui-col-md4">
                        <%--                        <blockquote class="layui-elem-quote layui-quote-nm">--%>
                        <i class="layui-icon">&#xe60e; </i><span id="StartToEndTime"></span>
                        <%--                        </blockquote>--%>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="${APP_PATH}/js/jquery.min.js"></script>
<script src="${APP_PATH}/lib/layui/layui.js"></script>
<script src="${APP_PATH}/js/zui.min.js"></script>
<script type="text/javascript" src="${APP_PATH}/js/selectFilter.js"></script>
<script src="${APP_PATH}/js/zui.uploader.js"></script>
<script type="text/javascript">
    var file_id;
    var mult_data = {
        "projectid": "-1",
        "gid": "-1"
    }
    $('#file_upload').uploader({
        url: '${APP_PATH}/file/upload/stream',
        limitFilesCount: 1,
        removeUploaded: true,
        chunk_size: "0",
        multipart_params: mult_data,
        filters: {
            max_file_size: '50mb',
            prevent_duplicates: true
        },
        onFileUploaded: function (file, responseObject) {
            u_msg = $.parseJSON(responseObject.response);
            // console.log(u_msg);
            file_id = u_msg.file_id;
            showMsg(u_msg.message, 'success');
            layer.confirm('提交成功！是否查看提交日志？', {icon: 3, title: '询问！'}, function (index) {
                //跳转到
                window.location.href = './ulog.jsp?projectid='+projectid;
                layer.close(index);
            });
        }
    });
</script>
<script>

    var pdata;
    var gdata;

    (function ($) {
        $.getUrlParam = function (name) {
            var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
            var r = window.location.search.substr(1).match(reg);
            if (r != null) return unescape(r[2]);
            return null;
        }
    })(jQuery);
    var projectid = $.getUrlParam('projectid');
    //初始化右边栏
    $('#btnLog').attr('href','./ulog.jsp?projectid='+projectid);
    $('#btnSolve').attr('href','./usolve.jsp?projectid='+projectid);
    $('#btnUpload').attr('href','./ushow.jsp?projectid='+projectid);
    $.ajax({
        url: "show/init" + "?projectid=" + projectid,
        async: false,
        success: function (re) {
            pdata = re.data;
            gdata = re.groups;
            if (re.result === "200") {
                //初始化成功
                initPage(pdata);
                initSelect(gdata);
                console.log(re);
            } else if (re.result === "300") {
                //初始化异常
                initSelect(gdata);
                initPage(pdata);
                //改掉按钮
                $("#save").val("无法提交");
                $("#save").addClass("button-caution");
                showMsg(re.message, "danger");
                // console.log(re);
            } else if (re.result === "400") {
                //初始化失败
                window.location.href = "error.jsp";
            }
        }
    });

    function showMsg(msg, mtype) {
        //mmtype:'primary'|'success'|'info'|'warning'|'danger'|'important'|'special'
        new $.zui.Messager(msg, {
            type: mtype // 定义颜色主题
        }).show();
    }

    function initPage(data) {
        $("#pTitle").text(data.pTitle);
        $("#pWord").text(data.pWord);
        var str = currentTimeChangeStr(data.startTime) + " ~ " + currentTimeChangeStr(data.endTime);
        $("#StartToEndTime").text(str);
    }

    function initSelect(data) {
        for (var i = 0; i < data.length; i++) {
            $("#gId").append("<option value='" + data[i].gId + "'>" + data[i].gNumber + "+" + data[i].gName + "</option>");
        }
        $('.filter-box').selectFilter({
            // callBack: function (val) {
            //     console.log(val + '-是返回的值')
            // }
        });
    }

    //    监听提交
    $("#save").click(function () {
        if ($("#save").val() !== "保存") {
            //    有问题
            showMsg("无法提交", "danger");
        } else {
            if ($("#gId").val() === "-1") {
                showMsg("请选择提交者！", "danger");
            } else {

                mult_data.gid = $("#gId").val();
                mult_data.projectid = pdata.projectId;
                //检验可提交性
                if (check_upload(mult_data)) {
                    $('#file_upload').data('zui.uploader').start();
                } else {
                    layer.confirm('检测到您已经提交过文件，是否继续提交？', {icon: 3, title: '问题！'}, function (index) {
                        $('#file_upload').data('zui.uploader').start();
                        layer.close(index);
                    });
                }
            }

        }
    });

    //检查是否可以提交文件
    function check_upload(mult_data) {
        var flag = false;
        $.ajax({
            url: "file/upload/check",
            type: "post",
            data: mult_data,
            async: false,
            success: function (re) {
                if (re.result === "ok") {
                    flag = true;
                } else {
                    flag = false;
                }
            }
        });
        return flag;
    }

    //把当前时间转成字符串
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
        //获取当前日期
        // document.write(clock);
        return clock;
    }
</script>
<script>
    layui.use(['util', 'carousel', 'laydate', 'layer'], function () {
        var carousel = layui.carousel
            , laydate = layui.laydate
            , layer = layui.layer
            , util = layui.util;
        //建造实例
        carousel.render({
            elem: '#test1'
            , full: true
            , indicator: "none"
            , autoplay: false
            , arrow: 'none'
        });
        var thisTimer;
        var setCountdown = function (timestamp) {
            var endTime = new Date(timestamp);
            var serverTime = new Date();
            clearTimeout(thisTimer);
            util.countdown(endTime, serverTime, function (date, serverTime, timer) {
                var str = date[0] + '天' + date[1] + '时' + date[2] + '分' + date[3] + '秒';
                lay('#CountTime').html(str);
                thisTimer = timer;
            });
        };
        setCountdown(pdata.endTime);

    });
</script>
</body>
</html>
<%--
  Created by IntelliJ IDEA.
  User: mmciel
  Date: 2019/8/10
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>YiSoo空投</title>
    <!--    引入zui-->
    <link rel="stylesheet" href="${APP_PATH }/css/zui.min.css">
    <!--	引入字体-->
    <link href="https://fonts.googleapis.com/css?family=Oxygen:400,700|Arimo:400,700" rel="stylesheet">
    <style>
        .main-header{
            background-image: url("./img/air-bg.png");
            background-image:url(https://s2.ax1x.com/2019/08/10/eONpg1.png);
            position: relative;
            background-repeat:no-repeat ;
            background-attachment: fixed;
            background-size:100% 100%;
        }
        .air-btn-center{
            padding-top: 30%;
        }
    </style>
    <!--    引入buttons -->
    <link rel="stylesheet" href="https://www.bootcss.com/p/buttons/css/buttons.css">
    <!--    文件上传样式 -->
    <link href="${APP_PATH }/css/zui.uploader.css" rel="stylesheet">
    <!-- 	自定义样式 -->
    <link href="${APP_PATH}/css/style.css" rel="stylesheet">
    
</head>
<body class=" main-header">

        <nav class="navbar-fixed navbar-fixed-text-color navbar " role="navigation">
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
                    <!-- logo -->
                    <a class="navbar-brand navbar-brand-text" href="index.jsp">YISOO</a>
                </div>
                <!-- 导航项目 -->
                <div class="collapse navbar-collapse navbar-collapse-example">
                    <!-- 一般导航项目 -->
                    <ul class="nav navbar-nav nav-secondary navbar-brand-text-sm">
                        <li class="active"><a href="index.jsp">主页</a></li>
                        <li><a href="admin.jsp">文件采集</a></li>
                        <li><a href="#">文件空投</a></li>
                        <li><a href="update.jsp">系统更新</a></li>
                        <li><a href="https://github.com/mmciel/yisoo-upload">开源项目</a></li>
                        <li><a href="about.jsp">关于YiSoo</a></li>
                    </ul>
                    <!-- 右侧的导航项目 -->
                    <!-- <ul class="nav navbar-nav nav-pills navbar-right">
                        <li class="active"><a href="your/nice/url">登录·注册</a></li>
                    </ul> -->
                </div><!-- END .navbar-collapse -->
            </div>
        </nav>
        <!-- 中间内容 -->
        <div class="air-btn-center container-fluid">
            <div class="row">
                <div class="col-md-offset-5 col-md-4">
                    <button class="button button-glow button-border button-rounded button-royal button-large"
                            data-toggle="modal"
                            data-target="#air-upload"
                            data-position="center"
                            data-moveable="true">
                        上传
                    </button>
                </div>
            </div>
            <br>
            <div class="row">
                <div class="col-md-offset-5 col-md-4">
                    <button class="button button-glow button-border button-rounded button-primary button-large"
                            id="down-model-btn"
                            data-toggle="modal"
                            data-target="#air-down"
                            data-position="center"
                            data-moveable="true">
                        下载
                    </button>
                </div>
            </div>
        </div>
        <!-- 上传模态框 -->

        <div class="modal fade" id="air-upload">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">关闭</span></button>
                        <h4 class="modal-title">上传文件</h4>
                    </div>
                    <div class="modal-body">
                        <form>
                            <div class="form-group">
                                <label for="airNum">最大下载次数</label>
                                <input type="text" class="form-control form-focus" id="airNum" placeholder="">
                            </div>
                            <div class="form-group">
                                <label for="airLong">文件保存天数</label>
                                <input type="text" class="form-control form-focus" id="airLong" placeholder="">
                            </div>
                        </form>
                        <div id="air-uploader" class="uploader" data-ride="uploader" data-url="#">
                            <div class="uploader-message text-center">
                                <div class="content"></div>
                                <button type="button" class="close">×</button>
                            </div>
                            <div class="uploader-files file-list file-list-lg" data-drag-placeholder="请拖拽文件到此处"></div>
                            <div class="uploader-actions">
                                <div class="uploader-status pull-right text-muted"></div>
                                <button type="button" class="btn btn-link uploader-btn-browse"><i class="icon icon-plus"></i> 选择文件</button>
                                <button type="button" class="btn btn-link uploader-btn-start"><i class="icon icon-cloud-upload"></i> 开始上传</button>
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
<%--                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>--%>
                        <button type="button" id="airSub" class="btn btn-primary">提交</button>
                    </div>
                </div>
            </div>
        </div>
<%--        分享码模态框--%>
        <!-- 小对话框 -->
        <div class="modal fade" id="shareCode">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">关闭</span></button>
                        <h4 class="modal-title">分享码</h4>
                    </div>
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-8">
                                <input type="text" id="code" value="" class="button button-glow button-border button-rounded button-primary">

                            </div>
                            <div class="col-md-3">
                                <button id="copyCode" class="button button-glow button-rounded button-border button-highlight">
                                    复制
                                </button>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>
        <!-- 下载模态框 -->
        <div class="modal fade" id="air-down">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">关闭</span></button>
                        <h4 class="modal-title">下载分享文件</h4>
                    </div>
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-8">
                                <input type="text" id="downCode" value="" class="button button-glow button-border button-rounded button-primary">

                            </div>
                            <div class="col-md-3">
                                <button id="down" class="button button-glow button-rounded button-border button-highlight">
                                    下载
                                </button>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>
<!--    引入jQuery支持-->
<script src="${APP_PATH }/js/jquery.min.js"></script>
<!--    引入zui-->
<script src="${APP_PATH }/js/zui.min.js"></script>
<!--    文件上传组件 -->
<script src="${APP_PATH }/js/zui.uploader.js"></script>
<script>
    var file_id,u_msg;
    var file_num,file_day;
    $('#air-uploader').uploader({
        url: '${APP_PATH}/air/upload',
        limitFilesCount:1,
        removeUploaded:true,
        chunk_size:0,
        filters:{
            // 最大上传文件为 100MB
            max_file_size: '100mb',
            // 不允许上传重复文件
            prevent_duplicates: true
        },
        onFileUploaded: function(file, responseObject) {
            u_msg = $.parseJSON(responseObject.response);
            file_id = u_msg.id;
            new $.zui.Messager(u_msg.message, {
                type: 'success'
            }).show();
        }
    });
    $('#down-model-btn').click(function () {
        $('#downCode').val("");
    });
    $('#down').click(function () {
        var downcode = $('#downCode').val();
        regCode = /.*/;//要改成md5加密的字符串
        if(!regCode.test(downcode)){
            new $.zui.Messager("请填写正确的分享码", {
                type: 'danger'
            }).show();
        }
        $.ajax({
            url:"${APP_PATH}/air/down"+"?"+"downcode="+downcode,
            type:'get',
            success:function (result) {
                if(result.result === "success"){
                    // result.url 获取到了下载链接
                    // console.log(result.url);
                    new $.zui.Messager(result.message, {
                        type: 'info'
                    }).show();
                    window.open("./air/down/action?filename="+result.url);
                }else{
                    new $.zui.Messager(result.message, {
                        type: 'danger'
                    }).show();
                }
            }
        });
    });
    $('#copyCode').click(function () {
        var e=document.getElementById("code");//对象是contents
        e.select(); //选择对象
        tag = document.execCommand("Copy"); //执行浏览器复制命令
        if(tag){
            new $.zui.Messager("复制完成", {
                type: 'info'
            }).show();
        }
    });
    $('#airSub').click(function () {
        file_num = $('#airNum');
        file_day = $('#airLong');
        //校验失败
        if(! check_form(file_num.val()) || ! check_form(file_day.val())){
            new $.zui.Messager("请正确填写数字！", {
                type: 'danger'
            }).show();
        }
        // 校验成功
        $.ajax({
            url:'${APP_PATH}/air/data',
            type:'post',
            data:{
                'airNum':file_num.val(),
                'airLong':file_day.val(),
                'airId':file_id
            },
            success:function (result) {
                if(result.result === "success"){
                    new $.zui.Messager("请记得复制邀请码！", {
                        type: 'info'
                    }).show();
                    // result.url 为分享码
                    $('#air-upload').modal('hide');
                    $('#code').val(result.url);
                    $('#shareCode').modal('show');

                }else{
                    new $.zui.Messager("请刷新页面重试！", {
                        type: 'danger'
                    }).show();
                }

            }
        });
    });

    function check_form(file_item) {
        var regName = /^[0-9]*$/;
        if(!regName.test(file_item)){
        //    匹配失败
            return false;
        }else{
        //    匹配成功
            return true;
        }

    }
</script>
</body>
</html>

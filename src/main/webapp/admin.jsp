<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("APP_PATH", request.getContextPath());

%>
<!doctype html>
<html class="x-admin-sm">
<head>
    <meta charset="UTF-8">
    <title>YiSoo-Admin</title>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<%--    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />--%>
    <meta http-equiv="Cache-Control" content="no-siteapp" />


    <link rel="stylesheet" href="${APP_PATH}/css/font.css">
    <link rel="stylesheet" href="${APP_PATH}/css/xadmin.css">
    <link rel="stylesheet" href="${APP_PATH}/css/theme5.css">
    <script src="${APP_PATH}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${APP_PATH}/js/xadmin.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->


</head>
<body class="index">
<!-- 顶部开始 -->
<div class="container">
    <div class="logo">
        <a href="./index.html">YiSoo</a></div>
    <div class="left_open">
        <a><i title="展开左侧栏" class="iconfont">&#xe699;</i></a>
    </div>

    <ul class="layui-nav right" lay-filter="">
        <li class="layui-nav-item">
            <a href="javascript:;" id="username-label">用户名</a>
            <dl class="layui-nav-child">
                <!-- 二级菜单 -->
                <dd>
                    <a onclick="xadmin.open('个人信息','http://www.baidu.com')">个人信息</a></dd>
                <dd>
                    <a href="#">退出账号</a></dd>
            </dl>
        </li>
    </ul>
</div>
<!-- 顶部结束 -->
<!-- 中部开始 -->
<!-- 左侧菜单开始 -->
<div class="left-nav">
    <div id="side-nav">
        <ul id="nav">
            <li>
                <a href="javascript:;">
                <i class="iconfont left-nav-li" lay-tips="信息管理">&#xe6b8;</i>
                <cite>信息管理</cite>
                <i class="iconfont nav_right">&#xe697;</i></a>
                <ul class="sub-menu">
                    <li>
                        <a onclick="xadmin.add_tab('个人信息','admin-personinfo.jsp')">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>个人信息</cite></a>
                    </li>
                    <li>
                        <a onclick="xadmin.add_tab('新建名单','admin-addgroup.jsp')">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>新建名单</cite></a>
                    </li>
                    <li>
                        <a onclick="xadmin.add_tab('名单信息','admin-viewgroup.jsp')">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>名单信息</cite></a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont left-nav-li" lay-tips="项目管理">&#xe6b8;</i>
                    <cite>项目管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i></a>
                <ul class="sub-menu">
                    <li>
                        <a onclick="xadmin.add_tab('项目控制','admin-projectinfo.jsp')">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>项目控制</cite></a>
                    </li>
                    <li>
                        <a onclick="xadmin.add_tab('项目浏览','error.jsp')">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>项目细览</cite></a>
                    </li>
                    <li>
                        <a onclick="xadmin.add_tab('项目导出','#')">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>项目导出</cite></a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont left-nav-li" lay-tips="数据管理">&#xe6b8;</i>
                    <cite>数据管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i></a>
                <ul class="sub-menu">
                    <li>
                        <a onclick="xadmin.add_tab('提交概况','#')">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>提交概况</cite></a>
                    </li>
                    <li>
                        <a onclick="xadmin.add_tab('提交统计','#')">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>提交统计</cite></a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont left-nav-li" lay-tips="敬请期待">&#xe6b8;</i>
                    <cite>敬请期待</cite>
                    <i class="iconfont nav_right">&#xe697;</i></a>
                <ul class="sub-menu">
                    <li>
                        <a onclick="xadmin.add_tab('系统信息','admin-systeminfo.jsp')">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>系统信息</cite></a>
                    </li>
                </ul>
            </li>
        </ul>
    </div>
</div>
<!-- <div class="x-slide_left"></div> -->
<!-- 左侧菜单结束 -->
<!-- 右侧主体开始 -->
<div class="page-content">
    <div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
        <ul class="layui-tab-title">
            <li class="home">
                <i class="layui-icon">&#xe68e;</i>我的桌面</li></ul>
        <div class="layui-unselect layui-form-select layui-form-selected" id="tab_right">
            <dl>
                <dd data-type="this">关闭当前</dd>
                <dd data-type="other">关闭其它</dd>
                <dd data-type="all">关闭全部</dd></dl>
        </div>
        <div class="layui-tab-content">
            <div class="layui-tab-item layui-show">
                <iframe src='./admin-welcome.jsp' frameborder="0" scrolling="yes" class="x-iframe"></iframe>
            </div>
        </div>
        <div id="tab_show"></div>
    </div>
</div>
<div class="page-content-bg"></div>
<style id="theme_style"></style>
<!-- 右侧主体结束 -->
<!-- 中部结束 -->
<!-- jQuery -->
<script src="${APP_PATH}/js/jquery.min.js"></script>
<script>
    var yisooid = "${sessionScope.yisooid}";
    var userid = "${sessionScope.userid}";
    if(yisooid === "" || userid ===""){
        window.location.href = "login.jsp";
        // console.log("o");

    }
    else{
        $.ajax({
            url:"user/admincheck",
            type:"post",
            data:{
                "yisooid":yisooid,
                "userid":userid
            },
            success:function (result) {
                if(result.result === 400){
                    window.location.href = "login.jsp";
                    // console.log(result);
                }else{
                    //    写入用户名
                    $("#username-label").text(result.username);
                    console.log(result);

                }
            }
        });
    }

</script>
</body>
</html>
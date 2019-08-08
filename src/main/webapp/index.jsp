<%--
  Created by IntelliJ IDEA.
  User: mmciel
  Date: 2019/8/8
  Time: 21:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>YiSoo</title>
    <!--    引入zui-->
    <link rel="stylesheet" href="${APP_PATH }/css/zui.min.css">


</head>
<body>
<nav class="navbar" role="navigation">
    <div class="container-fluid">
        <!-- 导航头部 -->
        <div class="navbar-header">
            <!-- 移动设备上的导航切换按钮 -->
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse-example">
                <span class="sr-only">切换导航</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <!-- 品牌名称或logo -->
            <a class="navbar-brand" href="your/nice/url">YiSoo</a>
        </div>
        <!-- 导航项目 -->
        <div class="collapse navbar-collapse navbar-collapse-example">
            <!-- 一般导航项目 -->
            <ul class="nav navbar-nav nav-pills">
                <li class="active"><a href="your/nice/url">主页</a></li>
                <li><a href="your/nice/url">文件服务</a></li>
                <li><a href="your/nice/url">空投服务</a></li>
                <li><a href="your/nice/url">更新</a></li>
                <li><a href="your/nice/url">开源</a></li>
                <li><a href="your/nice/url">关于</a></li>
            </ul>
            <!-- 右侧的导航项目 -->
            <ul class="nav navbar-nav nav-pills navbar-right">
                <li class="active"><a href="your/nice/url">登录·注册</a></li>

            </ul>
        </div><!-- END .navbar-collapse -->
    </div>
</nav>
<!--    引入jQuery支持-->
<script src="${APP_PATH }/js/jquery.min.js"></script>
<!--    引入zui-->
<script src="${APP_PATH }/js/zui.min.js"></script>

</body>
</html>

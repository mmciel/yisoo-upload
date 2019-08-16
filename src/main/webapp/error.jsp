<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("APP_PATH", request.getContextPath());

%>
<!doctype html>
<html class="x-admin-sm">
    <head>
        <meta charset="UTF-8">
        <title>后台登录-X-admin2.2</title>
        <meta name="renderer" content="webkit|ie-comp|ie-stand">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
        <meta http-equiv="Cache-Control" content="no-siteapp" />

        <link rel="stylesheet" href="${APP_PATH}/css/font.css">
        <link rel="stylesheet" href="${APP_PATH}/css/xadmin.css">
    </head>
    <body>
          <div class="layui-container">
           <div class="fly-panel"> 
            <div class="fly-none"> 
             <h2><i class="layui-icon layui-icon-404"></i></h2> 
             <p>页面或者数据被<a href="index.jsp"> YiSoo </a>运到火星了，啥都看不到了…</p>
            </div>
           </div>
          </div>
    </body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("APP_PATH", request.getContextPath());

%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <!-- <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1"> -->
    <link rel="stylesheet" href="${APP_PATH}/lib/layui/css/layui.css" media="all">
</head>
<body>

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>项目信息概览</legend>
</fieldset>
<table class="layui-hide" id="project" lay-filter="project-filter"></table>
<script type="text/html" id="toolbarProject">
  <div class="layui-btn-container">
        <button class="layui-btn layui-btn-sm" lay-event="newProject">新建项目</button>
  </div>
</script>
 
<script type="text/html" id="barProject">
  <a class="layui-btn layui-btn-xs" lay-event="editProject">修改</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="delProject">删除</a>
</script>
<!-- jQuery -->
<script src="${APP_PATH}/js/jquery.min.js"></script>
<script src="${APP_PATH}/lib/layui/layui.js" charset="utf-8"></script>
<script>
    var yisooid = "${sessionScope.yisooid}";
</script>
<script>
layui.use(['table','layer'], function(){
  var table = layui.table;
  var layer = layui.layer;
  table.render({
    elem: '#project'
    ,url:'pro/view'+'?yisooid='+yisooid
    ,toolbar: '#toolbarProject'
    ,title: '用户数据表'
    ,cols: [[
      {type: 'checkbox', fixed: 'left'}
      ,{field:'id', title:'ID', width:80, fixed: 'left', unresize: true, sort: true}
      ,{field:'username', title:'用户名', width:120, edit: 'text'}
      ,{field:'email', title:'邮箱', width:150, edit: 'text', templet: function(res){
        return '<em>'+ res.email +'</em>'
      }}
      ,{field:'sex', title:'性别', width:80, edit: 'text', sort: true}
      ,{field:'city', title:'城市', width:100}
      ,{field:'sign', title:'签名'}
      ,{field:'experience', title:'积分', width:80, sort: true}
      ,{field:'ip', title:'IP', width:120}
      ,{field:'logins', title:'登入次数', width:100, sort: true}
      ,{field:'joinTime', title:'加入时间', width:120}
      ,{fixed: 'right', title:'操作', toolbar: '#barProject', width:150}
    ]]
    ,page: true
  });
  
  //头工具栏事件
  table.on('toolbar(project-filter)', function(obj){
    var checkStatus = table.checkStatus(obj.config.id);
    switch(obj.event){
      case 'newProject':
          newProjectAction();
      break;
    };
  });
  function newProjectAction(){
    layer.open({
        type: 2
        ,title: '新建项目'
        ,area: ['600px','500px']
        ,shade: 0
        ,maxmin: true
        ,offset: '30px'
        ,anim: 5
        ,scrollbar: false
        ,content: 'admin-shard-addproject.jsp'
        ,btn: ['关闭'] 
        ,yes: function(){
            layer.closeAll();
        }
      });
  }
//   //监听行工具事件
//   table.on('tool(project-filter)', function(obj){
//     var data = obj.data;
//     //console.log(obj)
//     if(obj.event === 'del'){
//       layer.confirm('真的删除行么', function(index){
//         obj.del();
//         layer.close(index);
//       });
//     } else if(obj.event === 'edit'){
//       layer.prompt({
//         formType: 2
//         ,value: data.email
//       }, function(value, index){
//         obj.update({
//           email: value
//         });
//         layer.close(index);
//       });
//     }
//   });
});
</script>
</body>
</html>

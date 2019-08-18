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
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${APP_PATH}/lib/layui/css/layui.css"  media="all">
</head>
<body>

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>个人信息修改</legend>
</fieldset>

<form class="layui-form" action="" lay-filter="project-modify">
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">项目名称</label>
            <div class="layui-input-inline">
                <input type="text" id="pTitle" name="pTitle" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>
    <div class="layui-form-item">
      <div class="layui-inline">
        <label class="layui-form-label">采用组</label>
        <div class="layui-input-inline">
          <select id="pGroupId" name="pGroupId">
            <option value="0">不采用</option>
          </select>
        </div>
      </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">采用字段</label>
        <div class="layui-input-block">
          <input type="checkbox" name="pGroupIsClass" title="组" checked="">
          <input type="checkbox" name="pGroupIsName" title="姓名" checked="">
          <input type="checkbox" name="pGroupIsNum" title="学号" checked="">
          <input type="checkbox" name="pGroupIsEmail" title="邮箱" checked="">
        </div>
      </div>
    <div class="layui-form-item">
      <label class="layui-form-label">查看文件</label>
      <div class="layui-input-block">
        <input type="checkbox" name="isShare" lay-skin="switch" lay-text="ON|OFF">
      </div>
    </div>
    <div class="layui-form-item">
      <label class="layui-form-label">查看记录</label>
      <div class="layui-input-block">
        <input type="checkbox" checked="" name="isView" lay-skin="switch" lay-text="ON|OFF">
      </div>
    </div>
    <div class="layui-form-item">
      <div class="layui-inline">
        <label class="layui-form-label">开始时间</label>
        <div class="layui-input-inline">
          <input type="text" class="layui-input" id="startTime" placeholder="">
        </div>
      </div>
      <div class="layui-inline">
        <label class="layui-form-label">结束时间</label>
        <div class="layui-input-inline">
          <input type="text" class="layui-input" id="endTime" placeholder="">
        </div>
      </div>
    </div>

    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">项目备注</label>
        <div class="layui-input-block">
            <textarea placeholder="请输入内容" id="pWord" name="pWord" class="layui-textarea"></textarea>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit="" lay-filter="submit-project-data">立即保存</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>
<script src="${APP_PATH}/lib/layui/layui.js" charset="utf-8"></script>
<!-- jQuery -->
<script src="${APP_PATH}/js/jquery.min.js"></script>
<script>
    var yisooid = "${sessionScope.yisooid}";
</script>
<script>
    $.ajax({
      url:"group/view/group"+"?yisooid="+yisooid,
      success:function(re){
        var items = re.data;
        for(var i=0;i<items.length;i++){
          // console.log(re.data[i].groupId);
          // console.log(re.data[i].gName);
          $("#pGroupId").append("<option value='"+items[i].groupId+"'>"+items[i].gName+"</option>");
        }
      }
    });
</script>
<script>
    layui.use(['form','layer','laydate'], function(){
        var form = layui.form;
        var laydate = layui.laydate;
        var layer = layui.layer;
        //监听提交
        form.on('submit(submit-project-data)', function(data){
            data.field.yisooId = yisooid;
            data.field.isShare === "on" ? data.field.isShare = 1 : data.field.isShare = 0;
            data.field.pGroupIsClass === "on" ? data.field.pGroupIsClass = 1 : data.field.pGroupIsClass = 0;
            data.field.pGroupIsName === "on" ? data.field.pGroupIsName = 1 : data.field.pGroupIsName = 0;
            data.field.pGroupIsNum === "on" ? data.field.pGroupIsNum = 1 : data.field.pGroupIsNum = 0;
            data.field.pGroupIsEmail === "on" ? data.field.pGroupIsEmail = 1 : data.field.pGroupIsEmail = 0;
            data.field.isView === "on" ? data.field.isView = 1 : data.field.isView = 0;
            $.ajax({
                url:"pro/add",
                type:"post",
                data:data.field,
                success:function (re) {
                    if(re.result === 400){
                        layer.msg("新建失败", {
                            time: 2000
                        });
                    }else{
                        layer.msg("新建成功", {
                            time: 2000
                        });
                    }
                }
            });
            return false;
        });
      //日期时间选择器
      laydate.render({
        elem: '#startTime'
        ,type: 'datetime'
      });
      laydate.render({
        elem: '#endTime'
        ,type: 'datetime'
      });
    });
</script>

</body>
</html>
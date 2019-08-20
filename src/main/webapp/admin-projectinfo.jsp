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
    <link rel="stylesheet" href="${APP_PATH}/css/zui.min.css" media="all">
</head>
<body>

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>项目信息概览</legend>
</fieldset>
<table class="layui-hide" id="project" lay-filter="project-filter"></table>
<!-- 对话框HTML -->
<div class="modal fade" id="myModal">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">关闭</span></button>
                <h4 class="modal-title">修改项目:<span id="projectIdSpan"></span></h4>
            </div>
            <div class="modal-body">
              <form class="layui-form" action="" lay-filter="project-modify">
                <div class="layui-form-item">
                        <label class="layui-form-label">项目名称</label>
                        <div class="layui-input-block">
                            <input type="text" id="pTitle" name="pTitle" autocomplete="off" class="layui-input">
                        </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">开始时间</label>
                    <div class="layui-input-block">
                      <input type="text" class="layui-input" id="startTime" name="startTime" placeholder="">
                    </div>

                </div>
                <div class="layui-form-item">
                  <label class="layui-form-label">结束时间</label>
                  <div class="layui-input-block">
                    <input type="text" class="layui-input" id="endTime" name="endTime" placeholder="">
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
                        <button class="layui-btn" lay-submit="" lay-filter="submit-project-modify">立即保存</button>
                    </div>
                </div>
            </form>


            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <!-- <button type="button" class="btn btn-primary">保存</button> -->
            </div>
        </div>
    </div>
</div>


<script type="text/html" id="toolbarProject">
    <div class="layui-btn-container">
        <button class="layui-btn layui-btn-sm" lay-event="newProject">新建项目</button>
    </div>
</script>

<script type="text/html" id="barProject">
    <a class="layui-btn layui-btn-xs" lay-event="modifyProject">修改</a>
    <a class="layui-btn layui-btn-normal layui-btn-xs" lay-event="viewProject">查看</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="delProject">删除</a>
</script>
<script type="text/html" id="pGroupIsClassSwitch">
    <input type="checkbox" name="pGroupIsClass" value="{{d.pGroupIsClass}}" lay-skin="switch" lay-text="开|关"
           lay-filter="pGroupIsClassSwitch" {{ d.pGroupIsClass== 1 ? 'checked' : '' }}>
</script>
<script type="text/html" id="pGroupIsNumSwitch">
    <input type="checkbox" name="pGroupIsNum" value="{{d.pGroupIsNum}}" lay-skin="switch" lay-text="开|关"
           lay-filter="pGroupIsNumSwitch" {{ d.pGroupIsNum== 1 ? 'checked' : '' }}>
</script>
<script type="text/html" id="pGroupIsNameSwitch">
    <input type="checkbox" name="pGroupIsName" value="{{d.pGroupIsName}}" lay-skin="switch" lay-text="开|关"
           lay-filter="pGroupIsNameSwitch" {{ d.pGroupIsName== 1 ? 'checked' : '' }}>
</script>
<script type="text/html" id="pGroupIsEmailSwitch">
    <input type="checkbox" name="pGroupIsEmail" value="{{d.pGroupIsEmail}}" lay-skin="switch" lay-text="开|关"
           lay-filter="pGroupIsEmailSwitch" {{ d.pGroupIsEmail== 1 ? 'checked' : '' }}>
</script>
<script type="text/html" id="pStatusCheckbox">
    <input type="checkbox" name="pStatus" value="{{d.pStatus}}" title="启用" lay-filter="pStatusCheckbox" {{ d.pStatus== 1
           ? 'checked' : '' }}>
</script>
<script type="text/html" id="isShareCheckbox">
    <input type="checkbox" name="isShare" value="{{d.isShare}}" title="启用" lay-filter="isShareCheckbox" {{ d.isShare== 1
           ? 'checked' : '' }}>
</script>
<script type="text/html" id="isViewCheckbox">
    <input type="checkbox" name="isView" value="{{d.isView}}" title="启用" lay-filter="isViewCheckbox" {{ d.isView== 1
           ? 'checked' : '' }}>
</script>

<!-- jQuery -->
<script src="${APP_PATH}/js/jquery.min.js"></script>
<script src="${APP_PATH}/lib/layui/layui.js" charset="utf-8"></script>
<script src="${APP_PATH}/js/zui.min.js"></script>
<script>
    var yisooid = "${sessionScope.yisooid}";
</script>
<script>
    layui.use(['table','form','layer','laydate'], function () {
        var table = layui.table;
        var layer = layui.layer;
        var form = layui.form;
        var laydate = layui.laydate;
        var project_table = table.render({
            elem: '#project'
            , url: 'pro/view' + '?yisooid=' + yisooid
            , toolbar: '#toolbarProject'
            , title: '用户数据表'
            , cols: [[
                // {type: 'checkbox', fixed: 'left'}
                {field: 'projectId', title: 'ID', width: 70, fixed: 'left', sort: true}
                , {field: 'pTitle', title: '项目名称', width: 115}
                , {
                    field: 'pGroupId', title: '组名称', width: 115
                    , templet: function (d) {
                        var temp_g_name = "空";
                        $.ajax({
                            url: "group/get/data" + "?groupid=" + d.pGroupId + "&yisooid=" + yisooid,
                            async: false,
                            success: function (re) {
                                if (re.result === "200") {
                                    temp_g_name = re.groupData.gName;
                                }
                            }
                        });
                        return temp_g_name;
                    }
                }
                , {field: 'pStatus', title: '启动项目', width: 110, templet: '#pStatusCheckbox', unresize: true}
                , {field: 'isShare', title: '文件分享', width: 110, templet: '#isShareCheckbox', unresize: true}
                , {field: 'isView', title: '提交查看', width: 110, templet: '#isViewCheckbox', unresize: true}
                , {field: 'pGroupIsClass', title: '组别', width: 80, templet: '#pGroupIsClassSwitch', unresize: true}
                , {field: 'pGroupIsNum', title: '学号', width: 80, templet: '#pGroupIsNumSwitch', unresize: true}
                , {field: 'pGroupIsName', title: '姓名', width: 80, templet: '#pGroupIsNameSwitch', unresize: true}
                , {field: 'pGroupIsEmail', title: '邮箱', width: 80, templet: '#pGroupIsEmailSwitch', unresize: true}
                , {fixed: 'right', title: '操作', toolbar: '#barProject', width: 165}
            ]]
            , page: true
        });

        //头工具栏事件
        table.on('toolbar(project-filter)', function (obj) {
            var checkStatus = table.checkStatus(obj.config.id);
            switch (obj.event) {
                case 'newProject':
                    newProjectAction();
                    break;
            }
            ;
        });

        function newProjectAction() {
            layer.open({
                type: 2
                , title: '新建项目'
                , area: ['600px', '500px']
                , shade: 0
                , maxmin: true
                , offset: '30px'
                , anim: 5
                , scrollbar: false
                , content: 'admin-shard-addproject.jsp'
                , btn: ['关闭']
                , yes: function () {
                    project_table.reload();
                    layer.closeAll();
                }
            });
        }
        //更改按钮状态
        function DynamicUpdateSwitch(tempdata) {
            var flag = false;
            $.ajax({
                url: "pro/update"
                , type: "post"
                , data: tempdata
                , async: false
                , success: function (re) {
                    if (re.result === "200") {
                        flag = true;
                    }
                }
            });
            return flag;
        }
        //把当前时间转成字符串
        function currentTimeChangeStr(timestamp){
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
            if(mm < 10) clock += "0";
            clock += mm + "-";
            if(dd < 10) clock += "0";
            clock += dd + " ";
            if(hh < 10) clock += "0";
            clock += hh + ":";
            if (ii < 10) clock += '0';
            clock += ii + ":";
            if (ss < 10) clock += '0';
            clock += ss;
            //获取当前日期
            // document.write(clock);
            return clock;
        }

        //获取行内信息，传入obj
        function getProjectIdByObj(obj){
            // 获取当前控件
            var selectIfKey=obj.othis;
            // 获取当前所在行
            var parentTr = selectIfKey.parents("tr");
            //eq(2): 代表的是表头字段位置    .layui-table-cell: 这个元素是我找表格div找出来的..[失望]
            var dataField = $(parentTr).find("td:eq(0)").find(".layui-table-cell").text();
            return dataField;
        }
        //监听switch
        form.on('switch(pGroupIsClassSwitch)', function (obj) {
            var fromData = {
                "projectId":getProjectIdByObj(obj),
                "pGroupIsClass":obj.value === "0" ? "1" : "0"
            };
            obj.value = obj.value === "0" ? "1" : "0";
            if(DynamicUpdateSwitch(fromData)){
                layer.tips("已生效", obj.othis);
            }else{
                layer.tips("更改失败", obj.othis);
            }
        });
        form.on('switch(pGroupIsNumSwitch)', function (obj) {
            var fromData = {
                "projectId":getProjectIdByObj(obj),
                "pGroupIsNum":obj.value === "0" ? "1" : "0"
            };
            obj.value = obj.value === "0" ? "1" : "0";
            if(DynamicUpdateSwitch(fromData)){
                layer.tips("已生效", obj.othis);
            }else{
                layer.tips("更改失败", obj.othis);
            }
        });
        form.on('switch(pGroupIsNameSwitch)', function (obj) {
            var fromData = {
                "projectId":getProjectIdByObj(obj),
                "pGroupIsName":obj.value === "0" ? "1" : "0"
            };
            obj.value = obj.value === "0" ? "1" : "0";
            if(DynamicUpdateSwitch(fromData)){
                layer.tips("已生效", obj.othis);
            }else{
                layer.tips("更改失败", obj.othis);
            }
        });
        form.on('switch(pGroupIsEmailSwitch)', function (obj) {
            var fromData = {
                "projectId":getProjectIdByObj(obj),
                "pGroupIsEmail":obj.value === "0" ? "1" : "0"
            };
            obj.value = obj.value === "0" ? "1" : "0";
            if(DynamicUpdateSwitch(fromData)){
                layer.tips("已生效", obj.othis);
            }else{
                layer.tips("更改失败", obj.othis);
            }
        });

        //监听checkbox
        form.on('checkbox(pStatusCheckbox)', function (obj) {
            var fromData = {
                "projectId":getProjectIdByObj(obj),
                "pStatus":obj.value === "0" ? "1" : "0"
            };
            obj.value = obj.value === "0" ? "1" : "0";
            if(DynamicUpdateSwitch(fromData)){
                layer.tips("已生效", obj.othis);
            }else{
                layer.tips("更改失败", obj.othis);
            }
        });
        form.on('checkbox(isShareCheckbox)', function (obj) {
            var fromData = {
                "projectId":getProjectIdByObj(obj),
                "isShare":obj.value === "0" ? "1" : "0"
            };
            obj.value = obj.value === "0" ? "1" : "0";
            if(DynamicUpdateSwitch(fromData)){
                layer.tips("已生效", obj.othis);
            }else{
                layer.tips("更改失败", obj.othis);
            }
        });
        form.on('checkbox(isViewCheckbox)', function (obj) {
            var fromData = {
                "projectId":getProjectIdByObj(obj),
                "isView":obj.value === "0" ? "1" : "0"
            };
            obj.value = obj.value === "0" ? "1" : "0";
            if(DynamicUpdateSwitch(fromData)){
                layer.tips("已生效", obj.othis);
            }else{
                layer.tips("更改失败", obj.othis);
            }
        });
      //   //监听行工具事件
        table.on('tool(project-filter)', function(obj){
          var data = obj.data;
          //console.log(obj)
          if(obj.event === 'delProject'){
              layer.confirm('真的删除么？', function (index) {
                  $.ajax({
                      url:"pro/del"+"?projectid="+obj.data.projectId,
                      success:function (re) {
                          if(re.result === "200"){
                              obj.del();
                              layer.close(index);
                          }else{
                              //    删除失败
                          }
                      }
                  });
                  layer.close(index);
              });
          } else if(obj.event === 'modifyProject'){
              // 加载数据到模态框
              $.ajax({
                url:"pro/get/data"+"?projectid="+obj.data.projectId,
                  async: false,
              success:function (re) {
                  // console.log(re.data[0]);
                  if(re.code === "0"){
                    $("#pTitle").val(re.data[0].pTitle);
                    $("#pWord").val(re.data[0].pWord);
                      var timestamp = re.data[0].startTime;
                      $("#startTime").val(currentTimeChangeStr(timestamp));
                      timestamp = re.data[0].endTime;
                      $("#endTime").val(currentTimeChangeStr(timestamp));
                      $("#projectIdSpan").text(re.data[0].projectId);
                  }
                }
              });
              $('#myModal').modal('show');
          }
        });
            //监听提交
        form.on('submit(submit-project-modify)', function(data){
        data.field.projectId = $("#projectIdSpan").text();
        // console.log($("#projectIdSpan").text());
        $.ajax({
            url:"pro/update",
            type:"post",
            data:data.field,
            success:function (re) {
                if(re.result === "400"){
                    layer.msg("更新失败", {
                        time: 2000
                    });
                }else if(re.result === "200"){
                    layer.msg("更新成功", {
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

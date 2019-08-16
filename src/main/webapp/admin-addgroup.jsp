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
    <link rel="stylesheet" href="${APP_PATH}/lib/layui/css/layui.css"  media="all">
    <!--    引入zui-->
    <link rel="stylesheet" href="${APP_PATH }/css/zui.min.css">

    <!--    文件上传样式 -->
    <link href="${APP_PATH }/css/zui.uploader.css" rel="stylesheet">


</head>
<body>

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>上传名单数据</legend>
</fieldset>

<form class="layui-form" action="" lay-filter="add_group_data">
    <div class="layui-form-item">
        <label class="layui-form-label">名单名称</label>
        <div class="layui-input-block">
            <input type="text" id="gname" name="gname"autocomplete="off" placeholder="请输入组名称" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">关键字</label>
        <div class="layui-input-block">
            <input type="checkbox" name="like[number]" title="学号" checked="">
            <input type="checkbox" name="like[name]" title="姓名" checked="">
            <input type="checkbox" name="like[class]" title="班级" checked="">
            <input type="checkbox" name="like[email]" title="邮箱" checked="">
        </div>
    </div>
    <div id="group-file-upload" class="uploader" data-ride="uploader" data-url="#">
        <div class="uploader-message text-center">
            <div class="content"></div>
            <button type="button" class="close">×</button>
        </div>
        <div class="uploader-files file-list file-list-lg" data-drag-placeholder="请拖拽文件到此处"></div>
        <div class="uploader-actions">
            <div class="uploader-status pull-right text-muted"></div>
            <button type="button" class="btn btn-link uploader-btn-browse"><i class="icon icon-plus"></i> 选择文件</button>
            <button type="button" class="btn btn-link uploader-btn-start"><i class="icon icon-cloud-upload"></i> 开始上传</button>
            <button type="button" class="btn btn-link" id="down-example"><i class="icon icon-cloud-upload"></i> 下载样例文件</button>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit="" lay-filter="submit">立即提交</button>
<%--            <button class="layui-btn" data-method="setTop" id="view-file" >查看文件信息</button>--%>
<%--            <button class="layui-btn" id="view-file" hidden="hidden">查看文件信息</button>--%>
        </div>
    </div>
</form>

<!-- jQuery -->
<script src="${APP_PATH}/js/jquery.min.js"></script>
<script src="${APP_PATH}/lib/layui/layui.js" charset="utf-8"></script>
<!--    引入zui-->
<script src="${APP_PATH }/js/zui.min.js"></script>
<!--    文件上传组件 -->
<script src="${APP_PATH }/js/zui.uploader.js"></script>
<script>
    var yisooid = "${sessionScope.yisooid}";
    var groupid="",filedata;

    layui.use(['form','layer'], function(){
        var form = layui.form,layer = layui.layer;
        //监听提交
        form.on('submit(submit)', function(data){
            // console.log(data.field['like[class]']);
            if(groupid===""){
                layer.alert("请先上传文件", {
                    title: '问题'
                })
                return false;
            }
            var tempdata = data.field;
            tempdata.groupid = groupid;
            console.log(groupid);
            console.log(yisooid);
            tempdata.yisooid = yisooid;
            tempdata.gname = $("#gname").val();
            $.ajax({
                url:'${APP_PATH}/group/upload/data',
                type:"post",
                data:tempdata,
                success:function (re) {
                    // console.log(re);
                    if(re.result === "ok"){
                        $("#view-file").removeAttr("hidden");
                    }
                }
            });
            return false;
        });
        //表单初始赋值
        form.val('add_group_data', {
            "like[number]": true,
            "like[name]": true,
            "like[class]": true,
            "like[email]": true
        })

        // layer.open({
        //     type: 2
        //     ,title: '数据查看'
        //     ,area: 'auto'
        //     ,shade: 0
        //     ,maxmin: true
        //     ,offset:'auto'
        //     ,content: $("#group-file-upload")
        //     ,btn: ['好的'] //只是为了演示
        //     ,yes: function(){
        //         layer.closeAll();
        //     }
        //     ,zIndex: layer.zIndex //重点1
        //     ,success: function(layero){
        //         layer.setTop(layero); //重点2
        //     }
        // });
    });
    // $("#view-file").click(function () {
    //
    // });

    $('#group-file-upload').uploader({
        url: '${APP_PATH}/group/upload/file',
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
            var result = $.parseJSON(responseObject.response);
            console.log(result);

            groupid = result.groupid;
            filedata = result.datas;
            // console.log(filedata);

            new $.zui.Messager(result.message, {
                type: 'success'
            }).show();
        }
    });
    $("#down-example").click(function(){
        $.ajax({
            url:"group/down/example"+"/?type=xlsx",
            success:function(re){
                console.log(re);
                if(re.result === "200"){
                    window.location.href = "group/down/example/action"+"/?filename="+re.exampleFileName;
                    new $.zui.Messager("下载成功", {
                        type: 'info'
                    }).show();
                }else{
                    alert("下载异常");
                }
            }
        });
    });

</script>
</body>
</html>

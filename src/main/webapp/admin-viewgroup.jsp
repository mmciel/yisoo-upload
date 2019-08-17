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
    <legend>名单数据概览</legend>
</fieldset>
<table class="layui-hide" id="group" lay-filter="group-filter"></table>
<script type="text/html" id="barGroup">
    <a class="layui-btn layui-btn-xs" lay-event="viewGroup">查看</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="delGroup">删除</a>
</script>

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>名单数据详细</legend>
</fieldset>
<table class="layui-hide" id="gdata" lay-filter="gdata-filter"></table>
<!-- jQuery -->
<script src="${APP_PATH}/js/jquery.min.js"></script>
<script src="${APP_PATH}/lib/layui/layui.js" charset="utf-8"></script>
<script>
    var yisooid = "${sessionScope.yisooid}";
</script>
<script>
    layui.use('table', function () {
        var table = layui.table;

        table.render({
            elem: '#group'
            , url: 'group/view/group?yisooid=' + yisooid
            , title: '组信息'
            , cols: [[
                {type: 'checkbox', fixed: 'left'}
                , {field: 'groupId', title: 'ID', width: 75, sort: true}
                , {field: 'gName', title: '组名称', width: 160}
                , {
                    field: 'isNum', title: '采用编号', width: 95
                    , templet: function (d) {
                        if (d.isNum === 1) {
                            return "是";
                        } else {
                            return "否";
                        }
                    }
                }
                , {
                    field: 'isName', title: '采用姓名', width: 95
                    , templet: function (d) {
                        if (d.isName === 1) {
                            return "是";
                        } else {
                            return "否";
                        }
                    }
                }
                , {
                    field: 'isClass', title: '采用小组', width: 95
                    , templet: function (d) {
                        if (d.isClass === 1) {
                            return "是";
                        } else {
                            return "否";
                        }
                    }
                }
                , {
                    field: 'isEmail', title: '采用邮箱', width: 95
                    , templet: function (d) {
                        if (d.isEmail === 1) {
                            return "是";
                        } else {
                            return "否";
                        }
                    }
                }
                , {field: 'rootFileType', title: '文件类型', width: 100}
                , {field: 'rootFileMd5', title: '文件信息', width: 270}
                , {fixed: 'right', title: '操作', toolbar: '#barGroup', width: 130}
            ]]
        });
        //监听行工具事件
        table.on('tool(group-filter)', function (obj) {
            if (obj.event === 'delGroup') {
                layer.confirm('真的删除么？', function (index) {
                    $.ajax({
                        url:"group/view/del"+"?groupid="+obj.data.groupId,
                        success:function (re) {
                            if(re.result === "200"){
                                obj.del();
                                layer.close(index);
                            }else{
                            //    删除失败
                            }
                        }
                    });
                    obj.del();
                    layer.close(index);
                });
            } else if (obj.event === 'viewGroup') {
                // // console.log(obj)
                // gtable.url = "group/view/data?groupid="+obj.data.groupId;
                // gtable.reload();
                table.render({
                    elem: '#gdata'
                    , url: "group/view/data?groupid="+obj.data.groupId
                    , title: '组数据'
                    ,page: {
                        layout: ['limit', 'count', 'prev', 'page', 'next', 'skip'] //自定义分页布局
                        //,curr: 5 //设定初始在第 5 页
                        ,groups: 5 //只显示 1 个连续页码
                    }
                    , cols: [[
                        {field: 'gNumber', title: 'ID', sort: true}
                        , {field: 'gName', title: '姓名'}
                        , {field: 'gGroup', title: '组' }
                        , {field: 'gEmail', title: '邮箱'}
                    ]]
                });
            }
        });
    });

</script>
</body>
</html>

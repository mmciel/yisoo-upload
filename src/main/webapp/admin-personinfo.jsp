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

<form class="layui-form" action="" lay-filter="person-modify">
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">登录ID</label>
            <div class="layui-input-inline">
                <input type="text" id="userid" name="userid" disabled="disabled" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">YiSoo ID</label>
            <div class="layui-input-inline">
                <input type="text" id="yisooid" name="yisooid" disabled="disabled" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">用户昵称</label>
            <div class="layui-input-inline">
                    <input type="text" id="username"  name="username" lay-verify="title" autocomplete="off" class="layui-input">
                </div>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">手机</label>
            <div class="layui-input-inline">
                <input type="tel" id="phone" name="phone" lay-verify="required|phone" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">邮箱</label>
            <div class="layui-input-inline">
                <input type="text" id="email" name="email" lay-verify="email" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">超级权限</label>
        <div class="layui-input-block">
            <input type="checkbox" id="param" name="param" lay-skin="switch" lay-text="ON|OFF">
        </div>
    </div>
    <!-- <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">验证码</label>
            <div class="layui-input-inline">
                <input type="text" id="number" name="number" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div> -->
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit="" lay-filter="submit-person-modify">立即保存</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>个人密码修改</legend>
</fieldset>

<form class="layui-form" action="" lay-filter="person-password-modify">
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">原密码</label>
            <div class="layui-input-inline">
                    <input type="password" id="old_password"  name="old_password" lay-verify="password" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">新密码</label>
            <div class="layui-input-inline">
                    <input type="password" id="new_password"  name="new_password" lay-verify="password" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">重复密码</label>
            <div class="layui-input-inline">
                    <input type="password" id="renew_password"  name="renew_password" lay-verify="password" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit="" lay-filter="submit-person-password-modify">立即保存</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>



<blockquote class="layui-elem-quote layui-quote-nm">最后一次登录地址：<span id="login-ip"></span></blockquote>
<blockquote class="layui-elem-quote layui-quote-nm">最后一次登录时间：<span id="login-time"></span></blockquote>
<!-- 示例-970 -->
<ins class="adsbygoogle" style="display:inline-block;width:970px;height:90px" data-ad-client="ca-pub-6111334333458862" data-ad-slot="3820120620"></ins>
<script src="${APP_PATH}/lib/layui/layui.js" charset="utf-8"></script>
<!-- jQuery -->
<script src="${APP_PATH}/js/jquery.min.js"></script>
<script>
    var userObject;
    var yisooid = "${sessionScope.yisooid}";
    var userid = "${sessionScope.userid}";
    if(yisooid === "" || userid ===""){
        window.location.href = "login.jsp";
    }
    $.ajax({
        url:"user/admincheck",
        type:"post",
        data:{
                "yisooid":yisooid,
                "userid":userid
            },
        success:function (result) {
            if(result.result === 400){
                window.location.href = "error.jsp";
                // console.log(result);
            }else{
                userObject = result;
                $("#login-ip").text(userObject.loginLastIp);
                $("#login-time").text(new Date(userObject.loginLastTime).toJSON().substr(0, 19).replace('T', ' ').replace(/-/g, '.'));
                console.log(userObject);
            }
        }
     });
</script>
<script>
    layui.use(['form'], function(){
        var form = layui.form
            ,layer = layui.layer
        //自定义验证规则
        form.verify({
            title: function(value){
                if(value.length < 2){
                    return '至少2个字符';
                }
            }
        });

        //监听提交
        form.on('submit(submit-person-modify)', function(data){
            var temp = data.field;
            console.log(temp)
            $.ajax({
                url:"user/update",
                type:"post",
                data:{
                    "yisooid":yisooid,
                    "username":temp.username,
                    "email":temp.email,
                    "userphone":temp.phone
                },
                success:function (re) {
                    if(re.result === 400){
                        layer.msg(re.message, {
                            time: 20000, //20s后自动关闭
                            btn: ['好的']
                        });
                    }else{
                        layer.msg(re.message, {
                            time: 1500,
                            btn: ['好的']
                        });
                        // window.location.reload();
                    }
                }
            });
            return false;
        });


        //表单初始赋值
        form.val('person-modify', {
            "username": userObject.username
            ,"yisooid": userObject.yisooId
            ,"userid":userObject.userId
            ,"email": userObject.email
            ,"phone":userObject.userPhone
            ,"param": false //开关状态
        });

        //监听提交
        form.on('submit(submit-person-password-modify)', function(data){
            // var TempData = JSON.stringify(data.field);
            // console.log(data.field.old_password);
            $.ajax({
                url:"user/updatepassword",
                type:"post",
                data:{
                    "oldpw":data.field.old_password,
                    "newpw":data.field.new_password,
                    "yisooid":yisooid
                },
                success:function (re) {
                    if(re.result === 400){
                        layer.msg(re.message, {
                            time: 20000, //20s后自动关闭
                            btn: ['好的']
                        });
                    }else{
                        layer.msg(re.message, {
                            time: 1500,
                            btn: ['好的']
                        });
                        // window.location.reload();
                    }
                }
            });

            return false;
        });

    });
</script>

</body>
</html>
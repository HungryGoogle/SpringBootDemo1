<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>登录页面</title>
</head>
<body>
    <form action="/weblogin/addlogin" name="loginfrom" accept-charset="utf-8" method="post">
        <label class="label-tips" for="u">账号:</label>
        <input type="text" id="u" name="username" class="inputstyle"/>
        <div>
            <label class="lable-tips" for="password">密码:</label>
            <input type="password" id="password" name="password" class="inputstyle" />
        </div>
        <input type="submit" name="登录"/>
        <a href="/weblogin/register" class="zcxy" target="_blank">注册</a>
    </form>
</body>
</html>
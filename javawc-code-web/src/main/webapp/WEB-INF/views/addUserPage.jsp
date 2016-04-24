<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>测试</title>
  </head>
  <body>
  <form method="post" action="/addUser">
    <div>
      性别：<input type="text"  name="gender"  value="男" /><br>
      电话：<input type="text"  name="phone"  value="18600262504" /><br>
      登录名：<input type="text"  name="loginName"  value="jersey" /><br>
      登录密码：<input type="password"  name="passWord"  value="jingwen" /><br>
      电子邮箱：<input type="text"  name="email"  value="1427025972@qq.com" /><br>
      超级密码：<input type="text"  name="superPassWord"  value="6165311" /><br>
      <input type="submit" value="提交"/>
    </div>

  </form>

  </body>
</html>
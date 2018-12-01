<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
</head>
<body>
   <center>  
    ${requestScope.tx }<br>
            <h3>您好！请登录</h3>
       <form action="user_login" method="post">
          用户名:<input name="username" type="text" /><br><br>
          密   码:<input name="password" type="password"/><br><br>
          <input type="submit" value="登录" />
       </form>
    <p>没有账号？点击<a href="register.jsp">这里注册</a></p>
   </center>
</body>
</html>
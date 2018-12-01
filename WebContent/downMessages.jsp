<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户留言板</title>
</head>
<body>
   <center>
 
        ${requestScope.tx }<br>         
                <s:if test="#attr.user==null"> 
				<span class="blue">您好！请<a href="login.jsp">登录</a></span>
				</s:if>
				<s:else>
				<!-- <span class="blue"><s:property value="username"/>&nbsp;&nbsp;&nbsp;&nbsp;<a href="exitAction">[退出]</a></span> -->
				<span class="blue"><s:property value="#attr.user.username"/>,欢迎你!</p>&nbsp;&nbsp;&nbsp;&nbsp;<a href="exitAction">[退出]</a></span>
				</s:else>
   
<div class="main mt10">
<form action="messages_save"  align="center" method="post" >
<br>
<p>输入你的留言标题:</p>
<input type="text" name="title"/><br>
<p>输入你的留言:</p>
<textarea name="messages" rows="10" cols="36"></textarea>
<br>
<input type="submit" value="提交"/><br>
<input type="hidden" name="username" value="${user.getUsername() }" />
</form>	
<br>

<form action="messages_findall"  align="center"    method="post">
<input type="submit" value="查看留言"/></form>

<form action="messages_findByusername"  align="center"    method="post">
<input type="hidden" name="username" value="${user.getUsername() }" />
<input type="submit"  value="查看个人留言"/></form>

<form action="login.jsp"  align="center"   method="post">
<input type="submit" value="返回"/>
</form>
</center>
</div>
  
  
</body>
</html>
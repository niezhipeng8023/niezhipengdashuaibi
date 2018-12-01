<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改留言</title>
</head>
<body >
<center>  
<div class="main mt10">
<form action="messages_update"  align="center" method="post" name="form1">


<p>输入你的留言标题:</p>
<input type="text" name="title" value=""/><br>
<p>输入你的留言:</p>
<textarea name="messages" rows="10" cols="36"></textarea>
<br>
<input type="submit" value="修改留言"/><br>
<input type="hidden" name="mname" value="${user.getUsername() }" />
</form>	
<br>
</div>
</center>
</body>
</html>
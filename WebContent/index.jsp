<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <link href="css/Layout.css" rel="stylesheet" type="text/css" />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body>
 <%@taglib prefix="s" uri="/struts-tags" %>
    <div class="itop">
		<div class="itop_body">
			<div class="itop_left fl">欢迎光临星星书屋！</div>
			<div class="itop_right fl">
				<s:if test="#attr.user==null"> 
				<span class="blue"><a href="login.jsp">[登录]</a></span>
				</s:if>
				<s:else>
				<!-- <span class="blue"><s:property value="username"/>&nbsp;&nbsp;&nbsp;&nbsp;<a href="exitAction">[退出]</a></span> -->
				<span class="blue"><s:property value="#attr.user.username"/>&nbsp;&nbsp;&nbsp;&nbsp;<a href="exitAction">[退出]</a></span>
				</s:else>
				<span class="red"><a href="register.jsp">[注册]</a></span>
				<span><img src="images/d002.jpg"/></span>
				<span>购物车 <span class="red">5</span> 件</span>
			</div>
		</div>
	</div>
	<div class="clearall"></div>
<div class="header">
		<div class="logo fl"><img src="images/top.jpg"/></div>
		<div class="title fm">
				<h2>星星书屋</h2>
		</div>
	</div>
	<div class="menu">
		<div class="menu_center fl">
			
			<div class="dh_topd"><A href="downMessages.jsp">留言</A></div>
			<div class="dh_topd"><A href="messages_findall">查看留言</A></div>
			<div class="dh_topd"><A href="messages_findByusername">查看个人留言</A></div>
		</div>
	</div>
	

	<p>欢迎，留言请登录！</p>

</body>
</html>
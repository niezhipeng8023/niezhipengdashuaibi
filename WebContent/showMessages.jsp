<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看留言板</title>
</head>
<body>
   <center>
    ${requestScope.tx }<br>
  <table class="bordered"  border="2">
          <tr>
                  <td><a href="downMessages.jsp">增加留言</a></td>
                  <td></td>
                  <td></td>
                  <td><a href="showMessages.jsp">刷新</a>/<a href="login.jsp">返回</a></td>    
          </tr>
          <tr>
                  <th>留言用户</th>
                  <th>留言标题</th>
                  <th>留言时间</th>
                  <th>留言内容</th>
                 
          </tr>
  
   		<c:forEach items="${messall }" var="u">
   			<tr>
                <td><c:out value="${u.getUsername()}"></c:out></td>
                <td><c:out value="${u.getTitle()}"></c:out></td>
                <td><c:out value="${u.getTime()}"></c:out></td>
                <td><c:out value="${u.getMessages()}"></c:out></td>
                
            </tr>
   		
   		</c:forEach>
    </table>
    
   </center>
</body>
</html>
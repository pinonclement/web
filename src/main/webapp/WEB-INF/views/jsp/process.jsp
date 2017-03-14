<%@page import="user.dao.UserDao"%>  
<jsp:useBean id="obj" class="user.model.User"/>  
  
<jsp:setProperty property="*" name="obj"/>  
  
<%  
int status=UserDao.register(obj);  
if(status>0)  
out.print("You are successfully registered");  
else
out.print("you are not");
%> 
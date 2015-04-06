<%@ include file="../tags.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Welcome</title>
  </head>
  <body>
    <h1>Welcome To CRM Login System</h1>
    <form:form name="loginForm" action="login.do" method="post">
      <input id="loginName" name="loginName" type="text">
      <br />

      <input id="loginPassword" name="loginPassword" type="password">
      <br />

      <input id="loginButton" name="loginButton" type="submit" value="Login">
    </form:form>
  </body>
</html>

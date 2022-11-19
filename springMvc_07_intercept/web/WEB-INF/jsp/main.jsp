<%--
  Created by IntelliJ IDEA.
  User: adisihansun
  Date: 11/18/22
  Time: 21:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>首页</h1>
${username}
<a href="${pageContext.request.contextPath}/user/logout">注销</a>
</body>
</html>

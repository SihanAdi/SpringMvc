<%--
  Created by IntelliJ IDEA.
  User: adisihansun
  Date: 11/18/22
  Time: 12:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.6.1.js"></script>
    <script>
      function a1(){
        $.post({
          url:"${pageContext.request.contextPath}/ajax/a1",
          data: {"name":$("#txtName").val()},
          success: function (data){
            alert(data);
          }

        })
      }
    </script>
  </head>
  <body>
  <%--onblur：失去焦点触发事件--%>
  用户名:<input type="text" id="txtName" onblur="a1()"/>
  </body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: adisihansun
  Date: 11/18/22
  Time: 19:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.6.1.js"></script>
    <script>
      $(function (){
        $("#btn").click(function (){
          $.post("${pageContext.request.contextPath}/ajax/a2",function (data) {
            var html = "";
            for (let i = 0; i < data.length; i++) {
                html += "<tr>"
                        + "<td>" + data[i].name +"<td>"
                        + "<td>" + data[i].age + "</td>"
                        + "<td>" + data[i].sex + "</td>"
                        + "<tr>"
            }
            $("#content").html(html);
          })
        })
      })

    </script>
</head>
<body>
<input type="button" id="btn" value="load">
<table>
  <tr>
    <td>姓名</td>
    <td>年龄</td>
    <td>性别</td>
  </tr>
  <tbody id="content">

  </tbody>
</table>
</body>
</html>

<%@ page import="com.weikun.vo.Message1" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/11/2
  Time: 18:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>test</title>
    <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css">
    <style type="text/css">
        body {
            padding: 20px;

        }

    </style>
</head>

<body>


<h2>华语九天榜</h2>
<table class="table table-striped table-bordered">
    <%
        List<Message1> list=(List<Message1>)request.getAttribute("list");



    %>
    <tr>
        <th>序号</th>
        <th>发帖人</th>
        <th>邮箱</th>
        <th>标题</th>
        <th>内容</th>
        <th>发帖时间</th>
        <th>操作</th>
    </tr>
    <%

        int i=0;
        for(Message1 m :list){



    %>

    <tr>
        <td><%=++i%></td>
        <td><%=m.getName()%></td>
        <td><%=m.getEmail()%></td>
        <td><%=m.getTitle()%></td>
        <td><%=m.getContent()%></td>
        <td><%=m.getTzdate()%></td>

        <td><a href="message?action=del&id=<%=m.getId()%>">删除</a></td>
    </tr>

    <%

        }
    %>

</table>


</body>
</html>

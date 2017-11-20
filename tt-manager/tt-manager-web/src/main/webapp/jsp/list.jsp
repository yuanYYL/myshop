<%--
  User: Administrator
  Date: 2017/11/18
  Time: 22:14
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<html>
<head>
    <title></title>
</head>
<body>
   <form action="${pageContext.request.contextPath}/items" method="get">
       <table border="1px" align="center" width="80%">
           <tr>
               <td>商品号</td>
               <td>商品名</td>
               <td>价格</td>
               <td>库存</td>
               <td>销售信息</td>
           </tr>
           <div align="center"> <input type="text" name="item.title"/><input type="submit" value="搜索"></div>

       </table>
       <table border="1px" align="center">

            <c:forEach items="${pageBean.data}" var="item">
                <tr>
                <td>${item.id}</td>
                <td>${item.title}</td>
                <td>${item.price}</td>
                <td>${item.num}</td>
                <td>${item.sellPoint}</td>
                </tr>
            </c:forEach>

       </table>
   </form>
</body>
</html>
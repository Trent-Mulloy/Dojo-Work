<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
    <h1>Hello World</h1>
    <table class="table table-dark">
        <thead>
          <tr>
            <th scope="col">Name</th>
            <th scope="col">Price</th>
          </tr>
          <c:forEach var="fruit" items="${fruitsFromMyController}">
          <tr>
            <td><c:out value="${fruit.name}"></c:out></td>
            <td><c:out value="${fruit.price}"></c:out></td>
          </tr>
        </c:forEach>
        </tbody>
      </table>
</body>
</html> 
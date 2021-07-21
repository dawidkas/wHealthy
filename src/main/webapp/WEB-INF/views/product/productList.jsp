<%--
  Created by IntelliJ IDEA.
  User: noxeu
  Date: 21.07.2021
  Time: 21:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/header.jsp"/>

<div class="container-fluid">


    <p class="mb-4">
    <h3>Lista wszystkich produktów oraz ich wartości odżywczych w 100g</h3></p>
    <!-- Content Row -->
    <div class="row">

        <table class="table" border="1" >
            <thead>
            <tr>
                <th>Nazwa produktu</th>
                <th>Producent</th>
                <th>Liczba Kalorii</th>
                <th>Ilość węglowodanów</th>
                <th>Ilość białka</th>
                <th>Ilość tłuszczu</th>
                <th>Szczegóły</th>
                <th>Edycja</th>
                <th>Usuwanie</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${productList}" var="product">
                <tr>
                    <td><c:out value="${product.name}"/></td>
                    <td><c:out value="${product.brand}"/></td>
                    <td><c:out value="${product.calories}"/></td>
                    <td><c:out value="${product.carbs}"/></td>
                    <td><c:out value="${product.protein}"/></td>
                    <td><c:out value="${product.totalFat}"/></td>
                    <td><a href="/product/details/${product.id}">Szczegóły</a></td>
                    <td><a href="/product/edit/${product.id}">Edytuj</a></td>
                    <td><a href="/product/delete/${product.id}">Usuń</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>

<jsp:include page="/WEB-INF/footer.jsp"/>
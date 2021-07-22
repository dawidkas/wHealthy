<%--
  Created by IntelliJ IDEA.
  User: noxeu
  Date: 21.07.2021
  Time: 01:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<jsp:include page="/WEB-INF/header.jsp"/>

<!-- Begin Page Content -->
<div class="container-fluid">

    <div class="card-header py-3">
        <h6 class="m-0 font-weight-bold text-primary">Wyszukaj produkt po nazwie</h6>
    </div>

    <%--@elvariable id="product" type="pl.coderslab.model.Product"--%>
    <form:form method="post" modelAttribute="product">
        <div id="search">
            <div>
                <form:input path="name" type="text" name="searchString"/>
                <input type="submit" value=" Wyszukaj " />
            </div>
        </div>
    </form:form>
    <hr>
    <c:if test="${not empty product.name}">
        <p>Wartości spożywcze w 100g produktu</p>
    <table class="table" border="1">
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
        </tbody>
    </table>
    </c:if>
</div>
<!-- /.container-fluid -->

<jsp:include page="/WEB-INF/footer.jsp"/>
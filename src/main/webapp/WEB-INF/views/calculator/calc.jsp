<%--
  Created by IntelliJ IDEA.
  User: noxeu
  Date: 22.07.2021
  Time: 05:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<jsp:include page="/WEB-INF/header.jsp"/>

<!-- Begin Page Content -->
<div class="container-fluid">
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
            </tr>
            </tbody>
        </table>
        <hr>
    <div><p>Wprowadź liczbę gramów, aby obliczyć wartości odżywcze</p>
        <form>
        <input name="weight" type="number"/>
        <input type="submit" value=" Przelicz " />
        </form>
    </div>
    <c:if test="${not empty weight}">
        <p>Wartości spożywcze w ${weight}g produktu</p>
        <table class="table" border="1">
            <thead>
            <tr>
                <th>Nazwa produktu</th>
                <th>Producent</th>
                <th>Liczba Kalorii</th>
                <th>Ilość węglowodanów</th>
                <th>Ilość białka</th>
                <th>Ilość tłuszczu</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><c:out value="${product.name}"/></td>
                <td><c:out value="${product.brand}"/></td>
                <td><c:out value="${product.calories*weight/100}"/></td>
                <td><c:out value="${product.carbs*weight/100}"/></td>
                <td><c:out value="${product.protein*weight/100}"/></td>
                <td><c:out value="${product.totalFat*weight/100}"/></td>
            </tr>
            </tbody>
        </table>
    </c:if>
</div>
<!-- /.container-fluid -->

<jsp:include page="/WEB-INF/footer.jsp"/>
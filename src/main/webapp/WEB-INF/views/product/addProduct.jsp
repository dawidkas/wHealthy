<%--
  Created by IntelliJ IDEA.
  User: noxeu
  Date: 21.07.2021
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<jsp:include page="/WEB-INF/header.jsp"/>

<div class="container-fluid">

    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Dodawanie produktu do bazy danych</h6>
        </div>
        <div class="card-body">
            <%--@elvariable id="product" type="pl.coderslab.model.Product"--%>
            <form:form action="add" method="post" modelAttribute="product">
                <div class="col-sm-6">
                    <form:input path="name" type="text" class="form-control form-control-user"
                                placeholder="Nazwa produktu"/>
                </div>
                <div class="col-sm-6">
                    <form:input path="brand" type="text" class="form-control form-control-user"
                                placeholder="Producent/brand"/>
                </div>
                <div class="col-sm-6">
                    <form:input path="calories" type="text" class="form-control form-control-user"
                                placeholder="Liczba kilokalorii (Kcal)"/>
                </div>
                <div class="col-sm-6">
                    <form:input path="carbs" type="text" class="form-control form-control-user"
                                placeholder="Ilość węglowodanów"/>
                </div>
                <div class="col-sm-6">
                    <form:input path="sugar" type="text" class="form-control form-control-user"
                                placeholder="Cukry/węglowodany proste"/>
                </div>
                <div class="col-sm-6">
                    <form:input path="protein" type="text" class="form-control form-control-user"
                                placeholder="Ilość białka"/>
                </div>
                <div class="col-sm-6">
                    <form:input path="fiber" type="text" class="form-control form-control-user"
                                placeholder="Ilość błonnika"/>
                </div>
                <div class="col-sm-6">
                    <form:input path="totalFat" type="text" class="form-control form-control-user"
                                placeholder="Ilość tłuszczy"/>
                </div>
                <div class="col-sm-6">
                    <form:input path="transFat" type="text" class="form-control form-control-user"
                                placeholder="Tłuszcze nienasycone"/>
                </div>
                <div class="col-sm-6">
                    <form:input path="saturatedFat" type="text" class="form-control form-control-user"
                                placeholder="Tłuszcze nasycone"/>
                </div>
<%--                <div class="col-sm-6">--%>
<%--                    <form:input path="barcode" type="number" class="form-control form-control-user"--%>
<%--                                placeholder="Kod kreskowy"/>--%>
<%--                </div>--%>
                <input type="submit" class="btn btn-success btn-icon-split" value="Dodaj">
                <hr>
            </form:form>
        </div>
    </div>

</div>

<jsp:include page="/WEB-INF/footer.jsp"/>

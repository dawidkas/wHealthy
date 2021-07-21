<%--
  Created by IntelliJ IDEA.
  User: noxeu
  Date: 20.07.2021
  Time: 21:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--<c:set var="contextPath" value="${pageContext.request.contextPath}"/>--%>

<!DOCTYPE html>
<html>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>wHealthy - Rejestracja</title>

    <!-- Custom fonts for this template-->
    <link href="/theme/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
          rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="/theme/css/sb-admin-2.min.css" rel="stylesheet">

</head>

<body class="bg-gradient-primary">

<div class="container">

    <div class="card o-hidden border-0 shadow-lg my-5">
        <div class="card-body p-0">
            <!-- Nested Row within Card Body -->
            <div class="row">
                <div><a href="/"><img src="/theme/img/wHealthy.png"></a></div>
                <div class="col-lg-7">
                    <div class="p-5">
                        <div class="text-center">
                            <h1 class="h4 text-gray-900 mb-4">Stwórz konto!</h1>
                        </div>

                        <%--@elvariable id="user" type="pl.coderslab.model.User"--%>
                        <form:form action="register" method="post" modelAttribute="user">
                            <div class="form-group">
                                    <form:input path="username" type="text" class="form-control form-control-user"
                                                placeholder="Wprowadź login"/>
                            </div>

                            <div class="form-group">
                                <form:input path="email" type="email" class="form-control form-control-user"
                                            placeholder="Wprowadź adres email"/>
                            </div>

                            <div class="form-group">
                                    <form:input path="password" type="password" class="form-control form-control-user"
                                                placeholder="Hasło"/>
<%--                                <div class="col-sm-6">--%>
<%--                                    <input type="password" class="form-control form-control-user"--%>
<%--                                           id="exampleRepeatPassword" placeholder="Potwórz hasło"/>--%>
<%--                                </div>--%>
                            </div>
                            <input type="submit" class="btn btn-primary btn-user btn-block" value="Zarejestruj się">
                            <hr>
                        </form:form>


                        <div class="text-center">
                            <a class="small" href="/login">Masz już konto? Przejdź do logowania.</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>

<!-- Bootstrap core JavaScript-->
<script src="/theme/vendor/jquery/jquery.min.js"></script>
<script src="/theme/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="/theme/vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Custom scripts for all pages-->
<script src="/theme/js/sb-admin-2.min.js"></script>


</body>

</html>
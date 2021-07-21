<%--
  Created by IntelliJ IDEA.
  User: noxeu
  Date: 21.07.2021
  Time: 01:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>wHealthy</title>

    <!-- Custom fonts for this template-->
    <link href="/theme/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
          rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="/theme/css/sb-admin-2.min.css" rel="stylesheet">

    <style type="text/css">/* Chart.js */
    @keyframes chartjs-render-animation {
        from {
            opacity: .99
        }
        to {
            opacity: 1
        }
    }

    .chartjs-render-monitor {
        animation: chartjs-render-animation 1ms
    }

    .chartjs-size-monitor, .chartjs-size-monitor-expand, .chartjs-size-monitor-shrink {
        position: absolute;
        direction: ltr;
        left: 0;
        top: 0;
        right: 0;
        bottom: 0;
        overflow: hidden;
        pointer-events: none;
        visibility: hidden;
        z-index: -1
    }

    .chartjs-size-monitor-expand > div {
        position: absolute;
        width: 1000000px;
        height: 1000000px;
        left: 0;
        top: 0
    }

    .chartjs-size-monitor-shrink > div {
        position: absolute;
        width: 200%;
        height: 200%;
        left: 0;
        top: 0
    }</style>
</head>

<body id="page-top" class="">

<!-- Page Wrapper -->
<div id="wrapper">

    <!-- Sidebar -->
    <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

        <!-- Sidebar - Brand -->
        <a class="sidebar-brand d-flex align-items-center justify-content-center" href="/">
            <div class="sidebar-brand-text mx-3"><img src="/theme/img/wHealthy.png"></div>
        </a>

        <!-- Divider -->
        <hr class="sidebar-divider my-0">

        <!-- Nav Item - Dashboard -->
        <li class="nav-item">
            <a class="nav-link" href="/">
                <i class="fas fa-fw fa-tachometer-alt"></i>
                <span>Strona główna</span></a>
        </li>

        <!-- Divider -->
        <hr class="sidebar-divider">

        <li class="nav-item">
            <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                <i class="fas fa-fw fa-cog"></i>
                <span>Logowanie</span>
            </a>
            <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar" style="">
                <div class="bg-white py-2 collapse-inner rounded">
                    <h6 class="collapse-header">Opcje logowania</h6>
                    <a class="collapse-item" href="http://localhost:8080/login">Logowanie</a>
                    <a class="collapse-item" href="http://localhost:8080/register">Rejestracja</a>
                    <div class="collapse-divider"></div>
                </div>
            </div>
        </li>

        <!-- Divider -->
        <hr class="sidebar-divider">

        <!-- Nav Item - Wartości odżywcze -->
        <li class="nav-item">
            <a class="nav-link" href="http://localhost:8080/product/search">
                <i class="fas fa-fw fa-chart-area"></i>
                <span>Wyszukaj produkt</span></a>
        </li>

        <li class="nav-item">
            <a class="nav-link" href="http://localhost:8080/product/list">
                <i class="fas fa-fw fa-chart-area"></i>
                <span>Lista produktów</span></a>
        </li>

        <li class="nav-item">
            <a class="nav-link" href="http://localhost:8080/product/add">
                <i class="fas fa-fw fa-chart-area"></i>
                <span>Dodaj nowy produkt</span></a>
        </li>

        <!-- Divider -->
        <hr class="sidebar-divider">

            <!-- Nav Item - Tables -->
        <li class="nav-item">
            <a class="nav-link" href="http://localhost:8080/about">
                <i class="fas fa-fw fa-table"></i>
                <span>O wHealthy</span></a>
        </li>

        <!-- Divider -->
        <hr class="sidebar-divider d-none d-md-block">

        <!-- Sidebar Toggler (Sidebar) -->
        <div class="text-center d-none d-md-inline">
            <button class="rounded-circle border-0" id="sidebarToggle"></button>
        </div>

    </ul>
    <!-- End of Sidebar -->

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

        <!-- Main Content -->
        <div id="content">

            <!-- Topbar -->
            <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

                <!-- Sidebar Toggle (Topbar) -->
                <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                    <i class="fa fa-bars"></i>
                </button>

                <!-- Topbar Search -->
                <form class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
                    <div class="input-group">

                        <div class="input-group-append">

                        </div>
                    </div>
                </form>

                <!-- Topbar Navbar -->
                <ul class="navbar-nav ml-auto">
                    <!-- Nav Item - User Information -->
                    <li class="nav-item dropdown no-arrow"></li>
                </ul>
            </nav>
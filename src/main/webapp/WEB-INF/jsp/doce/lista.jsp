<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>AppPedidoPizza</title>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-light navbar-light">
    <div class="container-fluid">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link active" href="/">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/doce/lista">Doce</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/mista/lista">Mista</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/salgada/lista">Salgada</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/pizza/lista">Pizza</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/solicitante/lista">Solicitante</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/pedido/lista">Pedido</a>
            </li>
        </ul>
    </div>
</nav>

<div class="container mt-3">

    <h3>Cadastramento de pizzas doces</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>Tamanho</th>
            <th>valor</th>
            <th>Ingrediente</th>
            <th>C�digo</th>
            <th>Tipo</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="d" items="${listagem}">
            <tr>
                <td>${d.id}</td>
                <td>${d.nomeDaPizza}</td>
                <td>${d.tamanhoDaPizza}</td>
                <td>${d.valorDaPizza}</td>
                <td>${d.ingrediente}</td>
                <td>${d.codPizza}</td>
                <td>${d.tipoPizzaDoce}</td>
                <td><a href="/doce/${d.id}/excluir">excluir</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
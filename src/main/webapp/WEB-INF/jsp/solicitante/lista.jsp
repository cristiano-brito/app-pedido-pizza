<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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

   <h3>Cadastramento de Solicitantes</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>Telefone</th>
            <th>Endere�o</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="s" items="${listagem}">
            <tr>
                <td>${s.id}</td>
                <td>${s.nome}</td>
                <td>${s.telefone}</td>
                <td>${s.endereco}</td>
                <td><a href="/solicitante/${s.id}/excluir">excluir</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
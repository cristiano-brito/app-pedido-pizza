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
    <c:import url="/WEB-INF/jsp/menu.jsp"/>

    <div class="container mt-3">

       <h3>Cadastramento de Solicitantes</h3>

        <h4><a href="/solicitante">Novo</a></h4>

        <table class="table table-striped">
            <thead>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>Telefone</th>
                <th>Endere�o</th>
                <th>Usu�rio</th>
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
                    <td>${s.usuario.email}</td>
                    <td><a href="/solicitante/${s.id}/excluir">Excluir</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
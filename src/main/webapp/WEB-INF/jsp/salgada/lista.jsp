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

       <h3>Cadastramento de pizzas salgadas</h3>

        <h4><a href="/salgada">Novo</a></h4>

        <table class="table table-striped">
            <thead>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>Tamanho</th>
                <th>valor</th>
                <th>Ingrediente</th>
                <th>Código</th>
                <th>Tipo</th>
                <th>Borda Salgada</th>
                <th></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="s" items="${listagem}">
                <tr>
                    <td>${s.id}</td>
                    <td>${s.nomeDaPizza}</td>
                    <td>${s.tamanhoDaPizza}</td>
                    <td>${s.valorDaPizza}</td>
                    <td>${s.ingrediente}</td>
                    <td>${s.codPizza}</td>
                    <td>${s.tipoPizzaSalgada}</td>
                    <td>${s.comBordaSalgada}</td>
                    <td><a href="/salgada/${s.id}/excluir">excluir</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
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
    <c:import url="/WEB-INF/jsp/menu.jsp"/>

    <div class="container mt-3">

        <h3>Cadastramento de pizzas doces</h3>

        <h4><a href="/doce">Novo</a></h4>

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
                <th>Borda Doce</th>
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
                    <td>${d.comBordaDoce}</td>
                    <td><a href="/doce/${d.id}/excluir">excluir</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
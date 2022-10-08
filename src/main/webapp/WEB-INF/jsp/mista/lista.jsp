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

       <h3>Cadastramento de pizzas mistas</h3>

        <h4><a href="/mista">Novo</a></h4>

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
                <th>Borda Mista</th>
                <th></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="m" items="${listagem}">
                <tr>
                    <td>${m.id}</td>
                    <td>${m.nomeDaPizza}</td>
                    <td>${m.tamanhoDaPizza}</td>
                    <td>${m.valorDaPizza}</td>
                    <td>${m.ingrediente}</td>
                    <td>${m.codPizza}</td>
                    <td>${m.tipoPizzaMista}</td>
                    <td>${m.comBordaMista}</td>
                    <td><a href="/mista/${m.id}/excluir">excluir</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
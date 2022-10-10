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
    <h2>Cadastramento de Pizzas salgadas</h2>
    <form action="/salgada/incluir" method="post">
        <label>Borda da Pizza Mista</label>
        <label class="radio-inline">
            <input type="radio" name="comBordaSalgada" value="true" checked>Sim
        </label>
        <label class="radio-inline">
            <input type="radio" name="comBordaSalgada" value="false">Não
        </label>

        <c:import url="/WEB-INF/jsp/pizza/cadastro.jsp"/>

        <div class="mb-3 mt-3">
            <label>Tipo:</label>
            <input type="text" class="form-control" placeholder="Entre com o tipo salgada" name="tipoPizzaSalgada" value="salgada" readonly>
        </div>

        <button type="submit" class="btn btn-primary">Cadastrar</button>
    </form>
</div>
</body>
</html>
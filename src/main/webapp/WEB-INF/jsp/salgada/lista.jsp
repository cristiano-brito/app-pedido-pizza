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
    <h2>AppPedidoPizza</h2>
    <p>Projeto de Gestão de Pedidos de Pizza</p>

   <h3>Classe: Doce</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Nome</th>
            <th>Tamanho</th>
            <th>valor</th>
            <th>Ingrediente</th>
            <th>Código</th>
            <th>Tipo</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>Doce de leite</td>
            <td>Grande</td>
            <td>R$50.00</td>
            <td>Leite, açúcar, doce de leite</td>
            <td>5356363</td>
            <td>Doce</td>
        </tr>
        <tr>
            <td>tamanhoDaPizza</td>
            <td>char</td>
            <td>Tamanho da Pizza</td>
        </tr>
        <tr>
            <td>valorDaPizza</td>
            <td>double</td>
            <td>Preço da Pizza</td>
        </tr>
        <tr>
            <td>ingrediente</td>
            <td>String</td>
            <td>Ingredientes para produção da pizza</td>
        </tr>
        <tr>
            <td>codPizza</td>
            <td>Integer</td>
            <td>Código da Pizza</td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>
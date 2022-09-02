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

    <h3>Classe: Solicitante</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>nome</td>
            <td>String</td>
            <td>Nome do solicitante</td>
        </tr>
        <tr>
            <td>telefone</td>
            <td>String</td>
            <td>Telefone do solicitante</td>
        </tr>
        <tr>
            <td>endereco</td>
            <td>String</td>
            <td>Endereço do solicitante</td>
        </tr>
        </tbody>
    </table>

    <h3>Classe: Pedido</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>descricao</td>
            <td>String</td>
            <td>Descrição do pedido</td>
        </tr>
        <tr>
            <td>data</td>
            <td>LocalDateTime</td>
            <td>Data de realização do pedido</td>
        </tr>
        <tr>
            <td>web</td>
            <td>boolean</td>
            <td>Indicativo para um pedido online ou presencial</td>
        </tr>
        </tbody>
    </table>

    <h3>Classe: Doce</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>nomeDaPizza</td>
            <td>String</td>
            <td>Nome da pizza</td>
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

    <h3>Classe: Salgada</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>nomeDaPizza</td>
            <td>String</td>
            <td>Nome da pizza</td>
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

    <h3>Classe: Mista</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>nomeDaPizza</td>
            <td>String</td>
            <td>Nome da pizza</td>
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
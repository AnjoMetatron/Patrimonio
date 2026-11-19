<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>

<html >
<head>

    <title>FORMULARIO DE PATRIMONIO</title>
</head>
<body>

<h2>CADASTRO / EDIÇAO DE PATRIMONIO</h2>
<form action="/patrimonios/salvar" method="post">
<label>Nr Patrimonio</label>
    <input type="text" id="nrPatrimonio" name="nrPatrimonio" value="${patrimonio.nrPatrimonio}">


    <label>DESCRIÇÃO</label>
    <input type="text" id="descricao" name="descricao" value="${patrimonio.descricao}">

    <label>LOCAL</label>
    <input type="text" id="local" name="local" value="${patrimonio.local}">

<button type="submit">SALVAR</button>
<a href="/patrimonios ">CANCELAR</a>
</form>
























</body>
</html>





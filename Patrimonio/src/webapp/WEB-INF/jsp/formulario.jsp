<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>

<html >
<head>

    <title>FORMULARIO DE PATRIMONIO</title>
</head>
<body>

<h2>CADASTRO / EDIÇAO DE PATRIMONIO</h2>
<form action="/patrimonios/salvar" method="post">
<label for="">Nr Patrimonio</label>
    <input type="text" id="nrPatrimonio" name="nrPatrimonio" value="${patrimonio.nrPatrimonio}">


    <label for="">DESCRIÇÃO</label>
    <input type="text" id="descricao" name="descricao" value="${patrimonio.descricao}">

    <label for="">LOCAL</label>
    <input type="text" id="local" name="local" value="${patrimonio.local}">


</form>
























</body>
</html>





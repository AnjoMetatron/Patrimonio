<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<html xmlns:c="">
<head>
    <title> LISTA PATRIMONIO</title>
</head>
<body>

<h2>
CONTROLE DE PATRIMONIO
</h2>
<a href="/patrimonio/novo">CADASTRO NOVO</a>
<table>
    <thead>
        <th>ID</th> <th>NR PATRIMONIO</th> <th>DESCRIÇÃO</th> <th>LOCAL</th> <th>AÇÕES</th>
    </thead>
 <tbody>
          <c:forEach var="item" items="${listaPatrimonios}">
          <tr>

          <td>
          ${item.id}
          </td>

          <td>
          ${item.nrPatrimonio}
          </td>

          <td>
          ${item.descricao}
          </td>

          <td>
          ${item.local}
          </td>

          <td>

          </td>

          </tr>

<a href="/patrimonios/editar/${item.id}">EDITAR</a>
<a href="/patrimonios/excluir/${item.id}" onclick="return confirm('DESEJA EXCLUIR ESTE PATRIMONIO?')">EXCLUIR</a>
  </c:forEach>

    </tbody>




</table>










</body>
</html>

















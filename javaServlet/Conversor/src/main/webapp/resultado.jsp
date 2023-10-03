<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Resultado da Conversão</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <div class="container">
        <h1>Resultado da Conversão</h1>
        <table>
            <tr>
                <th>Moeda</th>
                <th>Valor Convertido</th>
            </tr>
            <tr>
                <td>Real</td>
                <td>${real}</td>
            </tr>
            <tr>
                <td>Dólar Americano</td>
                <td>${dolarAmericano}</td>
            </tr>
            <tr>
                <td>Euro</td>
                <td>${euro}</td>
            </tr>
            <tr>
                <td>Dólar Canadense</td>
                <td>${dolarCanadense}</td>
            </tr>
        </table>
        <a href="index.jsp" class="back-button">Voltar</a>
    </div>
</body>
</html>

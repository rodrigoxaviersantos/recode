<%@ page import="controller.ConversorMoedaController" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Resultado</title>
    <link rel="stylesheet" type="text/css" href="resultado.css">
</head>
<body>
    <div class="container">
        <h1>Resultado</h1>
        <div class="resultado">
            <% 
                double valorConvertido = Double.parseDouble(request.getParameter("valor"));
                String moedaDestino = request.getParameter("moedaDestino");
                ConversorMoedaController controller = new ConversorMoedaController();
                double resultado = controller.calcularResultado(valorConvertido, "USD", moedaDestino); // Supondo que o valor seja sempre em dólares (ou sua moeda base)
                out.println(resultado + " " + moedaDestino);
            %>
        </div>
    </div>
</body>
</html>

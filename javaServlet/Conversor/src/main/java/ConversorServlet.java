import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/ConversorServlet")
public class ConversorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double realValue = Double.parseDouble(request.getParameter("realValue"));
        
        // Realizar as conversões aqui
        double dolarAmericano = realValue * 5.30; // Exemplo de taxa de câmbio para o Dólar americano
        double real = realValue * 1.00; // Exemplo Real
        double euro = realValue * 6.20; // Exemplo de taxa de câmbio para o Euro
        double dolarCanadense = realValue * 4.25; // Exemplo de taxa de câmbio para o Dólar canadense
        
        request.setAttribute("dolarAmericano", dolarAmericano);
        request.setAttribute("real", real);
        request.setAttribute("euro", euro);
        request.setAttribute("dolarCanadense", dolarCanadense);
        
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}

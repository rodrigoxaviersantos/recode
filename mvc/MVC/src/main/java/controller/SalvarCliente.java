package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Cliente;

import java.io.IOException;


public class SalvarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SalvarCliente() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Cliente cli = new Cliente();
				cli.setNome(request.getParameter("nome"));
				cli.setTelefone(request.getParameter("telefone"));
				cli.setEmail(request.getParameter("email"));
				
				request.setAttribute("Cliente", cli);
				
				RequestDispatcher rd = request.getRequestDispatcher("sucesso.jsp");
				rd.forward(request, response);
	}

}

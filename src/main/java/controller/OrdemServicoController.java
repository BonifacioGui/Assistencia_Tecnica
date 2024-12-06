package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class OrdemServicoController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lógica para processar a requisição GET

        // Encaminha para a página de ordens de serviço
        request.getRequestDispatcher("/ordens.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lógica para processar o envio de dados via POST (formulários, por exemplo)

        // Encaminha para a página de ordens de serviço
        request.getRequestDispatcher("/ordens.jsp").forward(request, response);
    }
}

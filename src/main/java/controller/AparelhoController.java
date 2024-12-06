package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AparelhoController extends HttpServlet {
    // Método para processar requisições GET
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lógica para tratar a requisição, acessar dados, etc.
        // Você pode acessar parâmetros da URL com request.getParameter("nomeParametro");

        // Aqui você pode adicionar o código que recupera dados (por exemplo, de um banco de dados)

        // Depois de processar a requisição, encaminha para a página JSP
        request.getRequestDispatcher("/aparelhos.jsp").forward(request, response);
    }

    // Método para processar requisições POST
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Código para processar dados enviados por formulários, se necessário

        // Após processar, também podemos encaminhar para uma página JSP
        request.getRequestDispatcher("/aparelhos.jsp").forward(request, response);
    }
}

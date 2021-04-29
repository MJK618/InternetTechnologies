import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

import javax.servlet.annotation.*;

@WebServlet(name = "OrderServlet", value = "/OrderServlet", urlPatterns = {"/Q23","/order"})

public class OrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/GetUserInfo.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

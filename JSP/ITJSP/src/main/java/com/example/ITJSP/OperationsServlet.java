package com.example.ITJSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Objects;


@WebServlet(name = "OperationsServlet", value = "/OperationsServlet", urlPatterns = {"/Q19/OperationsServlet"})
public class OperationsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/operate.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        String operator = request.getParameter("operator");

        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        double answer = 0;
        String operation = null;
        if (Objects.equals(operator, "+")) {
            operation = "ADDITION";
            answer = n1 + n2;
        } else if (Objects.equals(operator, "-")) {
            operation = "SUBTRACTION";
            answer = n1 - n2;
        } else if (Objects.equals(operator, "*")) {
            operation = "MULTIPLICATION";
            answer = n1*n2;
        } else {
            operation = "DIVISION";
            answer = n1/n2;
        }
        request.setAttribute("operation", operation);
        request.setAttribute("operator", operator);
        request.setAttribute("answer", answer);
        doGet(request, response);

    }
}

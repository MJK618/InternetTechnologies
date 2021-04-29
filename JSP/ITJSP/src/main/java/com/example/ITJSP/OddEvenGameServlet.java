package com.example.ITJSP;

import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

import javax.servlet.annotation.*;

@WebServlet(name = "OddEvenGameServlet", value = "/OddEvenGameServlet", urlPatterns = {"/Q22","/Q22/game/result","/game"})

public class OddEvenGameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/oddeven.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String str = request.getParameter("str");
        String choice = request.getParameter("choice");
        response.setContentType("text/html");
        String demo = "";
        String displayMessage = "";
        for (int i=Integer.parseInt(choice); i<str.length(); i+=2) {
            demo += str.charAt(i);
        }
        String onlyConsonants = demo.replaceAll("[aeiouAEIOU]", "");



        if (onlyConsonants.length() > 0) {
            displayMessage = "You Loose";
        } else {
            displayMessage = "You Win";
        }
        if (Integer.parseInt(choice) == 0){
            choice = "Odd";
        } else {
            choice = "Even";
        }
        request.setAttribute("displayMessage", displayMessage);
        request.setAttribute("str", str);
        request.setAttribute("demo", demo);
        request.setAttribute("choice", choice);

        getServletContext().getRequestDispatcher("/oddevenresult.jsp").forward(request,response);


    }
}

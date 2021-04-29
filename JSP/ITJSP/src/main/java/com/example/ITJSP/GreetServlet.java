package com.example.ITJSP;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Date;

import javax.servlet.annotation.*;

@WebServlet(name = "GreetServlet", value = "/GreetServlet", urlPatterns = {"/Q21","/Q21/greet","/greet"})

public class GreetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Date date = java.util.Calendar.getInstance().getTime();
        int hours = date.getHours();
        String greetMessage;
        if(hours>=0 && hours<=12){
            greetMessage = "Good Morning";
        } else if(hours>=12 && hours<=15){
            greetMessage = "Good Afternoon";
        } else if(hours>=16 && hours<=20){
            greetMessage = "Good Evening";
        } else if(hours>=21 && hours<=24){
            greetMessage = "Good Night";
        } else {
            greetMessage = "Good ";
        }
        request.setAttribute("greetMessage", greetMessage);

        getServletContext().getRequestDispatcher("/greet.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        Date date = java.util.Calendar.getInstance().getTime();
        int hours = date.getHours();
        String greetMessage;
        if(hours>=0 && hours<=12){
            greetMessage = "Good Morning";
        } else if(hours>=12 && hours<=15){
            greetMessage = "Good Afternoon";
        } else if(hours>=16 && hours<=20){
            greetMessage = "Good Evening";
        } else if(hours>=21 && hours<=24){
            greetMessage = "Good Night";
        } else {
            greetMessage = "Good ";
        }
        request.setAttribute("greetMessage", greetMessage);
        request.setAttribute("name", name);
        getServletContext().getRequestDispatcher("/greet.jsp").forward(request,response);

    }
}

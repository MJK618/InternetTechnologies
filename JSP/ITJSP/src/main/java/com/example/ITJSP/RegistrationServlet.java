package com.example.ITJSP;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

import javax.servlet.annotation.*;

@WebServlet(name = "RegistrationServlet", value = "/RegistrationServlet", urlPatterns = {"/Q20/register"})

public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/registration.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String dob = request.getParameter("dob");
        String favfood = request.getParameter("favfood");
        String lnum = request.getParameter("lnum");

        String s_age = dob.substring(0, Math.min(dob.length(), 4));
        int age = 2021 - Integer.parseInt(s_age);
        if (age >=18) {
            request.setAttribute("fname", fname);
            request.setAttribute("lname", lname);
            request.setAttribute("email", email);
            request.setAttribute("age", age);
            request.setAttribute("dob", dob);
            request.setAttribute("favfood", favfood);
            request.setAttribute("lnum", lnum);
            doGet(request, response);
        } else {
            response.setContentType("text/html");

            // Hello
            PrintWriter out = response.getWriter();
            out.println("<html><head>\n" +
                    "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6\" crossorigin=\"anonymous\">\n" +
                    "\n" +
                    "    <title>Registration Failed | JSP-3</title>\n" +
                    "</head><body>");
            out.println("<div style=\"text-align: center;\">\n" +
                    "\n" +
                    "    <div class=\"container-fluid\">\n" +
                    "        <h1>Registration Failed | JSP-3 </h1>\n" +
                    "\n" +
                    "    </div>\n" +
                    "</div>");
            out.println("<div class=\"container-fluid mt-5 \">\n" +
                    "    <div class=\"container mt-2\">");
            out.println("<h3> OOPS!!!, Sorry we couldn't register you account because your age: "+ age +" is < 18.<br><br>" +
                    "<center>You are not an adult.</center></h1></div></div>");
            out.println("</body></html>");

        }

    }
}

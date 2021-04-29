package com.example.ITJSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DisplayPatternServlet", value = "/DisplayPatternServlet", urlPatterns = {"/Q18/DisplayPatternServlet"})
public class DisplayPatternServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pattern.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String num_1 = request.getParameter("num");
        int n = Integer.parseInt(num_1);
        String pattern = "";
        for (int i=0; i<n; i++){
            int count = 1;
            for(int j=0; j<=i; j++) {
                pattern += count + " ";
                count += 1;
            }
            pattern += "<br>";
        }
//
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + num_1 + "</h1>");
//        out.println("</body></html>");
//        out.println("Number received");
        request.setAttribute("pattern", pattern);

        doGet(request, response);
    }
}

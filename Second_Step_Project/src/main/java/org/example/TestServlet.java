package org.example;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TestServlet extends HttpServlet {
   protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws IOException {
       try (PrintWriter w = rs.getWriter())
       {
           w.println("Hello World");
       }
   }
}

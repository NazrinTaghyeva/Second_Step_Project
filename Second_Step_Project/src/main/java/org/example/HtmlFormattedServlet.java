package org.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HtmlFormattedServlet extends HttpServlet {
    protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws IOException {
        try (PrintWriter w = rs.getWriter()) {
            w.println("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <title>Tarzan</title>\n" +
                    "    <link rel=\"icon\" href=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSFZZU5Q9HS4s0UjXmcMd6kpAXik9u9Zs_XJA&usqp=CAU\">\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<form action=\"\" method=\"post\">\n" +
                    "    <input type=\"text\" name=\"name\">\n" +
                    "    <br>\n" +
                    "    <img src=\"https://i.pcmag.com/imagery/reviews/02ibIXDUJNJ3V7KL8jhUNFf-7..v1569480464.png\" width=\"150px\"\n" +
                    "         height=\"80px\">\n" +
                    "    <br>\n" +
                    "    <input type=\"submit\" value=\"Yes\">\n" +
                    "    <br>\n" +
                    "    <input type=\"submit\" value=\"No\">\n" +
                    "\n" +
                    "\n" +
                    "</form>\n" +
                    "</body>\n" +
                    "</html>"
            );
        }


    }

    protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws IOException {
        try(PrintWriter w = rs.getWriter())
        {
            String name = rq.getParameter("name");
              if (name.equalsIgnoreCase("Tarzan")){
               w.println("<!DOCTYPE html>\n" +
                       "<html lang=\"en\">\n" +
                       "<head>\n" +
                       "    <meta charset=\"UTF-8\">\n" +
                       "    <title>Tarzan</title>\n" +
                       "    <link rel=\"icon\" href=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSFZZU5Q9HS4s0UjXmcMd6kpAXik9u9Zs_XJA&usqp=CAU\">\n" +
                       "</head>\n" +
                       "<body>\n" +

                       "    <img src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQJAWIxK86aFW6OzO-KJ0kkek1jOTwsAd41r_mT6Z6A-vLcBbRW2-1hKjQ_MIWvq-ks7tE&usqp=CAU\" width=\"350px\"\n" +
                       "         height=\"350px\">\n" +


                       "</body>\n" +
                       "</html>");
              }
              else {
                  w.printf("user entered: %s ", name);
              }
        }

    }}

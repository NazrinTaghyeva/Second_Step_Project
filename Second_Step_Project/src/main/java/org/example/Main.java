package org.example;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class Main {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8082);
        ServletContextHandler handler = new ServletContextHandler();
        handler.addServlet(TestServlet.class,"/users");
        handler.addServlet(HtmlFormattedServlet.class,"/html");
        server.setHandler(handler);
        server.start();
        server.join();
    }
}
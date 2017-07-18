package main;

//import javax.servlet.ServletContext;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import servlets.AllRequestsServlet;

import java.lang.Exception;
import java.lang.String;

public class Main{
    public static void main(String[] args) throws Exception{
        AllRequestsServlet allRequestsServlet = new AllRequestsServlet();

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        //context.addServlet(new ServletHolder(allRequestsServlet), "/jira2jirasync");
        context.addServlet(new ServletHolder(allRequestsServlet), "/jira2jirasync");

        Server server = new Server(8080);
        server.setHandler(context);

        server.start();
        server.join();

    }
}
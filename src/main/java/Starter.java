import org.eclipse.jetty.server.Server;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;

/**
 * Created by AI on 29.04.2016.
 */
public class Starter {
    public static void main(String args[]){
        Frontend frontend = new Frontend();

        Server server = new Server(8080);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSION);
        server.setHandler(context);
        context.addServlet(new ServletHandler(frontend), '/authform');

        server.start();
        server.join();


    }
}

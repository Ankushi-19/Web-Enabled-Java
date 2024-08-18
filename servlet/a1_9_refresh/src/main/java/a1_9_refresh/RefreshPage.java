package a1_9_refresh;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AutoRefreshServlet")
public class RefreshPage extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        int refreshTime = 6;
        res.setIntHeader("Refresh", refreshTime);

        res.setContentType("text/html");

        PrintWriter out = res.getWriter();
        out.println("<html>");
        out.println("<head><title>Auto Refresh Servlet Page</title></head>");
        out.println("<body>");
        out.println("<h1>This servlet page will refresh every " + refreshTime + " seconds.</h1>");
        out.println("<p>The current time is: " + new java.util.Date() + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
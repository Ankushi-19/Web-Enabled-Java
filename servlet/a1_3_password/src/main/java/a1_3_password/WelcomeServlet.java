package a1_3_password;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	throws IOException{
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		out.println("<h1>Welcome Servlet</h1>");
	}

}

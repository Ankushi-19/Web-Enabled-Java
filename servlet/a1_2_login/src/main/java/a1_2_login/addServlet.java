package a1_2_login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class addServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)
	throws IOException{
		PrintWriter out=res.getWriter();
		
      String username=req.getParameter("username");
      String password=req.getParameter("password");
      String savePassword="1247";
      String saveUserName="Ankushi";
         if(username.equals(saveUserName) && password.equals(savePassword))
         {
        	 out.println("Hello Ankushi");
         }else 
         {
        	 out.println("Login Failed");
         }
	}
}

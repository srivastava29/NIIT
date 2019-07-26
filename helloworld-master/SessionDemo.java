package sessiondemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/session")
public class SessionDemo extends HttpServlet
{
protected void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException,ServletException{
PrintWriter out=response.getWriter();
String user_name=request.getParameter("name");
String role=request.getParameter("role");
String pass_word=request.getParameter("password");	
HttpSession http= request.getSession();
http.setAttribute("user_name", user_name);
http.setAttribute("role", role);
out.println(user_name+"   the role is  "+role);	
out.print("<form action='sessionservlet' method='post'>");
out.print("<input type='submit'>");
out.print("</form>");
}
}
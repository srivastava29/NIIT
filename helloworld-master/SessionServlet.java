package sessiondemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/sessionservlet")
public class SessionServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;
       
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	PrintWriter out=response.getWriter();
	HttpSession http=request.getSession(false);
	String name=(String)http.getAttribute("user_name");
	String role=(String)http.getAttribute("role");
	out.println(name+"   the role is  "+role);	
	int time=http.getMaxInactiveInterval();
	if(time==0) {
       http.invalidate();
	   out.println("Session Timeout");//Session has expired - redirect to login.jsp
	}}}
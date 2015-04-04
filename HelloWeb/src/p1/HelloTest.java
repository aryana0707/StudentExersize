package p1;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloTest extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<html>"
				+ "<body>"
				+ "<h1>SERVER RUNNING SUCCESSFULLY</h1>"
				+ "</body>"
				+ "</html>");
	}

}

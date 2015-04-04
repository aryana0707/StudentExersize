package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Hob extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String[] h=request.getParameterValues("hob");
		
		out.println("<html>"
				+ "<body>"
				+ "<h1>Your Hobbies are:</h1>");
		
		for(int i=0;i<h.length;i++){
			out.println(h[i]+" ");
		}
		out.println("</body>"
				+ "</html>");
	}

	
}

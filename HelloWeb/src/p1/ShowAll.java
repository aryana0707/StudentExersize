package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ShowAll extends HttpServlet {
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		out.println("<html>"
				+ "<body>"
				+ "<h1>Congratulation! Find your Details</h1>"
				+ "<table border='1' width='90%' bgcolor='pink'>"
				+ "<tr>"
				+ "<th>Parameter Names</th>"
				+ "<th>Paramter Values</th>"
				+ "</tr>");
		Enumeration e=request.getParameterNames();
		while(e.hasMoreElements()){
			String names=(String)e.nextElement();
			String values=request.getParameter(names);
			out.println("<tr>"
					+ "<td>"+names+"</td>"
							+ "<td>"+values+"</td>"
					+ "</tr>"
					);
			
		}
		out.println("</table>"
				+ "</body>"
				+ "</html>");
		
	}

}

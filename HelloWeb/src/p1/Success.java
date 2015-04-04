package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Success extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String uname=request.getParameter("uname");

		java.util.Date dd=new java.util.Date(request.getParameter("dob"));
		try{
		int age=Integer.parseInt(request.getParameter("age"));
		
		request.setAttribute("key1", uname);
		request.setAttribute("key2", age);
		request.setAttribute("key3", dd);
		
		RequestDispatcher rd=request.getRequestDispatcher("ok.jsp");
		rd.forward(request, response);
		}catch(Exception e){
			System.out.println(e);
			RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
		}
	
		
	}

	
	
}

package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Admin extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		try{
			Connection con=Connect.getCon();
			
			String name=request.getParameter("uname");
			String pass=request.getParameter("upass");
			
			HttpSession  session=request.getSession();
			
			String sql="select * from admin where username=? AND password=?";
			PreparedStatement pst=con.prepareStatement(sql);
			
			pst.setString(1, name);
			pst.setString(2, pass);
			System.out.println("1");
			
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				System.out.println("2");
				String name1=rs.getString("username");
				session.setAttribute("admin", name1);
				
				RequestDispatcher rd=request.getRequestDispatcher("adminAfter");
				rd.forward(request, response);
						
			}else{
				RequestDispatcher rd=request.getRequestDispatcher("errorA.jsp");
				rd.forward(request, response);
			}
		}catch(Exception e){
			System.out.println(e);
			RequestDispatcher rd=request.getRequestDispatcher("errorA.jsp");
			rd.forward(request, response);
		}
	}


}

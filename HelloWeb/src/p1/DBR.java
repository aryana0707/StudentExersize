package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.text.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DBR extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		
		try{
			
			Connection conn=Connect.getCon();
			
			PreparedStatement pst=null;			
			String sql="insert into UserData values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";			
			pst=conn.prepareStatement(sql);
			
			pst.setString(1, request.getParameter("fname"));
			request.setAttribute("key", request.getParameter("fname"));
			
			pst.setString(2, request.getParameter("emailid"));
			pst.setString(3, request.getParameter("uname"));
			pst.setInt(4, Integer.parseInt(request.getParameter("zip")));
			
			pst.setString(5, request.getParameter("upass"));
			pst.setString(6, request.getParameter("addr"));
			
			java.util.Date dob=new java.util.Date(request.getParameter("dob"));
			java.sql.Date dd=new java.sql.Date(dob.getTime());
			pst.setDate(7, dd);
			
			pst.setString(8, request.getParameter("gen"));
			pst.setString(9, request.getParameter("mob"));
			pst.setString(10, request.getParameter("country"));
			pst.setString(11, request.getParameter("state"));
			
			pst.setString(12, request.getParameter("ques"));
			pst.setString(13, request.getParameter("ans"));
			
			SimpleDateFormat sim=new SimpleDateFormat("dd-MMM-yyyy:hh:mm:ss aaa");
			java.util.Date d=new java.util.Date();
			String dor=sim.format(d);
			
			pst.setString(14, dor);
			
			int x=pst.executeUpdate();
			
			if(x>0){
				RequestDispatcher rd=request.getRequestDispatcher("afterR.jsp");
				rd.forward(request, response);
						
			}
			
			
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(e);
			
			RequestDispatcher rd=request.getRequestDispatcher("errorR.jsp");
			rd.forward(request, response);
		}
	}

	
}

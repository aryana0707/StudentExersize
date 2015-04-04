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

public class LoginProcess extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		
		try{
			
			Connection conn=Connect.getCon();
			String sql="select * from userdata where USERNAME=? AND PASSWORD=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			
			pst.setString(1, request.getParameter("uname"));
			pst.setString(2, request.getParameter("upass"));
			
			ResultSet rs=pst.executeQuery();
			
			if(rs.next()){
				
				String username=rs.getString("USERNAME");
				session.setAttribute("u", username);
				RequestDispatcher rd=request.getRequestDispatcher("logsuccess.jsp");
				rd.forward(request, response);
			}else{
				RequestDispatcher rd=request.getRequestDispatcher("logerr.jsp");
				rd.forward(request, response);
			}
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(e);
			RequestDispatcher rd=request.getRequestDispatcher("logerr.jsp");
			rd.forward(request, response);
		}
	}

}

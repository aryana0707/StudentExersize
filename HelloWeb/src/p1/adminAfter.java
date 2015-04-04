package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class adminAfter extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		
		String name=(String)session.getAttribute("admin");
		
		out.println("<html>"
				+ "<body>"
				+ "<h1>Congratulation! "+name+ "</h1>"
						+ "<hr/>"
						+ "<br/>"
						+ "<table align='center' border='1' bgcolor='lightblue' cellspacing='8' cellpadding='8'>"
						+ "<tr bgcolor='pink'>"
						+ "<th>Full Name</th>"
						+ "<th>Email</th>"
						+ "<th>Address</th>"
						+ "<th>Date of Birth</th>"
						+ "<th>Mobile Number</th>"
						+ "<th>Date of Registration</th>"
						+ "<th>View</th>"
						+ "<th>Edit</th>"
						+ "<th>Delete</th>"
						+ "</tr>");
		try{
			
			Connection conn=Connect.getCon();
			String sql="select * from USERDATA";
			PreparedStatement pst=conn.prepareStatement(sql);
			
			ResultSet rs=pst.executeQuery();
			
			while(rs.next()){
				out.println("<tr>"
						+ "<td>"+rs.getString("FULL_NAME")+"</td>"
						+ "<td>"+rs.getString("EMAIL")+"</td>"
						+ "<td>"+rs.getString("ADDRESS")+"</td>"
						+ "<td>"+rs.getString("DATE_OF_BIRTH")+"</td>"
						+ "<td>"+rs.getString("MOBILE")+"</td>"
						+ "<td>"+rs.getString("DATE_OF_REGISTRATION")+"</td>"
						+ "<td><a href='view.jsp'><input type='button' value='View'></a></td>"
						+ "<td><a href='edit.jsp'><input type='button' value='Edit'></a></td>"
						+ "<td><a href='del.jsp'><input type='button' value='Delete'></a></td>"
						+ "</tr>");
			}
			
		}catch(Exception e){
			System.out.println(e);
		}
		
		out.println("</table>"
				+ "</body>"
				+ "</html>");
	}

}

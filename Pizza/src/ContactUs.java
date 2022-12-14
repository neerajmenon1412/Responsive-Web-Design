import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContactUs extends HttpServlet
{
	@Override
	public void init() throws ServletException{super.init();}
	
	@Override
	public void destroy(){super.destroy();}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
	{
		String contactname = req.getParameter("contactname");
		String contactemail = req.getParameter("contactemail");
		String contactsubject = req.getParameter("contactsubject");
		String contactmsg = req.getParameter("contactmsg");

		System.out.println(contactname+contactemail+contactsubject+contactmsg);
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
			PreparedStatement ps =con.prepareStatement("insert into pizza.contactus values(?,?,?,?)");
	        ps.setString(1, contactname);
	        ps.setString(2, contactemail);
	        ps.setString(3, contactsubject);
	        ps.setString(4, contactmsg);
	        ps.execute();
	        System.out.println("Records added successfully...!");
	        con.close();
	        
	        RequestDispatcher rs = req.getRequestDispatcher("home.html");
	        rs.forward(req, res);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

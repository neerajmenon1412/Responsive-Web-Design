import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Signup extends HttpServlet
{

	@Override
	public void init() throws ServletException
	{
		System.out.println("In init()");
		super.init();
	}
	
	@Override
	public void destroy(){super.destroy();}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
	{
		String first_name = req.getParameter("fname");
		String last_name = req.getParameter("lname");
		String apartment = req.getParameter("apartment");
		String town = req.getParameter("town");
		int postcode = Integer.parseInt(req.getParameter("postcode"));
		double phone = Double.parseDouble(req.getParameter("phone"));
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		HttpSession session = req.getSession();
		session.setAttribute("exist","false");

		try
		{	Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
			PreparedStatement ps1 =con.prepareStatement("select * from pizza.users");
			
			ResultSet rs = ps1.executeQuery();
			
			while(rs.next())
			{
				if(rs.getString(7).equals(email))
				{
					System.out.println("User already exist");
					session.setAttribute("exist", "true");
					//rs.close();
					//con.close();
					res.sendRedirect("login-signup.jsp");
				}
			}
			
			if(session.getAttribute("exist").equals("false"))
			{
				rs.close();
				
				PreparedStatement ps2 =con.prepareStatement("insert into pizza.users values(?,?,?,?,?,?,?,?)");
				ps2.setString(1, first_name);
				ps2.setString(2, last_name);
				ps2.setString(3, apartment);
				ps2.setString(4, town);
				ps2.setInt(5, postcode);
				ps2.setDouble(6, phone);
				ps2.setString(7, email);
				ps2.setString(8, password);
		        
				ps2.execute();

		        System.out.println("Records addres successfully in users table..!");
		        
		        con.close();
		        
		        res.sendRedirect("http://localhost:8080/Pizza/");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
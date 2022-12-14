import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Subscribe extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException
	{
		String subscribe_email = req.getParameter("subscribe_email");
		String page = req.getParameter("page");
		
		System.out.println("page = "+page);

		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
			PreparedStatement stmt = con.prepareStatement("insert into pizza.subscribe values(?)");
			
			stmt.setString(1, subscribe_email);
			
			int i = stmt.executeUpdate();
			
			if(i == 1)
			{
				System.out.println("subscribed successfully....!");
			}
			
			if(page.equals("contact"))
			{
				resp.sendRedirect("contactus.jsp");	
			}
			else if(page.equals("checkout"))
			{
				resp.sendRedirect("checkout.jsp");
			}
			else if(page.equals("lo-si"))
			{
				resp.sendRedirect("login-signup.jsp");
			}
			else if(page.equals("home"))
			{
				resp.sendRedirect("http://localhost:8080/Pizza/");
			}
			else if(page.equals("about"))
			{
				resp.sendRedirect("about.jsp");
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
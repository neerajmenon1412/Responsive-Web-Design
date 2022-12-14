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
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet
{
	@Override
	public void init() throws ServletException{super.init();}
	
	@Override
	public void destroy(){super.destroy();}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
	{
		String username = req.getParameter("uemail");
		String userpassword = req.getParameter("upass");

		RequestDispatcher rs;
		
		HttpSession session = req.getSession();
		session.setAttribute("email", null);
		
		if(checkUser(username, userpassword))
        {
			session.setAttribute("email", username);
			System.out.println("getContextPath = "+req.getContextPath());
			//rs = req.getRequestDispatcher(req.getContextPath()+"/shop-catalog.jsp");
            //rs.forward(req, res);
            res.sendRedirect("shop-catalog.jsp");
        }
        else
        {
        	session.setAttribute("email", "fail");
        	System.out.println("Username or Password incorrect");
        	//rs = req.getRequestDispatcher("login-signup.jsp");
        	//rs.forward(req, res);
        	res.sendRedirect("login-signup.jsp");
        }
	}
	
	public boolean checkUser(String username,String userpassword) 
	{
		boolean st = false;
		
		Connection con=null;
		try
		{	Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
			PreparedStatement ps =con.prepareStatement("select * from pizza.users where email=? and user_pass=?");
	        ps.setString(1, username);
	        ps.setString(2, userpassword);
	        ResultSet rs = ps.executeQuery();
	        st = rs.next();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return st;
	}
}
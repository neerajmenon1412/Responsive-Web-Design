import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class NewDeliveryAddress extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException
	{
		boolean check = req.getParameter("check") != null;
		
		String fname,lname,address,town;
		
		int postcode=0;
		long phone=0;
		
		boolean bbqchicken = false;
		boolean periperichicken = false;
		boolean chickenbonanza = false;
		boolean meatdeluxe = false;
		boolean chickensupreme = false;
		boolean exoticmushroom = false;
		boolean vegmediterranean = false;
		boolean chickenmexicana = false;
		boolean vegextravaganza = false;
		boolean countryspecial = false;
		boolean zestychicken = false;
		boolean chickenmediterranean = false;
		boolean vegprimavera = false;
		boolean peppypaneer = false;
		boolean vegsupreme = false;
		boolean roastbeetroot = false;
		
		if(check == true)
		{
			fname = req.getParameter("fname");
			lname = req.getParameter("lname");
			address = req.getParameter("address");
			town = req.getParameter("town");
			postcode = Integer.parseInt(req.getParameter("postcode"));
			phone = Long.parseLong(req.getParameter("phone"));
		}
		else
		{
			ArrayList al = (ArrayList)req.getSession().getAttribute("address");
			fname = (String) al.get(0);
			lname = (String) al.get(1);
			address = (String) al.get(2);
			town = (String) al.get(3);
			postcode = Integer.parseInt(al.get(4).toString());
			phone = Long.parseLong(al.get(5).toString());
		}

		String email = (String)req.getSession().getAttribute("email");
		
		int total_pizza = (int)req.getSession().getAttribute("total_pizza");
		String pizza_name[] = (String[])req.getSession().getAttribute("pizza_name");
		Integer[] quantity = (Integer[])req.getSession().getAttribute("pizza_quantity");
		Integer[] pizza_size = (Integer[])req.getSession().getAttribute("pizza_size");
		float order_total = 0;
			
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
			PreparedStatement stmt = con.prepareStatement("insert into pizza.user_order values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				
			stmt.setString(1, fname);
			stmt.setString(2, lname);
			stmt.setString(3, address);
			stmt.setString(4, town);
			stmt.setInt(5, postcode);
			stmt.setLong(6, phone);
			stmt.setString(7, email);
			
			System.out.println("total_pizza = "+total_pizza);
			
			for(int i=0;i<total_pizza;i++)
			{
				order_total = order_total + quantity[i]*pizza_size[i];
				
				if(pizza_name[i].equals("BBQ Chicken"))
				{
					bbqchicken = true;
					
					stmt.setInt(8, quantity[i]);
					
					if(pizza_size[i]<300)
					{
						stmt.setString(9, "Small");
					}
					else if(pizza_size[i]>300 && pizza_size[i]<500)
					{
						stmt.setString(9, "Medium");
					}
					else if(pizza_size[i]>500)
					{
						stmt.setString(9, "Large");
					}
					
					stmt.setInt(10, quantity[i]*pizza_size[i]);
				}
				else if(bbqchicken == false)
				{
					stmt.setInt(8, java.sql.Types.NULL);
					stmt.setString(9, null);
					stmt.setInt(10, java.sql.Types.NULL);
				}
				
				if(pizza_name[i].equals("Peri-Peri Chicken"))
				{
					periperichicken = true;
					System.out.println("in peri");
					stmt.setInt(11, quantity[i]);
					
					if(pizza_size[i]<300)
					{
						stmt.setString(12, "Small");
					}
					else if(pizza_size[i]>300 && pizza_size[i]<500)
					{
						stmt.setString(12, "Medium");
					}
					else if(pizza_size[i]>500)
					{
						stmt.setString(12, "Large");
					}
					
					stmt.setInt(13, quantity[i]*pizza_size[i]);
				}
				else if(periperichicken == false)
				{
					stmt.setInt(11, java.sql.Types.NULL);
					stmt.setString(12, null);
					stmt.setInt(13, java.sql.Types.NULL);
				}
				
				if(pizza_name[i].equals("Chicken Bonanza"))
				{
					chickenbonanza = true;
					
					stmt.setInt(14, quantity[i]);
					
					if(pizza_size[i]<300)
					{
						stmt.setString(15, "Small");
					}
					else if(pizza_size[i]>300 && pizza_size[i]<500)
					{
						stmt.setString(15, "Medium");
					}
					else if(pizza_size[i]>500)
					{
						stmt.setString(15, "Large");
					}
					
					stmt.setInt(16, quantity[i]*pizza_size[i]);
				}
				else if(chickenbonanza == false)
				{
					stmt.setInt(14, java.sql.Types.NULL);
					stmt.setString(15, null);
					stmt.setInt(16, java.sql.Types.NULL);
				}
				
				if(pizza_name[i].equals("Meat Deluxe"))
				{
					meatdeluxe = true;
					
					stmt.setInt(17, quantity[i]);
					
					if(pizza_size[i]<300)
					{
						stmt.setString(18, "Small");
					}
					else if(pizza_size[i]>300 && pizza_size[i]<500)
					{
						stmt.setString(18, "Medium");
					}
					else if(pizza_size[i]>500)
					{
						stmt.setString(18, "Large");
					}
					
					stmt.setInt(19, quantity[i]*pizza_size[i]);
				}
				else if(meatdeluxe == false)
				{
					stmt.setInt(17, java.sql.Types.NULL);
					stmt.setString(18, null);
					stmt.setInt(19, java.sql.Types.NULL);
				}
				
				if(pizza_name[i].equals("Chicken Supreme"))
				{
					chickensupreme = true;
					
					stmt.setInt(20, quantity[i]);
					
					if(pizza_size[i]<300)
					{
						stmt.setString(21, "Small");
					}
					else if(pizza_size[i]>300 && pizza_size[i]<500)
					{
						stmt.setString(21, "Medium");
					}
					else if(pizza_size[i]>500)
					{
						stmt.setString(21, "Large");
					}
					
					stmt.setInt(22, quantity[i]*pizza_size[i]);
				}
				else if(chickensupreme == false)
				{
					stmt.setInt(20, java.sql.Types.NULL);
					stmt.setString(21, null);
					stmt.setInt(22, java.sql.Types.NULL);
				}
				
				if(pizza_name[i].equals("Exotic Mushroom"))
				{
					exoticmushroom = true;
					
					stmt.setInt(23, quantity[i]);
					
					if(pizza_size[i]<300)
					{
						stmt.setString(24, "Small");
					}
					else if(pizza_size[i]>300 && pizza_size[i]<500)
					{
						stmt.setString(24, "Medium");
					}
					else if(pizza_size[i]>500)
					{
						stmt.setString(24, "Large");
					}
					
					stmt.setInt(25, quantity[i]*pizza_size[i]);
				}
				else if(exoticmushroom == false)
				{
					stmt.setInt(23, java.sql.Types.NULL);
					stmt.setString(24, null);
					stmt.setInt(25, java.sql.Types.NULL);
				}
				
				if(pizza_name[i].equals("Veg Mediterranean"))
				{
					vegmediterranean = true;
					
					stmt.setInt(26, quantity[i]);
					
					if(pizza_size[i]<300)
					{
						stmt.setString(27, "Small");
					}
					else if(pizza_size[i]>300 && pizza_size[i]<500)
					{
						stmt.setString(27, "Medium");
					}
					else if(pizza_size[i]>500)
					{
						stmt.setString(27, "Large");
					}
					
					stmt.setInt(28, quantity[i]*pizza_size[i]);
				}
				else if(vegmediterranean == false)
				{
					stmt.setInt(26, java.sql.Types.NULL);
					stmt.setString(27, null);
					stmt.setInt(28, java.sql.Types.NULL);
				}
				
				if(pizza_name[i].equals("Chicken Mexicana"))
				{
					chickenmexicana = true;
					
					stmt.setInt(29, quantity[i]);
					
					if(pizza_size[i]<300)
					{
						stmt.setString(30, "Small");
					}
					else if(pizza_size[i]>300 && pizza_size[i]<500)
					{
						stmt.setString(30, "Medium");
					}
					else if(pizza_size[i]>500)
					{
						stmt.setString(30, "Large");
					}
					
					stmt.setInt(31, quantity[i]*pizza_size[i]);
				}
				else if(chickenmexicana == false)
				{
					stmt.setInt(29, java.sql.Types.NULL);
					stmt.setString(30, null);
					stmt.setInt(31, java.sql.Types.NULL);
				}
				
				if(pizza_name[i].equals("Veg Extravaganza"))
				{
					vegextravaganza = true;
					
					stmt.setInt(32, quantity[i]);
					
					if(pizza_size[i]<300)
					{
						stmt.setString(33, "Small");
					}
					else if(pizza_size[i]>300 && pizza_size[i]<500)
					{
						stmt.setString(33, "Medium");
					}
					else if(pizza_size[i]>500)
					{
						stmt.setString(33, "Large");
					}
					
					stmt.setInt(34, quantity[i]*pizza_size[i]);
				}
				else if(vegextravaganza == false)
				{
					stmt.setInt(32, java.sql.Types.NULL);
					stmt.setString(33, null);
					stmt.setInt(34, java.sql.Types.NULL);
				}
				
				if(pizza_name[i].equals("Country Special"))
				{
					countryspecial = true;
					
					stmt.setInt(35, quantity[i]);
					
					if(pizza_size[i]<300)
					{
						stmt.setString(36, "Small");
					}
					else if(pizza_size[i]>300 && pizza_size[i]<500)
					{
						stmt.setString(36, "Medium");
					}
					else if(pizza_size[i]>500)
					{
						stmt.setString(36, "Large");
					}
					
					stmt.setInt(37, quantity[i]*pizza_size[i]);
				}
				else if(countryspecial == false)
				{
					stmt.setInt(35, java.sql.Types.NULL);
					stmt.setString(36, null);
					stmt.setInt(37, java.sql.Types.NULL);
				}
				
				if(pizza_name[i].equals("Zesty Chicken"))
				{
					zestychicken = true;
					
					stmt.setInt(38, quantity[i]);
					
					if(pizza_size[i]<300)
					{
						stmt.setString(39, "Small");
					}
					else if(pizza_size[i]>300 && pizza_size[i]<500)
					{
						stmt.setString(39, "Medium");
					}
					else if(pizza_size[i]>500)
					{
						stmt.setString(39, "Large");
					}
					
					stmt.setInt(40, quantity[i]*pizza_size[i]);
				}
				else if(zestychicken == false)
				{
					stmt.setInt(38, java.sql.Types.NULL);
					stmt.setString(39, null);
					stmt.setInt(40, java.sql.Types.NULL);
				}
				
				if(pizza_name[i].equals("Chicken Mediterranean"))
				{
					chickenmediterranean = true;
					
					stmt.setInt(41, quantity[i]);
					
					if(pizza_size[i]<300)
					{
						stmt.setString(42, "Small");
					}
					else if(pizza_size[i]>300 && pizza_size[i]<500)
					{
						stmt.setString(42, "Medium");
					}
					else if(pizza_size[i]>500)
					{
						stmt.setString(42, "Large");
					}
					
					stmt.setInt(43, quantity[i]*pizza_size[i]);
				}
				else if(chickenmediterranean == false)
				{
					stmt.setInt(41, java.sql.Types.NULL);
					stmt.setString(42, null);
					stmt.setInt(43, java.sql.Types.NULL);
				}
				
				if(pizza_name[i].equals("Veg Primavera"))
				{
					vegprimavera = true;
					
					stmt.setInt(44, quantity[i]);
					
					if(pizza_size[i]<300)
					{
						stmt.setString(45, "Small");
					}
					else if(pizza_size[i]>300 && pizza_size[i]<500)
					{
						stmt.setString(45, "Medium");
					}
					else if(pizza_size[i]>500)
					{
						stmt.setString(45, "Large");
					}
					
					stmt.setInt(46, quantity[i]*pizza_size[i]);
				}
				else if(vegprimavera == false)
				{
					stmt.setInt(44, java.sql.Types.NULL);
					stmt.setString(45, null);
					stmt.setInt(46, java.sql.Types.NULL);
				}
				
				if(pizza_name[i].equals("Peppy Paneer"))
				{
					peppypaneer = true;
					
					stmt.setInt(47, quantity[i]);
					
					if(pizza_size[i]<300)
					{
						stmt.setString(48, "Small");
					}
					else if(pizza_size[i]>300 && pizza_size[i]<500)
					{
						stmt.setString(48, "Medium");
					}
					else if(pizza_size[i]>500)
					{
						stmt.setString(48, "Large");
					}
					
					stmt.setInt(49, quantity[i]*pizza_size[i]);
				}
				else if(peppypaneer == false)
				{
					stmt.setInt(47, java.sql.Types.NULL);
					stmt.setString(48, null);
					stmt.setInt(49, java.sql.Types.NULL);
				}
				
				if(pizza_name[i].equals("Vegetarian Supreme"))
				{
					vegsupreme = true;
					
					stmt.setInt(50, quantity[i]);
					
					if(pizza_size[i]<300)
					{
						stmt.setString(51, "Small");
					}
					else if(pizza_size[i]>300 && pizza_size[i]<500)
					{
						stmt.setString(51, "Medium");
					}
					else if(pizza_size[i]>500)
					{
						stmt.setString(51, "Large");
					}
					
					stmt.setInt(52, quantity[i]*pizza_size[i]);
				}
				else if(vegsupreme == false)
				{
					stmt.setInt(50, java.sql.Types.NULL);
					stmt.setString(51, null);
					stmt.setInt(52, java.sql.Types.NULL);
				}
				
				if(pizza_name[i].equals("Roast Beetroot"))
				{
					roastbeetroot = true;
					
					stmt.setInt(53, quantity[i]);
					
					if(pizza_size[i]<300)
					{
						stmt.setString(54, "Small");
					}
					else if(pizza_size[i]>300 && pizza_size[i]<500)
					{
						stmt.setString(54, "Medium");
					}
					else if(pizza_size[i]>500)
					{
						stmt.setString(54, "Large");
					}
					
					stmt.setInt(55, quantity[i]*pizza_size[i]);
				}
				else if(roastbeetroot == false)
				{
					stmt.setInt(53, java.sql.Types.NULL);
					stmt.setString(54, null);
					stmt.setInt(55, java.sql.Types.NULL);
				}
				
				stmt.setFloat(56, order_total);
			}
			
			stmt.execute();
			con.close();
			
			System.out.println("New Address added successfully in database...!");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		resp.sendRedirect("success.html");
	}
}
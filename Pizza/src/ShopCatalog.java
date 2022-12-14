import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
import com.sun.jndi.url.corbaname.corbanameURLContextFactory;

public class ShopCatalog extends HttpServlet
{
	@Override
	public void init() throws ServletException {super.init();}
	
	@Override
	public void destroy(){super.destroy();}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		boolean bbqchicken=false;
		
		int bbqchicken_size = 0,
			periperichicken_size = 0,
			chickenbonanza_size = 0,
			meatdeluxe_size = 0,
			chickensupreme_size = 0,
			exoticmushroom_size = 0,
			vegmediterranean_size = 0,
			chickenmexicana_size = 0,
			vegextravaganza_size = 0,
			countryspecial_size = 0,
			zestychicken_size = 0,
			chickenmediterranean_size = 0,
			vegprimavera_size = 0,
			peppypaneer_size = 0,
			vegsupreme_size = 0,
			roastbeetroot_size = 0;
		
		int bbqchicken_quan= 0,
			periperichicken_quan= 0,
			chickenbonanza_quan = 0,
			meatdeluxe_quan = 0,
			chickensupreme_quan = 0,
			exoticmushroom_quan = 0,
			vegmediterranean_quan = 0,
			chickenmexicana_quan = 0,
			vegextravaganza_quan = 0,
			countryspecial_quan = 0,
			zestychicken_quan = 0,
			chickenmediterranean_quan = 0,
			vegprimavera_quan = 0,
			peppypaneer_quan = 0,
			vegsupreme_quan = 0,
			roastbeetroot_quan = 0;
			
		String[] checkedpizza = req.getParameterValues("chkpizza");
		
		String[] pizza = new String[16];
		Integer[] size = new Integer[16];
		Integer[] quantity = new Integer[16];
		
		int i=0;
		for(String s : checkedpizza)
		{	
			if(s.equals("BBQ Chicken"))
			{
				bbqchicken_size = Integer.parseInt(req.getParameter("selbbqchicken"));
				
				if(req.getParameter("quanbbqchicken")=="")
				{
					bbqchicken_quan = 1;
				}
				else
				{
					bbqchicken_quan = Integer.parseInt(req.getParameter("quanbbqchicken"));					
				}

				pizza[i] = checkedpizza[i];
				size[i] = bbqchicken_size;
				quantity[i] = bbqchicken_quan;
				i++;
			}
			else if(s.equals("Peri-Peri Chicken"))
			{
				periperichicken_size = Integer.parseInt(req.getParameter("selperiperichicken"));
				
				if(req.getParameter("quanperiperichicken")=="")
				{
					periperichicken_quan = 1;
				}
				else
				{
					periperichicken_quan = Integer.parseInt(req.getParameter("quanperiperichicken"));					
				}
				
				pizza[i] = checkedpizza[i];
				size[i] = periperichicken_size;
				quantity[i] = periperichicken_quan;
				i++;
			}
			else if(s.equals("Chicken Bonanza"))
			{
				chickenbonanza_size = Integer.parseInt(req.getParameter("selchickenbonanza"));
				
				if(req.getParameter("quanchickenbonanza")=="")
				{
					chickenbonanza_quan = 1;
				}
				else
				{
					chickenbonanza_quan = Integer.parseInt(req.getParameter("quanchickenbonanza"));
				}
				
				pizza[i] = checkedpizza[i];
				size[i] = chickenbonanza_size;
				quantity[i] = chickenbonanza_quan;
				i++;
			}
			else if(s.equals("Meat Deluxe"))
			{
				meatdeluxe_size = Integer.parseInt(req.getParameter("selmeatdeluxe"));
				
				if(req.getParameter("quanmeatdeluxe")=="")
				{
					meatdeluxe_quan = 1;
				}
				else
				{
					meatdeluxe_quan = Integer.parseInt(req.getParameter("quanmeatdeluxe"));
				}
				
				pizza[i] = checkedpizza[i];
				size[i] = meatdeluxe_size;
				quantity[i] = meatdeluxe_quan;
				i++;
			}
			else if(s.equals("Chicken Supreme"))
			{
				chickensupreme_size = Integer.parseInt(req.getParameter("selchickensupreme"));
				
				if(req.getParameter("quanchickensupreme")=="")
				{
					chickensupreme_quan = 1;
				}
				else
				{
					chickensupreme_quan = Integer.parseInt(req.getParameter("quanchickensupreme"));
				}
				
				pizza[i] = checkedpizza[i];
				size[i] = chickensupreme_size;
				quantity[i] = chickensupreme_quan;
				i++;

			}
			else if(s.equals("Exotic Mushroom"))
			{
				exoticmushroom_size = Integer.parseInt(req.getParameter("selexoticmushroom"));
				
				if(req.getParameter("quanexoticmushroom")=="")
				{
					exoticmushroom_quan = 1;
				}
				else
				{
					exoticmushroom_quan = Integer.parseInt(req.getParameter("quanexoticmushroom"));
				}
				
				pizza[i] = checkedpizza[i];
				size[i] = exoticmushroom_size;
				quantity[i] = exoticmushroom_quan;
				i++;
			}
			else if(s.equals("Veg Mediterranean"))
			{
				vegmediterranean_size = Integer.parseInt(req.getParameter("selvegmediterranean"));
				
				if(req.getParameter("quanvegmediterranean")=="")
				{
					vegmediterranean_quan = 1;
				}
				else
				{
					vegmediterranean_quan = Integer.parseInt(req.getParameter("quanvegmediterranean"));
				}
				
				pizza[i] = checkedpizza[i];
				size[i] = vegmediterranean_size;
				quantity[i] = vegmediterranean_quan;
				i++;
			}
			else if(s.equals("Chicken Mexicana"))
			{
				chickenmexicana_size = Integer.parseInt(req.getParameter("selchickenmexicana"));
				
				if(req.getParameter("quanchickenmexicana")=="")
				{
					chickenmexicana_quan = 1;
				}
				else
				{
					chickenmexicana_quan = Integer.parseInt(req.getParameter("quanchickenmexicana"));
				}
				
				pizza[i] = checkedpizza[i];
				size[i] = chickenmexicana_size;
				quantity[i] = chickenmexicana_quan;
				i++;
			}
			else if(s.equals("Veg Extravaganza"))
			{
				vegextravaganza_size = Integer.parseInt(req.getParameter("selvegextravaganza"));
				
				if(req.getParameter("quanvegextravaganza")=="")
				{
					vegextravaganza_quan = 1;
				}
				else
				{
					vegextravaganza_quan = Integer.parseInt(req.getParameter("quanvegextravaganza"));
				}
				
				pizza[i] = checkedpizza[i];
				size[i] = vegextravaganza_size;
				quantity[i] = vegextravaganza_quan;
				i++;
			}
			else if(s.equals("Country Special"))
			{
				countryspecial_size = Integer.parseInt(req.getParameter("selcountryspecial"));
				
				if(req.getParameter("quancountryspecial")=="")
				{
					countryspecial_quan = 1;
				}
				else
				{
					countryspecial_quan = Integer.parseInt(req.getParameter("quancountryspecial"));
				}
				
				pizza[i] = checkedpizza[i];
				size[i] = countryspecial_size;
				quantity[i] = countryspecial_quan;
				i++;
			}
			else if(s.equals("Zesty Chicken"))
			{
				zestychicken_size = Integer.parseInt(req.getParameter("selzestychicken"));
				
				if(req.getParameter("quanzestychicken")=="")
				{
					zestychicken_quan = 1;
				}
				else
				{
					zestychicken_quan = Integer.parseInt(req.getParameter("quanzestychicken"));
				}
				
				pizza[i] = checkedpizza[i];
				size[i] = zestychicken_size;
				quantity[i] = zestychicken_quan;
				i++;
			}
			else if(s.equals("Chicken Mediterranean"))
			{
				chickenmediterranean_size = Integer.parseInt(req.getParameter("selchickenmediterranean"));
				
				if(req.getParameter("quanchickenmediterranean")=="")
				{
					chickenmediterranean_quan = 1;
				}
				else
				{
					chickenmediterranean_quan = Integer.parseInt(req.getParameter("quanchickenmediterranean"));
				}
				
				pizza[i] = checkedpizza[i];
				size[i] = chickenmediterranean_size;
				quantity[i] = chickenmediterranean_quan;
				i++;
			}
			else if(s.equals("Veg Primavera"))
			{
				vegprimavera_size = Integer.parseInt(req.getParameter("selvegprimavera"));
				
				if(req.getParameter("quanvegprimavera")=="")
				{
					vegprimavera_quan = 1;
				}
				else
				{
					vegprimavera_quan = Integer.parseInt(req.getParameter("quanvegprimavera"));
				}
				
				pizza[i] = checkedpizza[i];
				size[i] = vegprimavera_size;
				quantity[i] = vegprimavera_quan;
				i++;
			}
			else if(s.equals("Peppy Paneer"))
			{
				peppypaneer_size = Integer.parseInt(req.getParameter("selpeppypaneer"));
				
				if(req.getParameter("quanpeppypaneer")=="")
				{
					peppypaneer_quan = 1;
				}
				else
				{
					peppypaneer_quan = Integer.parseInt(req.getParameter("quanpeppypaneer"));
				}
				
				pizza[i] = checkedpizza[i];
				size[i] = peppypaneer_size;
				quantity[i] = peppypaneer_quan;
				i++;
			}
			else if(s.equals("Vegetarian Supreme"))
			{
				vegsupreme_size = Integer.parseInt(req.getParameter("selvegsupreme"));
				
				if(req.getParameter("quanvegsupreme")=="")
				{
					vegsupreme_quan = 1;
				}
				else
				{
					vegsupreme_quan = Integer.parseInt(req.getParameter("quanvegsupreme"));
				}
				
				pizza[i] = checkedpizza[i];
				size[i] = vegsupreme_size;
				quantity[i] = vegsupreme_quan;
				i++;
			}
			else if(s.equals("Roast Beetroot"))
			{
				roastbeetroot_size = Integer.parseInt(req.getParameter("selroastbeetroot"));
				
				if(req.getParameter("quanroastbeetroot")=="")
				{
					roastbeetroot_quan = 1;
				}
				else
				{
					roastbeetroot_quan = Integer.parseInt(req.getParameter("quanroastbeetroot"));
				}
				
				pizza[i] = checkedpizza[i];
				size[i] = roastbeetroot_size;
				quantity[i] = roastbeetroot_quan;
				i++;
			}
		}
		
		ArrayList address = new ArrayList();
		
		HttpSession session = req.getSession(false);
		String email = (String)session.getAttribute("email");
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
			PreparedStatement stmt = con.prepareStatement("select first_name,last_name,address,town_city,postcode,phone from pizza.users where email=?");
			stmt.setString(1, email);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{
				address.add(rs.getString("first_name"));
				address.add(rs.getString("last_name"));
				address.add(rs.getString("address"));
				address.add(rs.getString("town_city"));
				address.add(rs.getString("postcode"));
				address.add(rs.getString("phone"));
			}
			
			con.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		//req.setAttribute("address", address);
		session.setAttribute("address", address);
		
		//req.setAttribute("pizza_name", pizza);
		session.setAttribute("pizza_name", pizza);
		//req.setAttribute("pizza_size", size);
		session.setAttribute("pizza_size", size);
		//req.setAttribute("pizza_quantity", quantity);
		session.setAttribute("pizza_quantity", quantity);
		//req.setAttribute("total_pizza", checkedpizza.length);
		session.setAttribute("total_pizza", checkedpizza.length);
		
		RequestDispatcher rd = req.getServletContext().getRequestDispatcher("/checkout.jsp");
		rd.forward(req, resp);
	}
}
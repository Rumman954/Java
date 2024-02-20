// Name of the package same as the classes directory
package classes;
//TourPack class under this classes package
import java.lang.*;

public class TourPack
{
	//Private instance variable
	private int id;
	private String name;
	private int ammount;
	private Airline a; //object reference of Airline class
	private Customer c; //object reference of Customer class
	private TourismComp t; //object reference of TourismComp class
	private Hotel h; //object reference of Hotel class

	//Parameterized Constructor
	public TourPack(int id, String name, int ammount, Airline a, Customer c, TourismComp t, Hotel h)
	{
		
		this.id = id;
		this.name = name;
		this.ammount = ammount;
		this.a = a;
		this.c = c;
		this.t = t;
		this.h = h;

	}
	//get and set methods to access and update the value of a private variable
	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAmmount(int ammount)
	{
		this.ammount = ammount;
	}
	public void setAirline(Airline a)
	{
		this.a = a;
	}
	public void setCustomer(Customer c)
	{
		this.c = c;
	}
	public void setTourismComp(TourismComp t)
	{
		this.t = t;
	}
	public void setHotel(Hotel h)
	{
		this.h = h;
	}

	public int getid()
	{
		return id;
		}
	public String getName()
	{
		return name;
		}
	public int getAmmount()
	{
		return ammount;
		}
	public Airline getAirline()
	{
		return a;
		}
	public Customer getCustomer()
	{
		return c;
		}
	public TourismComp getTourismComp()
	{
		return t;
		}
	public Hotel getHotel()
	{
		return h;
	}
	
}
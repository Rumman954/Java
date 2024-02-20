// Name of the package same as the classes directory
package classes;
//Customer class under this classes package
import java.lang.*;

public class Customer
{
	//Private instance variable
	private String nid;
	private String name;
	private String phone;
	private Payment py; //object reference of Payment class

    //Empty Constructor
    public Customer()
    {
    	
    }
	/*public Customer(int nid, String name, int phone, Payment py)
	{
		
		this.nid = nid;
		this.name = name;
		this.phone = phone;
		this.py = py;
	}*/

	//get and set methods to access and update the value of a private variable
	public void setNid(String nid)
	{
		this.nid = nid;
	}
	public void setName(String name)
	{
		this.name = name;
	}
		public void setPhone(String phone)
	{
		this.phone = phone;
	}
	public void setPayment(Payment py)
	{
		this.py = py;
	}
	public String getNid()
	{
		return nid;
		}
	public String getName()
	{
		return name;
		}
	public String getPhone()
	{
		return phone;
		}
	public Payment getPayment()
	{
		return py;
		}
	
}
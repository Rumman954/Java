// Name of the package same as the classes directory
package classes;
//TourismComp class under this classes package

import java.lang.*;
public class TourismComp
{ 
	//Private instance variable
	private String name;
	private String address;
	private String phoneNo;
	
	//Parameterized Constructor
	public TourismComp(String name, String address, String phoneNo)
	{	
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
	}
    //get and set methods to access and update the value of a private variable
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public void setPhoneNo(String phoneNo)
	{
		this.phoneNo = phoneNo;
	}
	public String getName()
	{
		return name;
		}
	public String getAddress()
	{
		return address;
		}
	public String getPhoneNo()
	{
		return phoneNo;
		}
	
}
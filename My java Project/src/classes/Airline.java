// Name of the package same as the classes directory
package classes;
//Airline class under this classes package
import java.lang.*;
public class Airline
{
	//Private instance variable
	private String name;
	private int seatNum;
	//Parameterized Constructor
	public Airline(String name, int seatNum)
	{	
		this.name = name;
		this.seatNum = seatNum;
	}
    //get and set methods to access and update the value of a private variable
	public void setName(String name)
	{
		this.name = name;
	}
	public void setSeatNum(int seatNum)
	{
		this.seatNum = seatNum;
	}
	public String getName()
	{
		return name;
		}
	public int getSeatNum()
	{
		return seatNum;
		}
	
}
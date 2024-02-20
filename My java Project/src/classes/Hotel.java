// Name of the package same as the classes directory
package classes;
//Hotel class under this classes package

import java.lang.*;
//create an abstract Hotel class
public abstract class Hotel{
//Private instance variable
  private String hotelType;

//Parameterized Constructor
  public Hotel(String hotelType)
  {
    this.hotelType=hotelType;
  }
//create an abstract availability
  public abstract void availability();
  public void type()
  {
    System.out.println("Choose your Hotel -  " +hotelType);
  }
}

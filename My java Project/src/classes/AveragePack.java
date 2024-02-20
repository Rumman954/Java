// Name of the package same as the classes directory
package classes;
//AveragePack class under this classes package

//import Room class from interface package
import interfaces.Room;

import java.lang.*;
//Create a  subclass of Hotel class and implements from Room. 
public class AveragePack extends Hotel implements Room{
  //Private instance variable
  private String hotelAddress;
  private String hotelName;
  private int roomNo;

  //Parameterized Constructor
  public AveragePack(String hotelAddress, String hotelName, int roomNo)
  {
    //using super keyword to call superclass constructor
    super("AveragePack");
    this.hotelAddress=hotelAddress;
    this.hotelName=hotelName;
    this.roomNo=roomNo;

  }
  //get and set methods to access and update the value of a private variable
  public String getHotelName()
  {
    return hotelName;
  }

  public void setHotelName(String hotelName)
  {
    this.hotelName=hotelName;
  }

  public String getHotelAddress()
  {
    return hotelAddress;
  }

  public void setHotelAddress(String hotelAddress)
  {
    this.hotelAddress=hotelAddress;
  }
  //getRoomNo method from interface
  public int getRoomNo()
  {
    return roomNo;
  }
  //setRoomNo method from interface
  public void setRoomNo(int roomNo)
  {
    this.roomNo=roomNo;
  }
  //availability method from Abstract class
  public void availability()
  {
    System.out.println("This room is available now.");
  }
  //service method from interface
  public void service()
  {
    System.out.println("     This room has belowed feature :");
    System.out.println();
    System.out.println("     1.This room has 1 double bed");
    System.out.println("     2.This room has 1 led TV");
    System.out.println("     3.This room has Air Conditionar & Wifi connection");
    System.out.println("     4.This room has 1 attached bathroom");
  }

}

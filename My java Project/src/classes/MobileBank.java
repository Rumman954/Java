// Name of the package same as the classes directory
package classes;
//MobileBank class under this classes package

//import OnlinePayment class from interface package
import interfaces.OnlinePayment;

//Create a subclass of Payment class and implements from OnlinePayment. 
public class MobileBank extends Payment implements OnlinePayment{
    //Private instance variable
    private String mbName;
    private String phoneNum;
    private int ammount;
    private int pinNum;

    //Parameterized Constructor
    public MobileBank(String mbName, String phoneNum, int ammount, int pinNum)
    {
        //using super keyword to call superclass constructor
        super("Mobile Bank");
        this.mbName=mbName;
        this.phoneNum=phoneNum;
        this.ammount=ammount;
        this.pinNum=pinNum;
    }
//get and set methods to access and update the value of a private variable
    public String getmbName()
    {
        return mbName;
    }
    public void setmbName(String mbName)
    {
        this.mbName=mbName;
    }
    public String getphoneNum()
    {
        return phoneNum;
    }
    public void setphoneNum(String phoneNum)
    {
        this.phoneNum = phoneNum;
    }
    //getAmmount method from interface
    public int getAmmount()
    {
        return ammount;
    }
    //setAmmount method from interface
    public void setAmmount(int ammount)
    {
        this.ammount=ammount;
    }
    //getPinNum method from interface
    public int getPinNum()
    {
        return pinNum;
    }
    //setPinNum method from interface
    public void setPinNum(int pinNum)
    {
        this.pinNum=pinNum;
    }
    //availability method from Abstract class
    public void paymentValidity()
    {
      System.out.println("This payment type is valid at this time");
    }
    public void Paid()
    {
    System.out.println("Payment is done & the ammount is "+ammount);
    }        
}

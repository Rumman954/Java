// Name of the package same as the classes directory
package classes;
//Card class under this classes package

//import OnlinePayment class from interface package
import interfaces.OnlinePayment;

//Create a subclass of Payment class and implements from OnlinePayment.
public class Card extends Payment implements OnlinePayment{
   //Private instance variable
    private String cardName;
    private int cardNum;
    private int ammount;
    private int pinNum;
    //Parameterized Constructor
    public Card(String cardName, int cardNum, int ammount, int pinNum)
    {
        //using super keyword to call superclass constructor
        super("Card");
        this.cardName=cardName;
        this.cardNum=cardNum;
        this.ammount=ammount;
        this.pinNum=pinNum;
    }
//get and set methods to access and update the value of a private variable
    public String getCardName()
    {
        return cardName;
    }
    public void setCardName(String cardName)
    {
        this.cardName=cardName;
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
    public int getCardNum()
    {
        return cardNum;
    }
    public void setCardNum(int cardNum)
    {
        this.cardNum = cardNum;
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

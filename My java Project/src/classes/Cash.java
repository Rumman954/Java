// Name of the package same as the classes directory
package classes;
//Cash class under this classes package

//import OfflinePayment class from interface package
import interfaces.OfflinePayment;

//Create a subclass of Payment class and implements from OfflinePayment.
public class Cash extends Payment implements OfflinePayment{
    //Private instance variable
    private int ammount;
    private int receiptNum;
    //Parameterized Constructor
    public Cash(int ammount, int receiptNum)
    {
        //using super keyword to call superclass constructor
        super("Cash");
        this.ammount=ammount;
        this.receiptNum=receiptNum;
    }
//get and set methods to access and update the value of a private variable
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
//getReceiptNum method from interface
    public int getReceiptNum()
    {
        return receiptNum;
    }
    //setReceiptNum method from interface
    public void setReceiptNum(int receiptNum)
    {
        this.receiptNum = receiptNum;
    }
//availability method from Abstract class
    public void paymentValidity()
    {
      System.out.println("This payment type is valid at this time");
    }
    public void paid()
    {
    System.out.println("Payment is done & the ammount is "+ammount);
    }      
}

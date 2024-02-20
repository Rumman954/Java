// Name of the package same as the classes directory
package classes;
//Payment class under this classes package

//Create an abstract class called Payment
public abstract class Payment{
	//Private instance variable
    private String paymentType;
    //Parameterized Constructor
    public Payment(String paymentType)
    {
    this.paymentType=paymentType;
    }
    //Create an abstract method call paymentValidity      
    public abstract void paymentValidity();
    public void type()
    {
        System.out.println("Payment type is - "+paymentType);
    }

}

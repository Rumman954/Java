// Name of the package same as the interfaces directory
package interfaces;
//OnlinePayment class under this interfaces package
import java.lang.*;
//create an interface named OnlinePayment
public interface OnlinePayment{
    public int getAmmount();
    public void setAmmount(int ammount);
    public void setPinNum(int pinNum);
    public int getPinNum();
}

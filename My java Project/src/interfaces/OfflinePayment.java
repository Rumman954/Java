// Name of the package same as the interfaces directory
package interfaces;
//OfflinePayment class under this interfaces package
import java.lang.*;
//create an interface named OfflinePayment
public interface OfflinePayment{
    public int getAmmount();
    public void setAmmount(int ammount);
    public void setReceiptNum(int receiptNum);
    public int getReceiptNum();
}

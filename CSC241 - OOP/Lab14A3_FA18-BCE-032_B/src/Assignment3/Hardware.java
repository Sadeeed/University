package Assignment3;

import java.io.FileWriter;
import java.io.IOException;

public class Hardware extends Item{

    public Hardware(int hwID, String hwName, Double hwCost, int hwQuantity){
        setProductID(hwID);
        setItemName(hwName);
        setItemPrice(hwCost);
        setItemQuantity(hwQuantity);
    }

    @Override
    public void saveItem(Item i) {
        try{
            FileWriter textFile =  new FileWriter("Hardware.txt",true);
            textFile.write(i.toString() + "\n");
            textFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setItemName(String itemName) {
        super.setItemName(itemName);
    }

    @Override
    public void setProductID(int productID) {
        super.setProductID(productID);
    }

    @Override
    public void setItemPrice(Double itemPrice) {
        super.setItemPrice(itemPrice);
    }

    @Override
    public void setItemQuantity(int itemQuantity) {
        super.setItemQuantity(itemQuantity);
    }

    @Override
    public String toString() {
        return super.toString() + "\t\tHardware";
    }
}

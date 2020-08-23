package Assignment3;

import java.io.FileWriter;
import java.io.IOException;

public class Software extends Item{

    public Software(int swID, String swName, Double swCost, int swQuantity){
        setProductID(swID);
        setItemName(swName);
        setItemPrice(swCost);
        setItemQuantity(swQuantity);
    }


    @Override
    public void saveItem(Item i) {
        try{
            FileWriter textFile =  new FileWriter("Software.txt",true);
            textFile.write(i.toString() + "\n");
            textFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setProductID(int productID) {
        super.setProductID(productID);
    }

    @Override
    public void setItemName(String itemName) {
        super.setItemName(itemName);
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
        return super.toString() + "\t\tSoftware";
    }
}

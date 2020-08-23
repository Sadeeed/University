package Assignment3;

public abstract class Item {
    private String itemName;
    private Double itemPrice;
    private int productID;
    private int itemQuantity;

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getProductID() {
        return productID;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public abstract void saveItem(Item i);

    @Override
    public String toString() {
        return String.format("%03d\t\t%-30s\t\t%.3f\t\t%02d",getProductID(),getItemName(),getItemPrice(),getItemQuantity());
    }
}

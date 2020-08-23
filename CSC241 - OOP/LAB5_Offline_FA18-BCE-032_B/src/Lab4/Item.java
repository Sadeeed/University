package Lab4;

public class Item {
    public String name;
    public String description;
    public String price;
    public int basket;

    public Item(String n, String d,String p)
    {
        name = n;
        description = d;
        price = p;
    }

    public void viewFullDescription()
    {
        System.out.println("\nName: " + name + "\nDescription: " + description + "\nPrice: " + price);
    }

    public void addToShoppingBasket()
    {
        System.out.println("Added to basket ");
        basket++;
    }

    public void removeFromShoppingBasket()
    {
        System.out.println("Removed from basket");
        basket--;
    }
}

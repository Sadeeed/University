package Lab4;

public class Book extends Item {
    public String author;
    public String numberOfPages;
    public String genre;


    public Book(String n, String d, String p, String a, String num, String g)
    {
        super(n, d, p);
        author  = a;
        numberOfPages = num;
        genre = g;
    }

    public void previewContent()
    {
        System.out.println("Opening " + name + "...");
    }

    public void viewFullDescription()
    {
        System.out.println("\nName: " + name + "\nAuthor: " + author + "\nPages: " + numberOfPages + "\nGenre: " + genre + "\nDescription: " + description + "\nPrice: " + price);
    }

    public void addToShoppingBasket()
    {
        System.out.println( name + " Added to basket");
        basket++;
    }

    public void removeFromShoppingBasket()
    {
        System.out.println( name + " Removed from basket");
        basket--;
    }
}

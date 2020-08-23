package Lab4;

import java.util.Arrays;

public class DVD extends Item {
    public String certificate;
    public String duration;
    public String[] actors;

    public DVD(String n, String d, String p, String c, String dur, String[] act)
    {
        super(n, d, p);
        certificate = c;
        duration = dur;
        actors = act;
    }

    public void viewTrailer()
    {
        System.out.println("Playing " + super.name + " Trailer...");
    }

    public void viewFullDescription()
    {
        System.out.println("\nName: " + name + "\nDuration: " + duration + "\nActors: " + Arrays.toString(actors) + "\nDescription: " + description + "\nPrice: " + price);
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

package Lab4;

public class MP3 extends Item {

    public String artist;
    public String duration;

    public MP3(String n, String dsc, String p, String a, String d)
    {
        super(n,dsc,p);
        artist = a;
        duration = d;
    }

    public void play()
    {
        System.out.println("Playing " + name);
    }

    public void Download()
    {
        System.out.println("Downloading " + name + ".mp3");
    }

    public void viewFullDescription()
    {
        System.out.println("\nName: " + name + "\nArtist: " + artist + "\nDuration: " + duration + "\nDescription: " + description + "\nPrice: " + price);
    }

    public void addToShoppingBasket()
    {
        System.out.println( name + ".mp3 Added to basket");
        basket++;
    }

    public void removeFromShoppingBasket()
    {
        System.out.println( name + ".mp3 Removed from basket");
        basket--;
    }

}

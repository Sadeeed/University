package Lab4;

public class Main {

    public static void main(String[] args) {

        Item m = new MP3("Circles","Song","0.99$","Post Malone","3:35");
        MP3 m1 = new MP3("Circles","Song","0.99$","Post Malone","3:35");
        m.viewFullDescription();
        m1.play();
        m1.Download();
        m.addToShoppingBasket();
        m.removeFromShoppingBasket();

        String[] actr = new String[]{"Jake Gyllenhaal", "Jena Malone", "James Duval", "Drew Barrymore"};
        Item dvd = new DVD("Donnie Darko","A troubled teenager is plagued by visions of a man in a large rabbit suit who manipulates him to commit a series of crimes, after he narrowly escapes a bizarre accident.","2.99$","R","1h 53m",actr);
        DVD dvd1 = new DVD("Donnie Darko","A troubled teenager is plagued by visions of a man in a large rabbit suit who manipulates him to commit a series of crimes, after he narrowly escapes a bizarre accident.","2.99$","R","1h 53m",actr);
        dvd.viewFullDescription();
        dvd1.viewTrailer();
        dvd.addToShoppingBasket();
        dvd.removeFromShoppingBasket();

        Item book = new Book("Recursion","A relentless thriller about time, identity, and memory","11.99","Blake Crouch","336","Sci-fi");
        Book book1 = new Book("Recursion","A relentless thriller about time, identity, and memory","11.99","Blake Crouch","336","Sci-fi");
        book.viewFullDescription();
        book1.previewContent();
        book.addToShoppingBasket();
        book.removeFromShoppingBasket();


    }
}

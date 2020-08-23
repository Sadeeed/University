package Assignment3;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ShopIO sIO = new ShopIO();
        sIO.init();
//
//        Item[] items = new Item[4];
//        items[0] = new Hardware(2,"Ryzen 7 3700X",37600.00,1);
//        items[1] = new Hardware(3,"Samsung 970 Evo",15600.00,2);
//
//        items[2] = new Software(6,"Minecraft",3500.00,1);
//        items[3] = new Software(8,"WinRar",2000.00,4);
//
//        sIO.addToCart(items);
//        sIO.calculateBill();

        Menu menu = new Menu();
        menu.startupSplash();
        menu.menu();
//        System.out.println(h.toString());
    }
}

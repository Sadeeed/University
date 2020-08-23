package Assignment3;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
//    private int iter = 0;
//    Item[] itemArray = new Item[10];
    ArrayList<Item> itemArrayList = new ArrayList<>();

    public void addItems(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the product ID: ");
        int pID = input.nextInt();
        System.out.println("Enter the quantity(<5) : ");
        int pQty = input.nextInt();
        if (pID == 1){
//            itemArray[iter] = new Hardware(pID,"GTX 2070",48700.00,pQty);
//            iter++;
            itemArrayList.add(new Hardware(pID,"GTX 2070",48700.00,pQty));
        }
        if (pID == 2)
        {
//            itemArray[iter]  = new Hardware(pID,"Ryzen 7 3700X",37600.00,pQty);
//            iter++;
            itemArrayList.add(new Hardware(pID,"Ryzen 7 3700X",37600.00,pQty));
        }
        if (pID == 3)
        {
//            itemArray[iter]  = new Hardware(pID,"Samsung 970 Evo",15600.00,pQty);
//            iter++;
            itemArrayList.add(new Hardware(pID,"Samsung 970 Evo",15600.00,pQty));
        }
        if (pID == 4)
        {
//            itemArray[iter]  = new Hardware(pID,"Logitech G550 Mouse",11300.00,pQty);
//            iter++;
            itemArrayList.add(new Hardware(pID,"Logitech G550 Mouse",11300.00,pQty));
        }
        if (pID == 5){
//            itemArray[iter]  = new Hardware(pID,"Gigabyte GA-A320M Motherboard",12500.00,pQty);
//            iter++;
            itemArrayList.add(new Hardware(pID,"Gigabyte GA-A320M Motherboard",12500.00,pQty));
        }
        if (pID == 6){
//            itemArray[iter] = new Software(pID,"Minecraft",3500.00,pQty);
//            iter++;
            itemArrayList.add(new Software(pID,"Minecraft",3500.00,pQty));
        }
        if (pID == 7)
        {
//            itemArray[iter]  = new Software(pID,"Windows 10",15000.00,pQty);
//            iter++;
            itemArrayList.add(new Software(pID,"Windows 10",15000.00,pQty));
        }
        if (pID == 8)
        {
//            itemArray[iter]  = new Software(pID,"WinRar",2000.00,pQty);
//            iter++;
            itemArrayList.add(new Software(pID,"WinRar",2000.00,pQty));
        }
        if (pID == 9)
        {
//            itemArray[iter]  = new Software(pID,"Aseprite",1250.00,pQty);
//            iter++;
            itemArrayList.add(new Software(pID,"Aseprite",1250.00,pQty));
        }
        if (pID == 10){
//            itemArray[iter]  = new Software(pID,"Malwarebytes",5600.00,pQty);
//            iter++;
            itemArrayList.add(new Software(pID,"Malwarebytes",5600.00,pQty));
        }
        if (pID > 10){
            System.out.println("We couldn't find any Items with the given ID");
        }
//        if (iter > 9){
//            System.out.println("Cart Full!");
//        }
//        System.out.println(Arrays.toString(getItemArray()));
    }

//    public ArrayList<Item> getItemArrayList() {
//        return itemArrayList;
//    }

    public void startupSplash(){
        System.out.println(" ████████        ████████ ██                      \n" +
                           "░██░░░░░        ██░░░░░░ ░██               ██████ \n" +
                           "░██            ░██       ░██       ██████ ░██░░░██\n" +
                           "░███████  █████░█████████░██████  ██░░░░██░██  ░██\n" +
                           "░██░░░░  ░░░░░ ░░░░░░░░██░██░░░██░██   ░██░██████ \n" +
                           "░██                   ░██░██  ░██░██   ░██░██░░░  \n" +
                           "░████████       ████████ ░██  ░██░░██████ ░██     \n" +
                           "░░░░░░░░       ░░░░░░░░  ░░   ░░  ░░░░░░  ░░      \n");
    }

    public void menu(){
        ShopIO sIO = new ShopIO();
        sIO.displayCatalogue();

        Scanner input = new Scanner(System.in);
        System.out.println("1. Select Items\n" + "2. Add to cart\n" + "3. Calculate Bill\n" + "4. Exit");
        System.out.println(ConsoleColors.RED_BRIGHT + "Note: Only to Cart when you're done selecting items" + ConsoleColors.RESET);
        System.out.println("Enter Option: ");
        int opt = input.nextInt();
        switch (opt){
            case 1 ->{
                addItems();
                menu();
            }
            case 2 ->{
                sIO.addToCart(itemArrayList);
                menu();
            }
            case 3 ->{
                sIO.calculateBill();
                System.exit(0);
            }
            default -> System.exit(0);
        }
    }



}

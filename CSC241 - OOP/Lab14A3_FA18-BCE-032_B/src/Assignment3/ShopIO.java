package Assignment3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class ShopIO {

    public void init(){
        Item[] hwItem = new Item[5];
        Item[] swItem = new Item[5];

        hwItem[0] = new Hardware(1,"GTX 2070",48700.00,5);
        hwItem[1] = new Hardware(2,"Ryzen 7 3700X",37600.00,5);
        hwItem[2] = new Hardware(3,"Samsung 970 Evo",15600.00,5);
        hwItem[3] = new Hardware(4,"Logitech G550 Mouse",11300.00,5);
        hwItem[4] = new Hardware(5,"Gigabyte GA-A320M Motherboard",12500.00,5);

        swItem[0] = new Software(6,"Minecraft",3500.00,5);
        swItem[1] = new Software(7,"Windows 10",15000.00,5);
        swItem[2] = new Software(8,"WinRar",2000.00,5);
        swItem[3] = new Software(9,"Aseprite",1250.00,5);
        swItem[4] = new Software(10,"Malwarebytes",5600.00,5);

        //Refresh Inv on restart
        File oldSwFile = new File("Software.txt");
        if (oldSwFile.delete()){
            System.out.println();
        }

        File oldHwFile = new File("Hardware.txt");
        if (oldHwFile.delete()){
            System.out.println();
        }

        for (Item i:hwItem){
            i.saveItem(i);
        }

        for (Item i:swItem){
            i.saveItem(i);
        }

        deleteOldOrders();
    }

    public void displayCatalogue(){
        System.out.println(ConsoleColors.CYAN_BACKGROUND + "C A T A L O G U E\n" + ConsoleColors.YELLOW);
        System.out.println("ID\t\tName\t\t\t\t\t\t\t\tPrice\t\t    Qty\t\tType");
        try{
            Scanner hwFile = new Scanner(new File("Hardware.txt"));
            Scanner swFile = new Scanner(new File("Software.txt"));
            while (hwFile.hasNextLine()){
                System.out.println(hwFile.nextLine());
            }
            while (swFile.hasNextLine()){
                System.out.println(swFile.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(ConsoleColors.RESET);
    }

    private boolean searchHardware(int pID){
        try{
            Scanner inFile = new Scanner(new File("Hardware.txt"));
            while(inFile.hasNextLine()){
                String text = inFile.nextLine();
//                System.out.println(text);
                String s = text.replaceAll("[^0-9]", "");
                if(Integer.parseInt(s.substring(0,3)) == pID){
//                    System.out.println(text);
                    return true;
                }
            }
            //System.out.println(text);
        } catch (Exception ioException) {
            ioException.printStackTrace();
        }
        return false;
    }

    private boolean searchSoftware(int pID){
        try{
            Scanner inFile = new Scanner(new File("Software.txt"));
            while(inFile.hasNextLine()){
                String text = inFile.nextLine();
//                System.out.println(text);
                String s = text.replaceAll("[^0-9]", "");
                if(Integer.parseInt(s.substring(0,3)) == pID){
//                    System.out.println(text);
                    return true;
                }
            }
            //System.out.println(text);
        } catch (Exception ioException) {
            ioException.printStackTrace();
        }
        return false;
    }

    private boolean search(int pID){
        if (!searchHardware(pID)){
            if (!searchSoftware(pID)){
                System.out.println("Product not found !");
                return false;
            }
        }
        return true;
    }

    public void addToCart(ArrayList<Item> i){
        Random rng = new Random(System.currentTimeMillis());
        String orderNo = "Order#" + rng.nextInt(256) + ".txt";
        try{
            FileWriter textFile = new FileWriter("Order/" + orderNo,false);
            System.out.println(orderNo.replaceAll(".txt",""));
            textFile.write("ID\t\tName\t\t\t\t\t\t\t\tPrice\t\t    Qty\t\tType\n");
            for (Item item:i){
                if (search(item.getProductID())) {
                    System.out.println(item.toString());
                    textFile.write(item.toString() + "\n");
                }
            }
            textFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String findFile(){
        File directoryPath = new File("Order/");
        File[] filesList = directoryPath.listFiles();
        for(File file : Objects.requireNonNull(filesList)) {
//            System.out.println("File name: "+ file.getName());
            return file.getName();
        }
        return "Folder empty!";
    }

    public void deleteOldOrders(){
        File orderDir = new File("Order/" + findFile());
        if (orderDir.delete()){
            System.out.println(orderDir.getName());
        }
    }

    public String getUserInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Username: ");
        String username = input.nextLine();
        System.out.println("Address: ");
        String address = input.nextLine();
        return "Username: " + username + "\n" + "Address: " + address;
    }

    public void calculateBill(){
        int totalBill = 0;
        try{
            Scanner inFile = new Scanner(new File("Order/" + findFile()));
            System.out.println(ConsoleColors.YELLOW + findFile().replaceAll(".txt",""));
            System.out.println(inFile.nextLine());
            while(inFile.hasNextLine()){
                String text = inFile.nextLine();
                System.out.println(text);
//                System.out.println(text.substring(37,46));
//                System.out.println(text.substring(47,50));
//                (Price * Quantity) + total
                totalBill += Double.parseDouble(text.substring(37,46)) * Integer.parseInt(text.substring(47,50).replaceAll("\\s",""));
            }
            System.out.println("Total Bill: " + totalBill + ConsoleColors.RESET);
            FileWriter orderFile = new FileWriter("Order/" + findFile(),true);
            orderFile.write("Total Bill: " + totalBill + "\n");
            orderFile.write(getUserInfo());
            orderFile.close();
        } catch (Exception ioException) {
            ioException.printStackTrace();
        }
    }

}

package Final;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        menu();

    }
    public static void menu() {
        System.out.println("***MENU***\n" + "1. Add Resident\n" + "2. Search\n" + "3. Calculate Bill\n" + "4. Exit\n");
        System.out.println("Enter Choice: ");

        Scanner input = new Scanner(System.in);

        int opt = input.nextInt();
        switch (opt) {
            case 1 -> {
                System.out.println("House Type \n1. House \n2. Apartment");
                Scanner scn = new Scanner(System.in);
                int hType = scn.nextInt();
                if (hType == 1){
                    House h1 = new House();
                    h1.saveInformation(h1.input("201","Sadeed",8,true,"house",1500));
                }
                else if(hType == 2){
                    Apartment a1 = new Apartment();
                    a1.saveInformation(a1.input("201","Sadeed",8,true,"house",1500));
                }
                menu();
            }
            case 2 -> {
                Building b1 = new Building();
                b1.searchInformation(201);
                menu();
            }
            case 3 -> {
                House b1 = new House();
                b1.calculateTotalBill(10,8);
            }
            case 4 -> {
                System.exit(0);
            }
            default -> throw new IllegalStateException("Unexpected value: " + opt);
        }
    }
}

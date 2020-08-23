package Employee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Employee emp = new Employee("Ahad",420);
        System.out.println(emp.toString());

        Employee Pemp = new PermanentEmployee("Fruit",68,500);
        System.out.println(Pemp.toString());


        //Scanner input = new Scanner(System.in);
        System.out.println("Enter the total hours worked :");
        //int tHours;
        //tHours = input.nextInt(); // Input Stuff

        Employee Hemp = new HourlyEmployee("Ali", 73, 500);
        System.out.println(Hemp.toString());


    }
}

package Files;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {

    ArrayList<Employee> emp = new ArrayList<>();
    employeeIO eIO = new employeeIO();

    public ArrayList<Employee> employeeInput() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter name: ");
        String empName = input.nextLine();
        System.out.println("Enter ID: ");
        Integer empID = input.nextInt();
        System.out.println("Enter Salary: ");
        Integer empSal = input.nextInt();

        emp.add(new Employee(empName, empID, empSal));

        return emp;
    }

    public void searchInput() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter name: ");
        String empName = input.nextLine();
        System.out.println("Enter ID: ");
        int empID = input.nextInt();

        eIO.searchEmployee(empID, empName);
    }

    public void exit() {
    }

    public void menu() {
        System.out.println("***MENU***\n" + "1. Add Employee\n" + "2. Search\n" + "3. Exit\n");
        System.out.println("Enter Choice: ");

        Scanner input = new Scanner(System.in);

        int opt = input.nextInt();
        switch (opt) {
            case 1 -> {
                eIO.addEmployee(employeeInput());
                menu();
            }
            case 2 -> {
                searchInput();
                menu();
            }
            case 3 -> exit();
            default -> throw new IllegalStateException("Unexpected value: " + opt);
        }
    }

}

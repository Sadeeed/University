package Employee;

import java.util.Scanner;

public class HourlyEmployee extends Employee{

    private double hourlyIncome;
    public int totalHours;

    Scanner inputx = new Scanner(System.in);

    public HourlyEmployee(String n, int id, double hI) {
        super(n, id);
        hourlyIncome = hI;
        //totalHours = th;
        totalHours = inputx.nextInt();
    }

    public float calculate_the_hourly_income(){
        return (float) (hourlyIncome * totalHours);
    }

    @Override
    public String toString() {
        return "Employee: " + name +  " (ID: " + empID + ')' + "\n" + "This month's Salary = " + totalHours + " * 500 = " + calculate_the_hourly_income() + "\n";
    }
}

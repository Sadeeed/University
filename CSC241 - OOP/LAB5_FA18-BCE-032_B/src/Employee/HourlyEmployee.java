package Employee;

import Main.Employee;

import java.util.Scanner;

public class HourlyEmployee extends Employee {

    protected double hourlyIncome;
    protected int totalHours;

    Scanner inputx = new Scanner(System.in);

    protected HourlyEmployee(String n, int id, double hI) {
        super(n, id);
        hourlyIncome = hI;
        //totalHours = th;
        totalHours = inputx.nextInt();
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public float calculate_the_hourly_income(){
        return (float) (hourlyIncome * totalHours);
    }

    @Override
    public String toString() {
        return "Employee: " + name +  " (ID: " + empID + ')' + "\n" + "This month's Salary = " + totalHours + " * 500 = " + calculate_the_hourly_income() + "\n";
    }
}

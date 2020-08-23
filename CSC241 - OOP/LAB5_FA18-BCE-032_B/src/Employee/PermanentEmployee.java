package Employee;

import Main.Employee;

public class PermanentEmployee extends Employee {

    protected double hourlyIncome;

    protected PermanentEmployee(String n, int id, double hI) {
        super(n, id);
        hourlyIncome = hI;
    }

    protected float calculate_the_income(){
        return (float) (hourlyIncome * 180);
    }

    @Override
    public String toString() {
        return "Employee: " + name +  " (ID: " + empID + ')' + "\n" + "This month's Salary @500PKR /Hour = " + calculate_the_income() + "\n";
    }
}

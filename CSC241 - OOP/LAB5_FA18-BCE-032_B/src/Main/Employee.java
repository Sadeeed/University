package Main;

public class Employee {
    protected String name;
    protected int empID;

    public Employee(String n, int id)
    {
        name = n;
        empID = id;
    }

    @Override
    public String toString() {
        return "Employee: " + name +  " (ID: " + empID + ')' + "\n";
    }
}

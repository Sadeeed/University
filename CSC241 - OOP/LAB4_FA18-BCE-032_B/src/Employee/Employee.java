package Employee;

public class Employee {
    public String name;
    public int empID;

    public Employee (String n, int id)
    {
        name = n;
        empID = id;
    }

    @Override
    public String toString() {
        return "Employee: " + name +  " (ID: " + empID + ')' + "\n";
    }
}

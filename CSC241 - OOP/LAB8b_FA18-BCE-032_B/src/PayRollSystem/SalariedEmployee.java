package PayRollSystem;


public class SalariedEmployee extends Employee {
    private double weeklySalary;

    // four-argument constructor
    public SalariedEmployee(String first, String last, String ssn, DateofBirth sEmployeeDOB, double salary) {
        super(first, last, ssn); // pass to Employee constructor
        setWeeklySalary(salary); // validate and store salary
        setBirthDate(sEmployeeDOB);
    } // end four-argument SalariedEmployee constructor

    // return salary
    public double getWeeklySalary() {
        return weeklySalary;
    } // end method getWeeklySalary

    // set salary
    public void setWeeklySalary(double salary) {
        if (weeklySalary < 0.0)
            throw new IllegalArgumentException("Weekly salary should be >= 0.0");
        this.weeklySalary = salary;

    } // end method setWeeklySalary

    // calculate earnings; override abstract method earnings in Employee
    public double earnings() {
        return getWeeklySalary();
    } // end method earnings

    @Override
    public DateofBirth getBirthDate() {
        return dob;
    }

    @Override
    public void setBirthDate(DateofBirth dob) {
        this.dob = dob;
    }

    // return String representation of SalariedEmployee object
    public String toString() {
        return String.format("salaried employee: %s\n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary());
    } // end method toString
} // end class Sal


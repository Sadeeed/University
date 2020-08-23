package PayRollSystem;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary; // base salary per week

    // six-argument constructor
    public BasePlusCommissionEmployee(String first, String last, String ssn, DateofBirth bpced, double sales, double rate, double salary) {
        super(first, last, ssn, bpced, sales, rate);
        setBaseSalary(salary); // validate and store base salary
    } // end six-argument BasePlusCommissionEmployee constructor

    // return base salary
    public double getBaseSalary() {
        return baseSalary;
    } // end method getBaseSalary

    // set base salary
    public void setBaseSalary(double salary) {
        if (salary < 0.0)
            throw new IllegalArgumentException("Base salary should be >= 0.0");
        this.baseSalary = salary;
    } // end method setBaseSalary

    // calculate earnings; override method earnings in CommissionEmployee
    public double earnings() {
        return getBaseSalary() + super.earnings();
    } // end method earnings

    // return String representation of BasePlusCommissionEmployee object
    public String toString() {
        return String.format("%s %s; %s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary());
    } // end method toString
} // end class BasePlusCommissionEmployee

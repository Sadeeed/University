package PayRollSystem;

public class HourlyEmployee extends Employee {
    private double wage; // wage per hour
    private double hours; // hours worked for week
    //private DateofBirth hed;

    // five-argument constructor
    public HourlyEmployee(String first, String last, String ssn,
                          DateofBirth hed, double hourlyWage, double hoursWorked) {
        super(first, last, ssn);
        setWage(hourlyWage); // validate and store hourly wage
        setHours(hoursWorked); // validate and store hours worked
        setBirthDate(hed);
    } // end five-argument HourlyEmployee constructor

    // return wage
    public double getWage() {
        return wage;
    } // end method getWage

    // set wage
    public void setWage(double hourlyWage) {
        if (wage < 0.0)
            throw new IllegalArgumentException("Hourly wage should be >= 0.0");
        this.wage = hourlyWage;
    } // end method setWage

    // return hours worked
    public double getHours() {
        return hours;
    } // end method getHours

    // set hours worked
    public void setHours(double hoursWorked) {
        if ((hours < 0.0) || (hours > 168.0))
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <=168.0");
        this.hours = hoursWorked;
    } // end method setHours

    // calculate earnings; override abstract method earnings in Employee
    public double earnings() {
        if (getHours() <= 40) // no overtime
            return getWage() * getHours();
        else
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
    } // end method earnings

    @Override
    public DateofBirth getBirthDate() {
        return dob;
    }

    @Override
    public void setBirthDate(DateofBirth dob) {
        this.dob = dob;
    }

    // return String representation of HourlyEmployee object
    public String toString() {
        return String.format("hourly employee: %s\n%s: $%,.2f; %s: %,.2f",
                super.toString(), "hourly wage", getWage(),
                "hours worked", getHours());
    } // end method toString
} // end class HourlyEmployee

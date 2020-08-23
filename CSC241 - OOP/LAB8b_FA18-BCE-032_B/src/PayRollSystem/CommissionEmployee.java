package PayRollSystem;

public class CommissionEmployee extends Employee {
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage
    //private DateofBirth ced;

    // five-argument constructor
    public CommissionEmployee(String first, String last, String ssn, DateofBirth ced, double sales, double rate) {
        super(first, last, ssn);
        setGrossSales(sales);
        setCommissionRate(rate);
        setBirthDate(ced);
    } // end five-argument CommissionEmployee constructor

    // return commission rate
    public double getCommissionRate() {
        return commissionRate;
    } // end method getCommissionRate

    // set commission rate
    public void setCommissionRate(double rate) {
        this.commissionRate = rate;
//        if ((rate < 0.0) || (rate > 1.0)) {
//            //throw new IllegalArgumentException("Commiion rate should be > 0.0 and <1.0");
//            this.commissionRate = rate;
//        }
    } // end method setCommissionRate

    // return gross sales amount
    public double getGrossSales() {
        return grossSales;
    } // end method getGrossSales

    // set gross sales amount
    public void setGrossSales(double sales) {
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales should be >= 0.0");
        this.grossSales = sales;
    } // end method setGrossSales

    // calculate earnings; override abstract method earnings in Employee
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    } // end method earnings

    @Override
    public DateofBirth getBirthDate() {
        return dob;
    }

    @Override
    public void setBirthDate(DateofBirth dob) {
        this.dob = dob;

    }

    // return String representation of CommissionEmployee object
    public String toString() {
        return String.format("%s: %s\n%s: $%,.2f; %s: %.2f",
                "commission employee", super.toString(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    } // end method toString
} // end class CommissionEmployee

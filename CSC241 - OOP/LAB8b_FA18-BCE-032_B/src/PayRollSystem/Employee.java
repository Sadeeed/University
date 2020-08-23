package PayRollSystem;

public abstract class Employee {

    protected DateofBirth dob;
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    // three-argument constructor
    public Employee(String first, String last, String ssn) {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
    } // end three-argument Employee constructor

    // return first name
    public String getFirstName() {
        return firstName;
    } // end method getFirstName

    // set first name
    public void setFirstName(String first) {
        firstName = first;
    } // end method setFirstName

    // return last name
    public String getLastName() {
        return lastName;
    } // end method getLastName

    // set last name
    public void setLastName(String last) {
        lastName = last;
    } // end method setLastName

    // return social security number
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    } // end method getSocialSecurityNumber

    // set social security number
    public void setSocialSecurityNumber(String ssn) {
        socialSecurityNumber = ssn; // should validate
    } // end method setSocialSecurityNumber

    // return String representation of Employee object
    public String toString() {
        return String.format("%s %s\nsocial security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    } // end method toString

    // abstract method overridden by subclasses
    public abstract double earnings(); // no implementation here

    public abstract DateofBirth getBirthDate();

    public abstract void setBirthDate(DateofBirth dob);
} // end abstract class Employee
 


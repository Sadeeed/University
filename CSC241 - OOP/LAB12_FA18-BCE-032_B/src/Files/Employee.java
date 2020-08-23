package Files;

import java.io.Serializable;

public class Employee implements Serializable {

    private String name;
    private Integer empID;
    private Integer salary;

    public Employee(String name, Integer empID, Integer salary) {
        setName(name);
        setEmpID(empID);
        setSalary(salary);
    }

    public void setEmpID(Integer empID) {
        this.empID = empID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Integer getEmpID() {
        return empID;
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee: " + getName() + "(ID: " + getEmpID() + "), salary: " + getSalary();
    }
}

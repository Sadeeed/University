package Q2;

public class Teacher {
    private String Teacher_id;
    private String Teacher_name;
    private int monthly_salary;

    public Teacher(String id, String name, int msal)
    {
        Teacher_id = id;
        Teacher_name = name;
        monthly_salary = msal;
    }

    public int TaxDeduction(int monthly_salary)
    {
        return (int) ((monthly_salary * 12) * 0.1);
    }


}

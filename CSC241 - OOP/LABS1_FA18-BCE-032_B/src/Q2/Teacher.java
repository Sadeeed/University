package Q2;

public class Teacher {
    private String Teacher_id;
    private String Teacher_name;
    private int Teacher_monthlysalary;

    public Teacher(String i, String n, int msal)
    {
        Teacher_id = i;
        Teacher_name = n;
        Teacher_monthlysalary = msal;
    }

    public int Annual_Sal(int sal)
    {
        return (int) ((sal * 12));
    }
}

package Q2;

public class VisitingTeacher extends Teacher
{
    int SalaryPerDay;

    public VisitingTeacher(String id, String name, int msal, int spd)
    {
        super(id, name, msal);
        SalaryPerDay = spd;
    }

    public int Monthly_salary(int salaryPerDay)
    {
        return (int) SalaryPerDay*30;
    }
}

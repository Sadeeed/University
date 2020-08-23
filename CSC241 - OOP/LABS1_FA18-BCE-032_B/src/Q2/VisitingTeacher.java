package Q2;

public class VisitingTeacher extends Teacher {
    private int SalaryPerDay;

    public VisitingTeacher(String id, String name, int m, int salpd)
    {
        super(id, name, m);
        SalaryPerDay = salpd;
    }

    public int Monthly_sal(int spd)
    {
        return spd * 30;
    }

}

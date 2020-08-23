package PayRollSystem;

public class DateofBirth {
    private int day;
    private String month;

    public DateofBirth(int day, String month) {
        setDay(day);
        setMonth(month);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }


}

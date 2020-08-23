package com.icesoup.lab2;

public class Time {
    private int hour;
    private int min;
    private int sec;

    private int year;
    private int month;
    private int date;

    public void setHour(int h)
    {
        this.hour = h;
    }

    public int getHour()
    {
        return hour;
    }

    public void setMin(int m)
    {
        this.min = m;
    }

    public int getMin()
    {
        return min;
    }

    public void setSec(int s)
    {
        sec = s;
    }

    public int getSec()
    {
        return sec;
    }



    public void setYear(int y)
    {

        year = y;
    }

    public int getYear()
    {

        return year;
    }

    public void setMonth(int m)
    {
        month = m;
    }

    public int getMonth()
    {
        return month;
    }

    public void setDate(int d)
    {
        date = d;
    }

    public int getDate()
    {
        return date;
    }

    public void toMin()
    {
        min = hour*60;
    }


}

package Q1;

import java.util.Calendar;

public class Student {
    private String id;
    private String name;
    private int date_of_birth;
    private String address;

    public Student(String i, String n, int d, String a)
    {
        id = i;
        name = n;
        date_of_birth = d;
        address = a;
    }

    public int CalculateAge(int dob){
        if(dob<10000000)
        {
            System.out.println("Incorrect Date of birth");
            return -1;
        }
        StringBuilder dateOfBirth = new StringBuilder(String.valueOf(dob));
        //int Day = Integer.parseInt(dateOfBirth.substring(0,2));
        //int Month = Integer.parseInt(dateOfBirth.substring(2,4));
        int Year = Integer.parseInt(dateOfBirth.substring(4,8));

        return 2020 - Year;
    }

    public void DisplayStudent()
    {
        System.out.println("Name: " + name + "\nID: " + id + "\nAge: " + CalculateAge(date_of_birth) + "\nAddress: " + address);
    }

}

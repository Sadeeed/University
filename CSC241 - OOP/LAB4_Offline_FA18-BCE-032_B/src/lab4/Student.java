package lab4;

import java.util.Scanner;

public class Student extends Person {

    Scanner scn = new Scanner(System.in);

    private int rollNo;
    private int Semester;
    private double cgpa;

    public Student(String n, int a, String addr, int r , int s , double c) {
        super(n, a, addr);
        this.rollNo = r;
        this.Semester = s;
        this.cgpa = c;
    }

    public void Student_Display()
    {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Semester: " + Semester);
        System.out.println("CGPA: " + cgpa);
    }

}

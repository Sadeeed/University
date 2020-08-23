package com.icesoup.lab2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);

        // Course Result
        CourseResult c1 = new CourseResult();
        //CourseResult c2 = new CourseResult();

        System.out.println("Name: ");
        c1.StudentName = input.nextLine();
        System.out.println("Course: ");
        c1.CourseName = input.nextLine();
        System.out.println("Grade: ");
        c1.Grade = input.nextLine();

        System.out.println(" " + c1.StudentName + " " + c1.CourseName + " " + c1.Grade);

        // Date
        Date d1 = new Date();

        System.out.println("Enter Date: ");
        d1.date = input.nextLine();
        System.out.println("Enter Month: ");
        d1.month = input.nextLine();
        System.out.println("Enter Year: ");
        d1.year = input.nextLine();

        System.out.println("Date: " + d1.date + " Month: " + d1.month + " Year: " + d1.year);

        // CarPart
        CarPart p1 = new CarPart();

        //model
        System.out.println("Enter Model # : ");
        p1.setModelNumber(input.nextLine());

        //part
        System.out.println("Enter Part # : ");
        p1.setPartNumber(input.nextLine());


        //cost
        System.out.println("Enter Cost: ");
        p1.setCost(input.nextFloat());

        System.out.println("Model: " + p1.getModelNumber());
        System.out.println("Part Number: " + p1.getPartNumber());
        System.out.println("Cost: " + p1.getCost());

        //uni mgmt
        Student s1 = new Student();

        System.out.println("Enter Name: ");
        s1.setName(input.nextLine());
        System.out.println("Enter ID: ");
        s1.setId(input.nextLine());
        /*
        System.out.println("GPA: ");
        s1.calCgpa(input.nextFloat(),input.nextFloat());
        */

        System.out.println("Name: " + s1.getName());
        System.out.println("ID:  " + s1.getId());

        //Time
        Time t1 = new Time();

        t1.setHour(input.nextInt());
        t1.toMin();
        System.out.println(t1.getMin());
        /*
        t1.setDate(input.nextInt());
        t1.setMonth(input.nextInt());
        t1.setYear(input.nextInt());

        System.out.println("Date: " + t1.getDate());
        System.out.println("Month: " + t1.getMonth());
        System.out.println("Year: " + t1.getYear());
         */
    }
}

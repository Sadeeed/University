package lab4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //TASK 1
        Array a = new Array();
        a.input();
        a.printarray();
        a.Average();
        a.CompareMax();
        a.CompareMin();


        //TASK 3
        Person[] p = new Person[10];
        for (int i=0; i < 2 ;i++)
        {
            System.out.println("Enter Name: ");
            String name = scan.next();
            System.out.println("Enter Age: ");
            int age = scan.nextInt();
            System.out.println("Enter Address: ");
            String add = scan.next();

            p[i] = new Person(name,age,add);
        }

        for (int j =0 ; j < 2 ; j++ )
        {
            p[j].display();
        }

        //TASK 4
        Student[] s = new Student[5];
        for(int k = 0 ; k < 5 ; k++)
        {
            System.out.println("Enter Name: ");
            String sname = scan.next();
            System.out.println("Enter Age: ");
            int sage = scan.nextInt();
            System.out.println("Enter Address: ");
            String sadd = scan.next();
            System.out.println("Enter Roll no: ");
            int r = scan.nextInt();
            System.out.println("Enter Semester: ");
            int se = scan.nextInt();
            System.out.println("Enter cgpa: ");
            double c = scan.nextDouble();

            s[k] = new Student(sname,sage,sadd,r,se,c);
        }

        for (int l = 0 ; l < 5 ; l++)
        {
            s[l].display();
            s[l].Student_Display();

        }
    }
}

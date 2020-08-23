package Q2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        String i, n;
        int m,pd;

        System.out.println("ID: ");
        i = scn.next();
        System.out.println("Name: ");
        n = scn.next();
        System.out.println("Monthly Salary: ");
        m = scn.nextInt();
        System.out.println("Salary Per Day: ");
        pd = scn.nextInt();

        VisitingTeacher t = new VisitingTeacher(i,n,m,pd);
        System.out.println("Annual Salary: " + t.Annual_Sal(t.Monthly_sal(pd)));
    }

}

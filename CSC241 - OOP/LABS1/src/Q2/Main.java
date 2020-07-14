package Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        String id, n;
        int msal, spd;

        System.out.println("ID: ");
        id = scn.next();
        System.out.println("Name: ");
        n = scn.next();
        System.out.println("Monthly Salary: ");
        msal = scn.nextInt();
        System.out.println("Salary Per Day: ");
        spd = scn.nextInt();

        VisitingTeacher t = new VisitingTeacher(id,n,msal,spd);
        System.out.println("Annual Salary: " + t.TaxDeduction(t.Monthly_salary(spd)));
    }
}

package Q1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String id, n, a;
        int d;

        Scanner scn = new Scanner(System.in);
        Student[] s = new Student[5];

        for(int i = 0; i < 5; i++)
        {
            System.out.println("ID: ");
            id = scn.next();
            System.out.println("Name: ");
            n = scn.next();
            System.out.println("DOB (ddmmyyyy): ");
            d = scn.nextInt();
            System.out.println("Address: ");
            a = scn.next();

            s[i] = new Student(id,n,d,a);
            s[i].DisplayStudent();

        }
    }
}

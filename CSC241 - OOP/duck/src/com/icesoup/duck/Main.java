package com.icesoup.duck;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("D U C K");

        // Setup random number generator
        Random generator = new Random(System.currentTimeMillis());

        //System.out.println("Random: " + random);

        // Create a duck
        duck d = new duck();

        // Input Stuff
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        d.SetNumber(input.nextInt());
        System.out.println("Enter Energy Level: ");
        d.SetEnergy(input.nextInt());

        for (int i=0;i < 5;i++)
        {

            int random = generator.nextInt(3) + 1;

            switch (random)
            {
                case 1:
                    d.swim();
                    break;

                case 2:
                    d.walk();
                    break;

                case 3:
                    d.eat();
                    break;
            }
        }

        // Print info
        System.out.println("Duck # " + d.GetNumber());
        System.out.printf("Energy %d\n",d.GetEnergy());
    }
}

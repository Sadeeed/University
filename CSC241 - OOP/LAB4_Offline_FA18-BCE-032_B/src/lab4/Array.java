package lab4;

import java.util.Scanner;

public class Array {

    Scanner scn = new Scanner(System.in);
    public int n = scn.nextInt();

    int[] arry = new int[n];


    public void input()
    {
        for (int i = 0 ; i < n ;i++)
        {
            System.out.println("Enter " + i + "'th Value");
            arry[i] = scn.nextInt();
        }
    }


    public void printarray(){
        System.out.println("Elements of Array");
        for (int i =0 ; i < n ; i++)
        {
            System.out.println(arry[i]);
        }
    }

    public void Average(){
        int sum = 0;
        for (int i=0 ; i < n ; i++)
        {
            sum += arry[i];
        }
        float avg = (float) sum / n;
        System.out.println("Average : " + avg);
    }

    public void CompareMin(){
        int min = arry[0];
        for (int i = 0 ; i < n ; i++)
        {
            if (min > arry[i])
            {
                min = arry[i];
            }
        }
        System.out.println("Minimum : " + min);
    }

    public void CompareMax(){
        int max = arry[0];
        for (int i = 0 ; i < n ; i++)
        {
            if (max < arry[i])
            {
                max = arry[i];
            }
        }
        System.out.println("Maximum : " + max);
    }
}

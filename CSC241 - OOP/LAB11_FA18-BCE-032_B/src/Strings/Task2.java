package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    Scanner scn = new Scanner(System.in);

//    public String input()
//    {
//        System.out.println( "Enter a phone number: \n" + ConsoleColors.GREEN_BOLD + "Example: (555) 555-5555" + ConsoleColors.RESET + " : ");
//        return scn.nextLine();
//    }

    public void tokenize(String num)
    {
        System.out.println(ConsoleColors.GREEN + "Number: " + ConsoleColors.RESET + num);
        String[] token = num.split("[^0-9]");
        System.out.println(ConsoleColors.GREEN + "Tokenized: " + ConsoleColors.RESET + token[1].concat(token[3].concat(token[4])));

        //num.split("\\([0-9]{3}\\) [0-9]{3}-[0-9]{4}");
        //System.out.println(Arrays.toString(num.split("\\([0-9]{3}\\) [0-9]{3}-[0-9]{4}")));
    }

}

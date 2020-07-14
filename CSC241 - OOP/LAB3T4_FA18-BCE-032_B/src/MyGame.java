import java.util.Scanner;

public class MyGame {

    public static int score;
    //check whether we have declared valid instance variables?

    public static String word1;
    public static String word2;
    public static String word3;


    public static void level1() {

        System.out.println("Score is: " + score);
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess the word");
        String input = scan.next();

        if (input.equals(word1)) {
            score -= 1;
        } else if (input.equals(word2)) {
            score += 5;
        } else if (input.equals(word3)) {
            score += 1;
        }
    }
}
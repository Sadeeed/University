import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);

        while (MyGame.score < 5) {

            System.out.println("Enter Word 1: " + "Score: " + MyGame.score);
            String w1 = input.nextLine();
            System.out.println("Enter Word 2: " + "Score: " + MyGame.score);
            String w2 = input.nextLine();
            System.out.println("Enter Word 3: " + "Score: " + MyGame.score);
            String w3 = input.nextLine();

            MyGame.level1(w1,w2,w3);
        }

        if (MyGame.score == 5)
        {
            LevelTwo.leveltwo();
            System.out.println("Score: " + MyGame.score);
        }

    }
}

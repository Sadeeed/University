
public class MyGame {
    public static String word1;
    public static String word2;
    public static String word3;
    public static int score = 0;

    /*

    public MyGame(String w1, String w2, String w3)
    {
        this.word1 = w1;
        this.word2 = w2;
        this.word3 = w3;
    }

    */

    public static void level1(String w1,String w2,String w3)
    {
        //Scanner input = new Scanner(System.in);

        if (w1.equals("word 1"))
        {
            score -= 1;
        }
        else if(w2.equals("word 2"))
        {
            score += 5;
        }
        else if(w3.equals("word 3"))
        {
            score += 1;
        }
    }
}

package Strings;

import java.util.Random;

public class Task1 {

    private final String[] article = {"the","a","one","some","any"};
    private final String[] noun = {"boy","girl","dog","town","car"};
    private final String[] verb = {"drove", "jumped", "walked", "ran", "skipped"};
    private final String[] prepositions = {"to", "from", "over", "under", "on"};

    Random gen = new Random(System.currentTimeMillis());
    //int rX = gen.nextInt(5);

    public void makeSentence(int amt)
    {

        for(int i = 0; i < amt; i++)
        {
            //article[gen.nextInt(article.length)]
            int articleRand = gen.nextInt(article.length);

            //Using "article[articleRand].substring(0,1).toUpperCase() + article[articleRand].substring(1)" to capitalize first letter

            System.out.println(article[articleRand].substring(0,1).toUpperCase() + article[articleRand].substring(1) + " " + noun[gen.nextInt(noun.length)]
                    + " " + verb[gen.nextInt(verb.length)] + " " + prepositions[gen.nextInt(prepositions.length)]
                    + " " + article[gen.nextInt(article.length)] + " " + noun[gen.nextInt(noun.length)] + ".");

//            System.out.println(article[gen.nextInt(article.length)].concat(noun[gen.nextInt(noun.length)].concat(
//                    verb[gen.nextInt(verb.length)].concat(prepositions[gen.nextInt(prepositions.length)].concat(
//                            article[gen.nextInt(article.length)].concat(noun[gen.nextInt(noun.length)]))))));
            // Not using .concat() because it makes handling spaces complex
        }
    }


}

package Strings;

public class Task3 {

    public void tokenize(String text)
    {
        String[] token = text.split(" ");
        for (String b: token)
        {
            if (b.startsWith("B") || b.startsWith("b"))
            {
                System.out.println(b);
            }

            //System.out.println(Arrays.toString(b.split("^([B-b]\\w+)")));
        }
    }
}

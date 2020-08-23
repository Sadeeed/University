package Files;

import java.io.*;
import java.util.*;

public class Task1{

    //ArrayList<String> text = new ArrayList<String>();

    public void write(String str){

        try{
            FileWriter textFile =  new FileWriter("textFile.txt",false);
            textFile.write(str + "\n");
            textFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void read(){

        try{
            Scanner inFile = new Scanner(new File("textFile.txt"));
            String text = inFile.nextLine();
            System.out.println(text);
            String[] textArray = text.split("\\W");
            ArrayList<String> al = new ArrayList<String>(Arrays.asList(textArray));
            Collections.reverse(al);
            for (String i : al) {
                System.out.printf("%s ", i);
            }

//            ArrayList<String> al = (ArrayList<String>) Files.readAllLines(Paths.get("textFile.txt"));
//
//            System.out.println(al.toString().replaceAll("\\W"," "));
//            String[] text = al.toString().replaceAll("\\W"," ").split(" ");
//            Collections.reverse(Arrays.asList(text));
//            String reversedText = Arrays.toString(text).replaceAll("\\W", " ");
//            write(reversedText);
//            System.out.println(reversedText);


        } catch (Exception ioException) {
            ioException.printStackTrace();
        }

    }


}

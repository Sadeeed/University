package Collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Task1 {

    Random gen = new Random(System.currentTimeMillis());

    private LinkedList<Integer> genRandomList(){
        LinkedList<Integer> randList = new LinkedList<Integer>();
        for (int i = 0; i < 25 ; i++) {
            randList.add(gen.nextInt(100));
        }
//        System.out.println(randList);
//        System.out.println(randList.size());
        return randList;
    }

    private LinkedList<Integer> sortList(){
        LinkedList<Integer> sortedList = genRandomList();
        Collections.sort(sortedList);
//        System.out.println(sortedList);
//        System.out.println(sortedList.size());
        return sortedList;
    }

    public void sumAndAverage(){

        LinkedList<Integer> list = sortList();
        System.out.println(list.toString().replace(","," +"));
        int sum = 0;

        for (Integer sl:list){
//            System.out.println(sl);
            sum += sl;
        }
        float avg = (float) sum/list.size();
        System.out.println("Sum: " + sum + "\nAverage: " + avg);
    }

}

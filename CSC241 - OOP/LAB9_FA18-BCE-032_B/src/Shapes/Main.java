package Shapes;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] pA = {906, 347190, 205345, 140914, 74521};
        ArrayList<Integer> sA = new ArrayList<Integer>();
        sA.add(13297);
        sA.add(72971);

        Stats[] st = new Stats[3];
        st[0] = new Rectangle("red",false,12.3,7.9);
        st[1] = new Square("pink",false,10.0);
        st[2] = new Country("Pakistan", pA, sA);


        for (Stats stat:st){
            printStats(stat);
        }

    }

    public static void printStats(Stats i){
        i.computeArea();
        i.reset();
    }
}
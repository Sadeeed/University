package Shapes;

import java.util.ArrayList;
import java.util.Arrays;

public class Country implements Stats{
    private String name = null;
    private int[] provincesAreas;
    private ArrayList<Integer> statesArea;

    public Country(String n, int[] pA, ArrayList<Integer> sA){
        setName(n);
        setProvincesAreas(pA);
        setStatesArea(sA);
    }

    @Override
    public void computeArea() {
        int sumPA = 0;
        int sumSA = 0;
        for (int pA:provincesAreas)
        {
            sumPA += pA;
        }

        for (int sA:statesArea)
        {
            sumSA += sA;
        }

        System.out.println("Area of " + getName() + " is: " + (sumPA+sumSA) + " " + units);
    }

    @Override
    public void reset() {
        Arrays.fill(provincesAreas,0);
        statesArea.clear();
        //System.out.println("Reset Country \n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProvincesAreas(int[] provincesAreas) {
        this.provincesAreas = provincesAreas;
    }

    public void setStatesArea(ArrayList<Integer> statesArea) {
        this.statesArea = statesArea;
    }
}

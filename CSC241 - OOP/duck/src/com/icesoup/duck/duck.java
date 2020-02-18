package com.icesoup.duck;

public class duck {
    private int number,energy;

    public void swim()
    {
        System.out.printf("Duck %d Swims\n",number);
        energy = energy - 1;
    }

    public void walk()
    {
        System.out.printf("Duck %d Walks\n",number);
        energy = energy - 2;
    }

    public void eat()
    {
        System.out.printf("Duck %d Eats\n",number);
        energy = energy + 3;
    }

    public void SetNumber(int n)
    {
        this.number = n;
    }

    public void SetEnergy(int e)
    {
        this.energy = e;
    }

    public int GetNumber()
    {
        return number;
    }

    public int GetEnergy()
    {
        return energy;
    }

}

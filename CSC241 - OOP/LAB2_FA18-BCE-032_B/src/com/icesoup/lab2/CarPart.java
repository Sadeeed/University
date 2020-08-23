package com.icesoup.lab2;

public class CarPart {
    private String modelNumber;
    private String partNumber;
    private float cost;

    public String getModelNumber()
    {
        return modelNumber;
    }

    public String getPartNumber()
    {
        return partNumber;
    }

    public float getCost()
    {
        return cost;
    }

    public void setModelNumber(String m)
    {
        modelNumber = m;
    }

    public void setPartNumber(String p)
    {
        partNumber = p;
    }

    public void setCost(float c)
    {
        cost = c;
    }

}

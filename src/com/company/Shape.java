package com.company;

public abstract class Shape
{
    private String color;
    private int numberOfSides;

    public Shape(String color, int numberofSides)
    {
        this.color = color;
        this.numberOfSides = numberofSides;
    }

    public final int getNumberOfSides()
    {
        return numberOfSides;
    }

    public String getColor()
    {
        return color;
    }

    public abstract int getArea();
    public abstract void draw();
}

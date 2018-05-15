package com.company;

public class Triangle extends Shape
{
    private int length1;
    private int length2;
    private int length3;

    public Triangle(int length1, int length2, int length3, String color)
    {
        super(color, 3);
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    public int getArea()
    {
        //TODO add calculation
        return 0;
    }

    public void draw()
    {
        System.out.println("I am a " + getColor() + " triangle, my area is " + getArea());
    }
}

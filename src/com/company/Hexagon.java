package com.company;

public class Hexagon extends Shape
{
    private int length;

    public Hexagon(int length, String color)
    {
        super(color, 6);
    }

    @Override
    public int getArea()
    {
        //TODO add calculation
        return 0;
    }

    @Override
    public void draw()
    {
        System.out.println("I am a " + getColor() + " hexagon, my area is " + getArea());
    }
}

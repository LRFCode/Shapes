package com.company;

public class Rectangle extends Shape
{
    private int height;
    private int width;

    public Rectangle(int height, int width, String color)
    {
        super(color, 4);
        this.height = height;
        this.width = width;
    }

    public int getArea()
    {
        return height * width;
    }

    public void draw()
    {
        System.out.println("I am a " + getColor() + " rectangle, my area is " + getArea());
    }
}

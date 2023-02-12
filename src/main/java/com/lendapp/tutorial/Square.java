package com.lendapp.tutorial;

public class Square implements Shape{
    //Allowing for multiple classes
    private double side;
    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getInfo() {
        return 0;
    }

    public static void main(String[] args) {
        Square square = new Square(4.5);
        System.out.println(square.getArea());
    }
}

package com.lendapp.tutorial;

public class Squares extends Shapes {
    private double side;

    public Squares(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    public static void main(String[] args) {
        Squares squares = new Squares(3);
        System.out.println(squares.getArea());
    }


}

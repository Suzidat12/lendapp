package com.lendapp.tutorial;

public class Seun extends Shapes{
    private  double side;

    public Seun(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side * side;
    }

    @Override
    public double getPerimeter() {
        return 2*side;
    }

    public static void main(String[] args) {
        Seun seun = new Seun(4);
        System.out.println(seun.getArea());
    }
}

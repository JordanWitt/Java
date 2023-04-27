package org.example.sectionFive.shapes;



public class Circle{
    private final double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public  double getCircumference(){
        return 2 * Math.PI * radius;
    }
}

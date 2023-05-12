package org.example.sectionFive.shapes;

public class ShapesTest {
    public static void main(String[]args){
        Rectangle rectangle = new Rectangle();
        Square square = new Square(8);
        Rectangle rectangle2 = new Rectangle();


        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());


        System.out.println(rectangle2.getPerimeter());
        System.out.println(rectangle2.getArea());
        rectangle2.setLength(8);
        rectangle2.setWidth(4);
        System.out.println(rectangle2.getPerimeter());
        System.out.println(rectangle2.getArea());

        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());

        Measurable myShape = (Measurable) new Rectangle();
        Measurable myShape2 = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());

    }
}


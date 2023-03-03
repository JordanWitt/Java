package org.example;
import java.awt.*;
public class JavaTypes {
    public static void main(String[] args) {
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);
        System.out.println(x);

        Point point = new Point( 1, 1);
        Point point1 = point;
        point.x = 2;
        System.out.println(point);
        //values are independent
    }
}

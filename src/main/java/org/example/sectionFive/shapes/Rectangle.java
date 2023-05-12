package org.example.sectionFive.shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea(){
        return length * width;
    }
    public int getPerimeter(){
        return 2 * length + 2 * width;
    }

}

package org.example.sectionFive.shapes;

public class Square extends Quad{
    protected int side;
    public Square(int side) {
        super(side, side);
        this.side = side;
    }
    @Override
    public double getPerimeter(){
        return  4 * side;
    }
    @Override
    public double getArea(){
        return side ^ 2;
    }

    @Override
    void setLength(int length) {

    }

    @Override
    void setWidth(int width) {

    }
}

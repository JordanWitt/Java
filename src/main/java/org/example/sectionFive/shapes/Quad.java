package org.example.sectionFive.shapes;

abstract class Quad extends Shape implements Measurable{
    protected int length;
    protected int width;

    public Quad(int length, int width){
        this.length = length;
        this.width = width;
    }
    public int getLength(){
        return length;
    }
    abstract void setLength (int length);
    abstract void setWidth (int width);
}

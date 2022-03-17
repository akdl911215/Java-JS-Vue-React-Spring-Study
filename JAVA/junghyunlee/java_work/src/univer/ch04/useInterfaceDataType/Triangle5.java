package univer.ch04.useInterfaceDataType;

import univer.ch04.Figure;

class Triangle5 implements Figure {
    private double height, width;

    public Triangle5(double h, double w) {
        height = h;
        width = w;
    }

    @Override
    public double getArea() {
        return height * width * 0.5;
    }

    public double getHeight() {return height;}
    public double getWidth() {return width;}
}

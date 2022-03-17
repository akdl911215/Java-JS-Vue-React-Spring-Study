package univer.ch04.useInterfaceDataType;

import univer.ch04.Figure;

class Box5 implements Figure {

    private double height, width;
    public Box5(double h, double w) {
        height = h;
        width = w;
    }

    @Override
    public double getArea() {
        return height * width;
    }
}

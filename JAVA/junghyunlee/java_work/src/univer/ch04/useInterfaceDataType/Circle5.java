package univer.ch04.useInterfaceDataType;

import univer.ch04.Figure;

class Circle5 implements Figure {

    private double radius;
    public Circle5(double r) {
        radius = r;
    }

    @Override
    public double getArea() {
        return radius * radius * 3.11592;
    }
}

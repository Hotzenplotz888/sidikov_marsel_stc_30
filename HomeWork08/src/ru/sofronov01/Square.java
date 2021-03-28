package ru.sofronov01;

public class Square extends GeometricFigure {
    private final double side;


    public Square(int side) {
        super();
        this.side = side;
    }

    @Override
    public double getPerimeter() {
    return 4 * side;
    }

    @Override
    public double getArea() {
    return side * side;
    }

}

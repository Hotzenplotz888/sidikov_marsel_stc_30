package ru.sofronov01;
import java.lang.Math;

public class Ellipse extends GeometricFigure {
    private final double majorRadius;
    private final double minorRadius;
    private final double PI = 3.14;

    public Ellipse(double majorRadius, double minorRadius) {
        super();
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    @Override
    public double getPerimeter() {
        double c = majorRadius;
        return 2*PI*Math.sqrt((Math.pow(majorRadius,2)+Math.pow(minorRadius,2))/2);

    }

    @Override
    public double getArea() {
        return majorRadius * minorRadius * PI;
    }
}

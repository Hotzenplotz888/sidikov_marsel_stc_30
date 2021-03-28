package ru.sofronov01;

public class Main {
    public static void main(String[] args) {
        int i = 1;


        GeometricFigure rectangle = new Rectangle(12,8);
        GeometricFigure square = new Square(12);
        GeometricFigure square2 = new Square(8);
        GeometricFigure ellipse = new Ellipse(15,7);
        GeometricFigure circle = new Circle(15);
        GeometricFigure circle2 = new Circle(7);

        GeometricFigure[] figures = {rectangle, square, square2, ellipse, circle, circle2};

        for (GeometricFigure figure : figures) {
            System.out.println(i++ + ". " + "Perimeter = "+figure.getPerimeter());
            System.out.println(i++ + ". " +"Area = "+figure.getArea());

        }
    }
}

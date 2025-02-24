package com.aplavina;


import com.aplavina.figures.Circle;
import com.aplavina.figures.Figure;
import com.aplavina.figures.Square;
import com.aplavina.figures.Triangle;
import com.aplavina.geomutils.FiguresAnalyticsManager;
import com.aplavina.threedemensional.Sphere;
import com.aplavina.threedemensional.ThreeDemensionalFigure;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Figure figure = new Triangle(2, 3, 4);
        System.out.println("area: " + figure.area());
        System.out.println("perimeter: " + figure.perimeter());

        try {
            Figure invalid = new Triangle(2, 3, 5);
        } catch (IllegalArgumentException ex) {
            System.out.println("Caught IllegalArgumentException");
        }

        List<Figure> figures = List.of(new Circle(10), new Square(4));
        FiguresAnalyticsManager.printAnalytics(figures);

        ThreeDemensionalFigure threeDemensionalFigure = new Sphere(4);
        System.out.println("Sphere volume: " + threeDemensionalFigure.volume());
    }
}
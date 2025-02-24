package com.aplavina;

import com.aplavina.geomtry.Figure;
import com.aplavina.geomtry.Triangle;

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
    }
}
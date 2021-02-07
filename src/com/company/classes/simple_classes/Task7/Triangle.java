package com.company.classes.simple_classes.Task7;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Triangle {

    private double aX, aY, bX, bY, cX, cY;
    private double ab, bc, ca;
    NumberFormat formater = new DecimalFormat("0.00");

    public Triangle() {
        aX = 1;
        aY = 1;
        bX = 1;
        bY = 2;
        cX = 2;
        cY = 1;
    }

    public Triangle(double aX, double aY, double bX, double bY, double cX, double cY) {
        this.aX = aX;
        this.aY = aY;
        this.bX = bX;
        this.bY = bY;
        this.cX = cX;
        this.cY = cY;
    }

    public void printSidesTriangle() {
        System.out.println("Result: ");
        colculateSidesTriangle();
        System.out.println("side ab= " + formater.format(ab) + ", side bc= " + formater.format(bc) + ", side ca=  " + formater.format(ca));
    }


    private void colculateSidesTriangle() {
        ab = colculateSide(aX, aY, bX, bY);
        bc = colculateSide(bX, bY, cX, cY);
        ca = colculateSide(cX, cY, aX, aY);

    }

    private double colculateSide(double x1, double y1, double x2, double y2) {
        double side = sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2));
        return side;
    }


    public double perimetrTriangle() {
        colculateSidesTriangle();
        return ab + bc + ca;
    }

    public double squareTriangle() {
        double p = perimetrTriangle() / 2;
        return sqrt(p * (p - ab) * (p - bc) * (p - ca));
    }

    public void printCrossMedians() {
        double dX = (bX + cX) / 2;//"d- точка на середине отрезка bc;
        double dY = (bY + cY) / 2;
        double crossMedX = (dX- ((dX - aX) / 3));
        double crossMedY = (dY- ((dY - aY) / 3));
        System.out.println("Point cross of medians: x= " + formater.format(crossMedX) + ", y= " + formater.format(crossMedY));
    }
}

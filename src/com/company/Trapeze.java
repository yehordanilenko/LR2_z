package com.company;

public class Trapeze extends Quadrilateral {

    public boolean isIsosceles() {
        double k1, k2, k3, k4;
        boolean isCorrect=false;
        k1 = (y1 - y2) / (x1 - x2);
        k2 = (y2 - y3) / (x2 - x3);
        k3 = (y3 - y4) / (x3 - x4);
        k4 = (y4 - y1) / (x4 - x1);
        if (side1 == side3 && side4 != side2 && k2 == k4) {
            isCorrect=true;
        } else {
            if (side2 == side4 && side1 != side3 && k1 == k3) {
                isCorrect=true;
            }
        }
        return isCorrect;
    }

    @Override
    public String toString() {
        return "Trapeze{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                "x2=" + x2 +
                ", y2=" + y2 +
                ", x3=" + x3 +
                ", y3=" + y3 +
                ", x4=" + x4 +
                ", y4=" + y4 +
                ", side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", side4=" + side4 +
                ", P=" + P +
                ", diagonal1=" + diagonal1 +
                ", diagonal2=" + diagonal2 +
                ", square=" + square +
                '}';
    }
}

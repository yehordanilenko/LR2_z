package com.company;

public class Trepezies {
    Trapeze[] array1;
    int indexOfMinDiagonal = 0;
    public Trepezies(int amount) {
        this.array1 = new Trapeze[amount];
    }
    public boolean isIsosceles(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4,double side1,double side2,double side3, double side4) {
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

    public int findMinDiagonal(){
        for (int i = 1; i < array1.length; i++) {
            if(isIsosceles(array1[i].x1,array1[i].y1,array1[i].x2,array1[i].y2,array1[i].x3,array1[i].y3,array1[i].x4,array1[i].y4,array1[i].side1,array1[i].side2,array1[i].side3,array1[i].side4)) {
                if (array1[i].diagonal1 < array1[indexOfMinDiagonal].diagonal1) {
                    indexOfMinDiagonal = i;
                }
            }
        }
        return indexOfMinDiagonal;
    }
}

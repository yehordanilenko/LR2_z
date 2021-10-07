package com.company;

import java.util.Arrays;

public class Quadrilaterals {
    final double THRESHOLD = 1e-14;
    private Quadrilateral[] array;

    public Quadrilaterals(int quantity) {
        this.array = new Quadrilateral[quantity];
    }

    public void addQuadrilateral(Quadrilateral item) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = item;
    }

    public int findMaxSquare() {
        int indexOfMaxSquare = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i].square > array[indexOfMaxSquare].square)
                indexOfMaxSquare = i;
        }
        return indexOfMaxSquare;
    }

    public int calculateFiguresWithSquare(double square) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i].square - square) < THRESHOLD)
                counter++;
        }

        return counter;
    }

    @Override
    public String toString() {
        String result = "Info about Quadrilateral №";
        for (int i = 0; i < array.length; i++) {
            result += "i: " + array[i].toString() + "\n";
        }

        return result;
    }
}

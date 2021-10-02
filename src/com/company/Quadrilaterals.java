package com.company;

public class Quadrilaterals {
    Quadrilateral[] array;
    int indexOfMaxSquare = 0;
    final double THRESHOLD=0.0000001;
    public Quadrilaterals(int quantity) {
        this.array = new Quadrilateral[quantity];
    }

    public void findMaxSquare()
    {
        for (int i = 1; i < array.length; i++) {
            if (array[i].square > array[indexOfMaxSquare].square)
                indexOfMaxSquare = i;
        }
    }

    public int calculateFiguresWithSquare(double square)
    {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i].square - square)<THRESHOLD)
                counter++;
        }

        return counter;
    }

}

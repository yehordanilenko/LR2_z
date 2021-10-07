package com.company;

import java.util.Arrays;

public class Trepezies {
    private Trapeze[] array;

    public Trepezies(int amount) {
        this.array = new Trapeze[amount];
    }

    public boolean add(Trapeze trapeze)
    {
        if (trapeze.isIsosceles())
        {
            array = Arrays.copyOf(array, array.length+1);
            array[array.length-1] = trapeze;
            return true;
        }
        return false;
    }

    public int findMinDiagonal(){
        int indexOfMinDiagonal = 0;
        for (int i = 1; i < array.length; i++) {
            {
                if (array[i].diagonal1 < array[indexOfMinDiagonal].diagonal1) {
                    indexOfMinDiagonal = i;
                }
            }
        }
        return indexOfMinDiagonal;
    }

    public Trapeze get(int index)
    {
        return array[index];
    }

    @Override
    public String toString() {
        String result = "Info about Trapeze №";
        for (int i = 0; i < array.length; i++) {
            result += "i: " + array[i].toString() + "\n";
        }

        return result;
    }

}

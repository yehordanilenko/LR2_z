package com.company;

import java.util.Scanner;



public class Main {

    /* Вариант 9
    Создать класс четырехугольник, члены класса – координаты 4-х точек. Предусмотреть в классе
методы вычисления и вывода сведений о фигуре – длины сторон, диагоналей, периметр, площадь.
Создать производный класс – равнобочная трапеция, предусмотреть в классе проверку, является ли
фигура равнобочной трапецией. Написать программу, демонстрирующую работу с классом: дано N
четырехугольников и M трапеций, найти максимальную площадь четырехугольников и количество
четырехугольников, имеющих максимальную площадь, и трапецию с наименьшей диагональю.*/
    public static void main(String[] args) {

    taskPart1();
    taskPart2();
    }
    public static void taskPart1(){

        Scanner scan = new Scanner(System.in);


        int N;
        do {
            System.out.println("Введите количество четырехугольников: ");
            N = scan.nextInt();
        }while(N<1);
        Quadrilaterals quadrilaterals = new Quadrilaterals(N);

        for (int i = 0; i < N; i++) {
            quadrilaterals.array[i]=new Quadrilateral();
            System.out.println("Coordinates for Quadrilateral №"+(i+1));

            System.out.println("Input x1:");
            quadrilaterals.array[i].setX1(scan.nextDouble());
            System.out.println("Input y1:");
            quadrilaterals.array[i].setY1(scan.nextDouble());
            System.out.println("Input x2:");
            quadrilaterals.array[i].setX2(scan.nextDouble());
            System.out.println("Input y2:");
            quadrilaterals.array[i].setY2(scan.nextDouble());
            System.out.println("Input x3:");
            quadrilaterals.array[i].setX3(scan.nextDouble());
            System.out.println("Input y3:");
            quadrilaterals.array[i].setY3(scan.nextDouble());
            System.out.println("Input x4:");
            quadrilaterals.array[i].setX4(scan.nextDouble());
            System.out.println("Input y4:");
            quadrilaterals.array[i].setY4(scan.nextDouble());

            quadrilaterals.array[i].calculateParameters();
        }
        for (int i = 0; i < N; i++) {
            System.out.println("Info about Quadrilateral №" + (i+1));
            System.out.println(quadrilaterals.array[i].toString());
        }
        quadrilaterals.findMaxSquare();
        System.out.println("Amount qydrilaterals with max square: ");
        System.out.println(quadrilaterals.calculateFiguresWithSquare(quadrilaterals.array[quadrilaterals.indexOfMaxSquare].square));
    }
    public static void taskPart2(){
        Scanner scan = new Scanner(System.in);

        int M;
        do {
            System.out.println("Введите количество трапеций: ");
            M = scan.nextInt();
        }while(M<1);
        Trepezies trapezies = new Trepezies(M);

        for (int i = 0; i < M; i++) {
            trapezies.array1[i]=new Trapeze();
            System.out.println("Coordinates for Trapeze №"+(i+1));
            System.out.println("Input x1:");
            trapezies.array1[i].setX1(scan.nextDouble());
            System.out.println("Input y1:");
            trapezies.array1[i].setY1(scan.nextDouble());
            System.out.println("Input x2:");
            trapezies.array1[i].setX2(scan.nextDouble());
            System.out.println("Input y2:");
            trapezies.array1[i].setY2(scan.nextDouble());
            System.out.println("Input x3:");
            trapezies.array1[i].setX3(scan.nextDouble());
            System.out.println("Input y3:");
            trapezies.array1[i].setY3(scan.nextDouble());
            System.out.println("Input x4:");
            trapezies.array1[i].setX4(scan.nextDouble());
            System.out.println("Input y4:");
            trapezies.array1[i].setY4(scan.nextDouble());

            trapezies.array1[i].calculateParameters();
        }
        for (int i = 0; i < M; i++) {
            System.out.println("Info about Trapeze №" + (i+1));
            System.out.println(trapezies.array1[i].toString());
        }

        System.out.println("Trapeze with the minimal diagonal №: " + (trapezies.findMinDiagonal()+1));
    }
}

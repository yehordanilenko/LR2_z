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

    public static void taskPart1() {

        Scanner scan = new Scanner(System.in);


        int N;
        do {
            System.out.println("Введите количество четырехугольников: ");
            N = scan.nextInt();
        } while (N < 1);
        Quadrilaterals quadrilaterals = new Quadrilaterals(N);

        for (int i = 0; i < N; i++) {
            Quadrilateral temp = new Quadrilateral();
            System.out.println("Coordinates for Quadrilateral №" + (i + 1));

            System.out.println("Input x1:");
            temp.setX1(scan.nextDouble());
            System.out.println("Input y1:");
            temp.setY1(scan.nextDouble());
            System.out.println("Input x2:");
            temp.setX2(scan.nextDouble());
            System.out.println("Input y2:");
            temp.setY2(scan.nextDouble());
            System.out.println("Input x3:");
            temp.setX3(scan.nextDouble());
            System.out.println("Input y3:");
            temp.setY3(scan.nextDouble());
            System.out.println("Input x4:");
            temp.setX4(scan.nextDouble());
            System.out.println("Input y4:");
            temp.setY4(scan.nextDouble());

            temp.calculateParameters();
            quadrilaterals.addQuadrilateral(temp);
        }
        System.out.println(quadrilaterals);

        System.out.println("Amount quadrilaterals with max square: ");
        double maxSquare = quadrilaterals.findMaxSquare();

        System.out.println(quadrilaterals.calculateFiguresWithSquare(maxSquare));
    }

    public static void taskPart2() {
        Scanner scan = new Scanner(System.in);

        int M;
        do {
            System.out.println("Введите количество трапеций: ");
            M = scan.nextInt();
        } while (M < 1);
        Trepezies trapezies = new Trepezies(M);

        for (int i = 0; i < M; i++) {
            Trapeze trapezieTemp = new Trapeze();
            System.out.println("Coordinates for Trapeze №" + (i + 1));
            System.out.println("Input x1:");
            trapezieTemp.setX1(scan.nextDouble());
            System.out.println("Input y1:");
            trapezieTemp.setY1(scan.nextDouble());
            System.out.println("Input x2:");
            trapezieTemp.setX2(scan.nextDouble());
            System.out.println("Input y2:");
            trapezieTemp.setY2(scan.nextDouble());
            System.out.println("Input x3:");
            trapezieTemp.setX3(scan.nextDouble());
            System.out.println("Input y3:");
            trapezieTemp.setY3(scan.nextDouble());
            System.out.println("Input x4:");
            trapezieTemp.setX4(scan.nextDouble());
            System.out.println("Input y4:");
            trapezieTemp.setY4(scan.nextDouble());

            trapezieTemp.calculateParameters();
            trapezies.add(trapezieTemp);
        }

        System.out.println(trapezies);

        int indexMinDiagonal = trapezies.findMinDiagonal();
        System.out.println("Trapeze with the minimal diagonal №:" + (indexMinDiagonal + 1) + " its info: " + (trapezies.get(indexMinDiagonal)));
    }
}

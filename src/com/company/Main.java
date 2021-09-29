package com.company;

import java.util.Scanner;

import static java.sql.Types.NULL;

public class Main {

    /* Вариант 9
    Создать класс четырехугольник, члены класса – координаты 4-х точек. Предусмотреть в классе
методы вычисления и вывода сведений о фигуре – длины сторон, диагоналей, периметр, площадь.
Создать производный класс – равнобочная трапеция, предусмотреть в классе проверку, является ли
фигура равнобочной трапецией. Написать программу, демонстрирующую работу с классом: дано N
четырехугольников и M трапеций, найти максимальную площадь четырехугольников и количество
четырехугольников, имеющих максимальную площадь, и трапецию с наименьшей диагональю.*/
    public static void main(String[] args) {

    //taskPart1();
    taskPart2();
    }
    public static void taskPart1(){

        Scanner scan = new Scanner(System.in);
        Quadrilateral Ql = new Quadrilateral();

        int N,count=0;
        do {
            System.out.println("Введите количество четырехугольников: ");
            N = scan.nextInt();
        }while(N<1);
        Quadrilateral[] QL = new Quadrilateral[N];
        for (int i = 0; i < N; i++) {
            QL[i]=new Quadrilateral();
            System.out.println("Coordinates for Quadrilateral №"+(i+1));
            System.out.println("Input x1:");
            QL[i].x1=scan.nextDouble();
            System.out.println("Input y1:");
            QL[i].y1=scan.nextDouble();
            System.out.println("Input x2:");
            QL[i].x2=scan.nextDouble();
            System.out.println("Input y2:");
            QL[i].y2=scan.nextDouble();
            System.out.println("Input x3:");
            QL[i].x3=scan.nextDouble();
            System.out.println("Input y3:");
            QL[i].y3=scan.nextDouble();
            System.out.println("Input x4:");
            QL[i].x4=scan.nextDouble();
            System.out.println("Input y4:");
            QL[i].y4=scan.nextDouble();
        }
        for (int i = 0; i < N; i++) {
            System.out.println("Info about Quadrilateral №" + i + 1);
            QL[i].side1=Ql.DistBetPoints(QL[i].x1,QL[i].y1,QL[i].x2,QL[i].y2);
            QL[i].side2=Ql.DistBetPoints(QL[i].x2,QL[i].y2,QL[i].x3,QL[i].y3);
            QL[i].side3=Ql.DistBetPoints(QL[i].x3,QL[i].y3,QL[i].x4,QL[i].y4);
            QL[i].side4=Ql.DistBetPoints(QL[i].x4,QL[i].y4,QL[i].x1,QL[i].y1);
            QL[i].X1X2=QL[i].x2-QL[i].x1;QL[i].X1X4=QL[i].x4-QL[i].x1;QL[i].X2X3=QL[i].x3-QL[i].x2;QL[i].X3X4=QL[i].x4-QL[i].x3;
            QL[i].X2X1=QL[i].x1-QL[i].x2;QL[i].X4X1=QL[i].x1-QL[i].x4;QL[i].X3X2=QL[i].x2-QL[i].x3;QL[i].X4X3=QL[i].x3-QL[i].x4;
            QL[i].Y1Y2=QL[i].y2-QL[i].y1;QL[i].Y1Y4=QL[i].y4-QL[i].y1;QL[i].Y2Y3=QL[i].y3-QL[i].y2;QL[i].Y3Y4=QL[i].y4-QL[i].y3;
            QL[i].Y2Y1=QL[i].y1-QL[i].y2;QL[i].Y4Y1=QL[i].y1-QL[i].y4;QL[i].Y3Y2=QL[i].y2-QL[i].y3;QL[i].Y4Y3=QL[i].y3-QL[i].y4;
            Ql.InfoAboutSides(QL[i].side1,QL[i].side2,QL[i].side3,QL[i].side4);
            QL[i].diagonal1=Ql.DistBetPoints(QL[i].x1,QL[i].y1,QL[i].x3,QL[i].y3);
            QL[i].diagonal2=Ql.DistBetPoints(QL[i].x2,QL[i].y2,QL[i].x4,QL[i].y4);
            Ql.InfoAboutDiagonals(QL[i].diagonal1,QL[i].diagonal2);
            QL[i].P=Ql.Perimeter(QL[i].side1,QL[i].side2,QL[i].side3,QL[i].side4);
            QL[i].square=Ql.SquareQuadr(QL[i].side1,QL[i].side2,QL[i].side3,QL[i].side4,QL[i].diagonal1,QL[i].diagonal2);
            if(Math.PI == ((QL[i].alpha1 = Ql.CountCorner(QL[i].X1X2, QL[i].Y1Y2, QL[i].X1X4, QL[i].Y1Y4) )+ (QL[i].alpha3 = Ql.CountCorner(QL[i].X3X2, QL[i].Y3Y2, QL[i].X3X4, QL[i].Y3Y4))) && Math.PI== (((QL[i].alpha2=Ql.CountCorner(QL[i].X2X1,QL[i].Y2Y1,QL[i].X2X3,QL[i].Y2Y3))+(QL[i].alpha4=Ql.CountCorner(QL[i].X4X1,QL[i].Y4Y1,QL[i].X4X3,QL[i].Y4Y3))))){
                QL[i].MaxSquare=Ql.MaxSquare(QL[i].side1,QL[i].side2,QL[i].side3,QL[i].side4);
                count+=1;
            }
            else
            {
                System.out.println("Quadrilateral has not MaxSquare!");
                QL[i].MaxSquare=NULL;
            }
            System.out.println("Amount qyadrilateral, that has max square: " + count);
        }
    }
    public static void taskPart2(){
        Scanner scan = new Scanner(System.in);
        Trapeze Tr= new Trapeze();
        int M;
        do {
            System.out.println("Введите количество трапеций: ");
            M = scan.nextInt();
        }while(M<1);
        Trapeze[] TR= new Trapeze[M];
        for (int i = 0; i < M; i++) {
            TR[i]=new Trapeze();
            System.out.println("Coordinates for Trapeze №"+(i+1));
            System.out.println("Input x1:");
            TR[i].x1=scan.nextDouble();
            System.out.println("Input y1:");
            TR[i].y1=scan.nextDouble();
            System.out.println("Input x2:");
            TR[i].x2=scan.nextDouble();
            System.out.println("Input y2:");
            TR[i].y2=scan.nextDouble();
            System.out.println("Input x3:");
            TR[i].x3=scan.nextDouble();
            System.out.println("Input y3:");
            TR[i].y3=scan.nextDouble();
            System.out.println("Input x4:");
            TR[i].x4=scan.nextDouble();
            System.out.println("Input y4:");
            TR[i].y4=scan.nextDouble();
        }

        double MIN_Diagonal;
        int numberTrapeze = 0;
        for (int i = 0; i < M; i++) {
            if(Tr.CheckIsosceles(TR[i].x1,TR[i].y1,TR[i].x2,TR[i].y2,TR[i].x3,TR[i].y3,TR[i].x4,TR[i].y4,TR[i].CORRECT)){
                TR[i].diagonal1=Tr.DistBetPoints(TR[i].x1,TR[i].y1,TR[i].x3,TR[i].y3);
                if(TR[i].diagonal1<TR[i+1].diagonal1){
                    MIN_Diagonal=TR[i].diagonal1;
                    numberTrapeze=i;
                }
                else
                {
                    MIN_Diagonal=TR[i+1].diagonal1;
                    numberTrapeze=i+1;
                }

            }
            else
            {
                System.out.println("Trapeze № "+(i+1)+" is not Isosceles!");
                TR[i].diagonal1=NULL;

            }
        }
        System.out.println("Trapeze with the minimal diagonal №: " + numberTrapeze);
    }
}

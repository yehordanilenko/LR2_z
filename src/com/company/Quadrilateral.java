package com.company;


public class Quadrilateral {
    double x1,y1,x2,y2,x3,y3,x4,y4;
    double side1;
    double side2;
    double side3;
    double side4;
    double P;
    double diagonal1;
    double diagonal2;
    double square;
    double X1X2,X1X4,X2X3,X3X4;
    double X2X1,X4X1,X3X2,X4X3;
    double Y1Y2,Y1Y4,Y2Y3,Y3Y4;
    double Y2Y1,Y4Y1,Y3Y2,Y4Y3;
    double alpha1,alpha2,alpha3,alpha4;
    double MaxSquare;
    public double DistBetPoints(double x1, double y1, double x2, double y2){
        double side=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        return side;
    }

    public void InfoAboutSides(double a,double b, double c, double d){
        System.out.println("Side1 = " + a);
        System.out.println("Side2 = " + b);
        System.out.println("Side3 = " + c);
        System.out.println("Side4 = " + d);
    }

    public void InfoAboutDiagonals(double A,double B){
        System.out.println("Diagonal1 = " + A);
        System.out.println("Diagonal2 = " + B);
    }

    public double Perimeter(double a,double b,double c,double d){
        P=(a+b+c+d);
        System.out.println("Perimeter = " + P);
        return P;
    }

    public double SquareQuadr(double a,double b,double c,double d,double e, double f){
        double m=2*e*f,n=(b*b+d*d-a*a-c*c);
        square=0.25*Math.sqrt(m*m-n*n);
        System.out.println("Square = " + square);
        return square;
    }

    public double MaxSquare(double a,double b,double c,double d) {

        double p=(a+b+c+d)/2;
        double MaxSquare = Math.sqrt((p-a)*(p-b)*(p-c)*(p-d));
        System.out.println("Max Square = " + MaxSquare);
        return MaxSquare;

    }

    public double CountCorner(double x1,double y1,double x2,double y2){
        double alpha=Math.acos(Math.abs(x1*x2+y1*y2)/Math.sqrt((x1*x1+y1*y1)*(x2*x2+y2*y2)));
        return alpha;
    }

}

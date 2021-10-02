package com.company;


public class Quadrilateral {
    double x1, y1;
    double x2;
    double y2;
    double x3;
    double y3;
    double x4;
    double y4;
    double side1;
    double side2;
    double side3;
    double side4;
    double P;
    double diagonal1;
    double diagonal2;
    double square;
    double X1X2, X1X4, X2X3, X3X4;
    double X2X1, X4X1, X3X2, X4X3;
    double Y1Y2, Y1Y4, Y2Y3, Y3Y4;
    double Y2Y1, Y4Y1, Y3Y2, Y4Y3;
    double alpha1, alpha2, alpha3, alpha4;


    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public void setY3(double y3) {
        this.y3 = y3;
    }

    public void setX4(double x4) {
        this.x4 = x4;
    }

    public void setY4(double y4) {
        this.y4 = y4;
    }
    public double DistBetPoints(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public String InfoAboutSides(double a, double b, double c, double d) {
        return "Side1 = " + a + System.lineSeparator() +
                "Side2 = " + b + System.lineSeparator() +
                "Side3 = " + c + System.lineSeparator() +
                "Side4 = " + d;
    }

    public String InfoAboutDiagonals(double A, double B) {
        return
        "Diagonal1 = " + A + System.lineSeparator()+
        "Diagonal2 = " + B;
    }

    public double Perimeter(double a, double b, double c, double d) {
        return (a + b + c + d);
    }

    public double SquareQuadr(double a, double b, double c, double d, double e, double f) {
        double m = 2 * e * f, n = (b * b + d * d - a * a - c * c);
        square = 0.25 * Math.sqrt(m * m - n * n);
        return square;
    }



    public double CountCorner(double x1, double y1, double x2, double y2) {
        double alpha = Math.acos(Math.abs(x1 * x2 + y1 * y2) / Math.sqrt((x1 * x1 + y1 * y1) * (x2 * x2 + y2 * y2)));
        return alpha;
    }

    public void calculateParameters() {
        side1 = DistBetPoints(x1, y1, x2, y2);
        side2 = DistBetPoints(x2, y2, x3, y3);
        side3 = DistBetPoints(x3, y3, x4, y4);
        side4 = DistBetPoints(x4, y4, x1, y1);
        X1X2=x2-x1;X1X4=x4-x1;X2X3=x3-x2;X3X4=x4-x3;
        X2X1=x1-x2;X4X1=x1-x4;X3X2=x2-x3;X4X3=x3-x4;
        Y1Y2=y2-y1;Y1Y4=y4-y1;Y2Y3=y3-y2;Y3Y4=y4-y3;
        Y2Y1=y1-y2;Y4Y1=y1-y4;Y3Y2=y2-y3;Y4Y3=y3-y4;
        diagonal1=DistBetPoints(x1,y1,x3,y3);
        diagonal2=DistBetPoints(x2,y2,x4,y4);
        P=Perimeter(side1,side2,side3,side4);
        square=SquareQuadr(side1,side2,side3,side4,diagonal1,diagonal2);
    }



    @Override
    public String toString() {
        return "Quadrilateral{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                ", x3=" + x3 +
                ", y3=" + y3 +
                ", x4=" + x4 +
                ", y4=" + y4 +
                ", side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", side4=" + side4 +
                ", diagonal1=" + diagonal1 +
                ", diagonal2=" + diagonal2 +
                ", Perimeter=" + P +
                ", square=" + square +
                '}';
    }
}

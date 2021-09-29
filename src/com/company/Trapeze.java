package com.company;

public class Trapeze {
    double x1,y1,x2,y2,x3,y3,x4,y4,diagonal1;
    boolean CORRECT;
    public double DistBetPoints(double x1, double y1, double x2, double y2){
        double side=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        return side;
    }

    public boolean CheckIsosceles(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, boolean Yes){
        double k1,k2,k3,k4;


        k1=(y1-y2)/(x1-x2);
        k2=(y2-y3)/(x2-x3);
        k3=(y3-y4)/(x3-x4);
        k4=(y4-y1)/(x4-x1);

        double side1=DistBetPoints(x1,y1,x2,y2);
        double side2=DistBetPoints(x2,y2,x3,y3);
        double side3=DistBetPoints(x3,y3,x4,y4);
        double side4=DistBetPoints(x4,y4,x1,y1);

        if(side1==side3 && side4!=side2 && k2==k4){
            Yes=true;
        }
        else
        {
            if(side2==side4 && side1!=side3 && k1==k3){
                Yes=true;
            }
            else
            {
                Yes=false;
            }
        }
        return Yes;
    }
}

package com.company.basics.branching;

public class BranchingTask3 {
int x1=1;
int y1=1;
int x2=2;
int y2 =2;
int x3 =3;
int y3=3;
    void branchingTask3(){

        System.out.println( (y1-y2)*x3+(x2-x1)*y3+(x1*y2-x2*y1)==0 ? "points on one straight line. " : "points not on one straight line."   );


    }
}

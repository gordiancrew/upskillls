package com.company.basics.branching;

public class BranchingTask1 {
    int angle1=30;
    int angle2=80;

    void branchingTask1(){
        System.out.println(angle1>0&&angle2>0&&(angle1+angle2)<180? "triangle exist, "+(angle1==90||angle2==90||angle2+angle1==90?" rectangular triangle":"triangle does not rectangular  "):"triangle does not exist");
    }


}

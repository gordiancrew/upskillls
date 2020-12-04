package com.company.basics.branching;

public class BranchingTask4 {
    int a=5;
    int b=7;
    int x= 4;
    int y=6;
    int z =8;

    void branchingTask4(){
        int brick1=Math.min(Math.min(x,y),z);
        int brick2=Math.max(x,Math.max(y,z));
        if(x>=y&&x<=z)
            brick2=x;
        else if(y>=x&&y<=z)
            brick2=y;
        else
            brick2=z;
        System.out.println(brick1<=Math.min(a,b)&&brick2<=Math.max(a,b)? "Brick is enter":"Brick don't enter");





    }




}

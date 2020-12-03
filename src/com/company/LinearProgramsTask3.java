package com.company;

public class LinearProgramsTask3 {
    double x=3;
    double y=4;
    double z;
    void linearProgramsTask3()
    {
        z=(Math.sin(x)  +Math.cos(y))/(Math.cos(x)+Math.sin(y))*Math.tan(x)*y;
        System.out.println(z);
    }

}

package com.company.basics.cycles;

import java.math.BigInteger;

public class CyclesTask3and4 {
    int square100=0;
   BigInteger mult200=BigInteger.valueOf(1);

    void cyclesTask3and4(){
for(int i=1;i<=100;i++){
square100=square100+i*i;}

for(int i =1;i<=200;i++) {
    mult200 = mult200.multiply(BigInteger.valueOf((long)i*i));


}
        System.out.println("task3= "+square100+",\n task4= "+mult200);


    }
}

package com.test.test1;

import java.util.Random;

/**
 * @program: spring_cloud_1
 * @description:
 * @author: caijun
 * @create: 2018-11-21 14:45
 **/
public class tt1 {

    public static void main(String[] args) {
        f1();
    }

    private static void f2() {

    }

    private static void f1() {

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        for(int i=0; i<1000000; i++){

            int num = new Random().nextInt(2);

            System.out.println(num);

            int dou1 = (int) (Math.random()*100);

            if(dou1 == 0){
                num1 ++;
            } else if(dou1 == 50){
                num3 ++;
            }
            else if(dou1 == 100){
                num5 ++;
            }
            else if(dou1 < 50){
                num2 ++;
            }
            else if(dou1 > 50){
                num4 ++;
            }
        }

        System.out.println("num1---->" + num1);
        System.out.println("num2---->" + num2);
        System.out.println("num3---->" + num3);
        System.out.println("num4---->" + num4);
        System.out.println("num5---->" + num5);
    }
}

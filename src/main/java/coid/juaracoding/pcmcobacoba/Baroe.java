package coid.juaracoding.pcmcobacoba;

import java.sql.SQLOutput;

public class Baroe {

    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//
//        }
        //INFINITE LOOP
        double myVal = 5 + 4 % 3 - 8 * 3 / 4;
        System.out.println(myVal);
        int intA = 5;

//        if(intA>=47 && intA<=58){
//
//        }
//        System.out.println(intA);
        System.out.println(!(intA>=47 && intA<=58));
//        System.out.println(!((1>2) || (5!=4)));//!true
//        System.out.println(!((1>2) || (5!=5)));//!true
//        System.out.println(!((1>2) ^ (5!=5)));
        System.out.println(((1>2) || (5==5)));

        // 0 - 9
        // 48 - 57
        // A - Z
        // 65 - 90
        char chU = 'Z';
        int intU = chU;
        System.out.println(intU);

        System.out.println(Integer.toBinaryString(12));
    }
}

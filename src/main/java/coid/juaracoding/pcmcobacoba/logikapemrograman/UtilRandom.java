package coid.juaracoding.pcmcobacoba.logikapemrograman;

import java.util.Random;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Mon 20:37
@Last Modified Mon 20:37
Version 1.0
*/
public class UtilRandom {

    public static void main(String[] args) {
        // 1,2,3,4,5,6,7,8,9,10
        // 7,4,1

        // gmail,yahoo,ymail,rocketmail,juaracoding
        // ymail,yahoo,juaracoding,yahoo,yahoo,gmail,juaracoding,ymail,rocketmail,gmail
        String [] strArr = {"gmail","yahoo","ymail","rocketmail","juaracoding"};
        //strArr.length() -> 5
        // 0 ,1,2,3,4
        Random rand = new Random();
//        System.out.println("Random Number  -> "+rand.nextInt(5,10));
        // 5,6,7,8,9
        for(int i=0;i<10;i++)
        {
            System.out.println("Random Number "+i+" -> "+strArr[rand.nextInt(0, strArr.length)]);
        }

    }

}

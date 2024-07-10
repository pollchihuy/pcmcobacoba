package coid.juaracoding.pcmcobacoba.objectstring;

import java.util.Scanner;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Thu 21:28
@Last Modified Thu 21:28
Version 1.0
*/
public class IOExample {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String strEnteredValue = "";
//        String strNext = "";
//        int intNext = 0;
//        System.out.print("Enter the string 1 : ");
//        strEnteredValue = sc.nextLine();
//        System.out.println("string input : " + strEnteredValue);
//        System.out.print("Enter the string 2 : ");
//        strNext = sc.nextLine();
//        System.out.println("string input "+strNext);
//        System.out.print("Enter the Number Format : ");
//        intNext = sc.nextInt();// 10 milyar

        long loX = Long.MAX_VALUE;
        byte byX = Byte.MAX_VALUE;
        int intX = (int) loX/byX;
        System.out.println(intX);
    }
}
package coid.juaracoding.pcmcobacoba.array;

import java.util.Scanner;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Fri 19:53
@Last Modified Fri 19:53
Version 1.0
*/
public class ObjArray {


    public static void main(String[] args) {
         int myArr [] = new int[6];
//        System.out.println(myArr[2]);

        double douArr [] = new double[6];
        System.out.println(douArr[0]);
        System.out.println("Panjang dari douArr -> "+douArr.length);
//        String strArr [] = new String[6];
//        System.out.println(strArr[6]);

        /**
         ID
         1
         2
         3
         4
         5
         */
        int intArr [] = new int[5];
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 4;
        intArr[3] = 3;
        intArr[4] = 5;

        for (int i = 0; i < intArr.length; i++) {
            if(i< intArr.length){
                if(intArr[i] > intArr[i+1])
                {
                    System.out.println("Sorting Gagal !");
                    break;
                }
            }
        }

        Scanner scanner = new Scanner(System.in);
        int myArray[] = {3, 6, 3, 1, 6, 3, 4, 1};

        System.out.print("Masukkan Panjang Array : ");
        int arrLength = scanner.nextInt();
        int intArr1 [] = new int[arrLength];
        for (int i = 0; i < intArr1.length; i++) {
            System.out.print("Masukkan nilai intArr index ke "+i+" : ");
            intArr1[i] = scanner.nextInt();
        }
//        intArr1[0] = scanner.nextInt();
//        intArr1[1] = scanner.nextInt();
//        intArr1[2] = scanner.nextInt();
//        intArr1[3] = scanner.nextInt();
//        intArr1[4] = scanner.nextInt();
//
        for (int i = 0; i < intArr1.length; i++) {
            System.out.println("Nilai dari intArr1 index ke "+i+" adalah -> "+intArr1[i]);
        }

//        int intLoop = 0;
        for(int x : intArr1){
            System.out.println("Nilai adalah -> "+x);
//            intLoop++;
        }

        // ini di hardcode
//        int myArray2[] = {scanner.nextInt(),
//                scanner.nextInt(),
//                scanner.nextInt(),
//                scanner.nextInt(),
//                scanner.nextInt(),
//                scanner.nextInt(),
//                scanner.nextInt(),
//                scanner.nextInt()};
//        for (int i = 0; i < myArray2.length; i++) {
//            System.out.println("Nilai dari myArray2 index ke "+i+" adalah -> "+myArray2[i]);
//        }
    }
}

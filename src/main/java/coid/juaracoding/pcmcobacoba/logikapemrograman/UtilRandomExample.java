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
public class UtilRandomExample {

    public static void main(String[] args) {
        /**
          Buatlah sebuah data email dengan format
             1. 4 s.d 15 character alphabet
             2. 1 s.d 3 digit numeric
             3. @ provider email
             4. (.)
             5. domain (co.id, com, edu , ac.id, dst)
         */

//        String[] strAlfabet = {"a","b","c","d"};
//        String[] strArrProvider = {"gmail","yahoo","ymail","rocketmail","juaracoding"};
//        String[] strDomain = {"co.id","com","edu","ac.id"};
//        999
        Random rand = new Random();
//        for (int i = 0; i < 10; i++) {
//            String strFrontChar = "";
//            int intRandFrontChar = rand.nextInt(4,16);
//            for (int j = 0; j < intRandFrontChar; j++) {
//                strFrontChar = strFrontChar+strAlfabet[rand.nextInt(0,strAlfabet.length)];
//            }
//            strFrontChar = strFrontChar + rand.nextInt(0,1000) + "@";
//            strFrontChar = strFrontChar + strArrProvider[rand.nextInt(0,strArrProvider.length)]+".";
//            strFrontChar = strFrontChar + strDomain[rand.nextInt(0,strDomain.length)];
////        System.out.println("Hasil Merangkai Data Email adalah "+strFrontChar);
//            System.out.println(strFrontChar);
//        }

//        for (int i = 0; i < 10; i++) {
//            System.out.println(rand.nextLong(100000000000000000L,999999999999999999L));
//        }

//        System.out.println(Math.round(4.499999));
//        System.out.println(Math.ceil(3.0000000000000001));
//        System.out.println(Math.floor(3.9999999999999999));
        // 80,33,45,76,13
        // Dono , Doyok
        String strFirstName = "Dono";
//        String strFirstName = "Budi";
        String strLastName = "Doyok";
        strFirstName = strFirstName.toLowerCase();
        strLastName = strLastName.toLowerCase();
        System.out.println(strFirstName.compareTo(strLastName));
        //    sBuild.setLength(0);
//    //before
//        System.out.println("\n==BEFORE==");
//        for (String num:nums)
//    {
//        bef = sBuild.append(num).append(",").toString();
//    }
//
//        System.out.print(bef.substring(0,bef.length()-1));
    }
}
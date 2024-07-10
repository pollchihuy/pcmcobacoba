package coid.juaracoding.pcmcobacoba.logikapemrograman;

import java.util.Scanner;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Mon 20:04
@Last Modified Mon 20:04
Version 1.0
*/
public class Palindrome {

    public static void main(String[] args) {
//        String strInput = "Buah";
        // B u a h
        // h a u B
//        String strInput = "Katak";
        // K a t a k
        // k a t a K
        /**
             1. Looping
             2. Operator Aritmatika --
             3. Operator Pembanding String
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kata yang ingin di validasi Palindrom : ");
        String strInput = scanner.nextLine();
//        strInput = strInput.toLowerCase();
        String strBacaDariBelakang = "";

        // tidak ada
        // dak a

        for (int i = (strInput.length()-1); i >= 0; i--) {
            strBacaDariBelakang = strBacaDariBelakang+strInput.charAt(i);
            /*
                ""+h=> h
                h+a => ha
                ha+u => hau
                hau+B => hauB
             */
        }
        //strBacaDariBelakang -> hauB.equals.Buah -> false
        // Katak -> kataK ?
        if(strInput.equalsIgnoreCase(strBacaDariBelakang))
        {
            System.out.println(strInput+" Adalah Palindrom");
        }else {
            System.out.println(strInput+" Bukan Palindrom");
        }
    }
}

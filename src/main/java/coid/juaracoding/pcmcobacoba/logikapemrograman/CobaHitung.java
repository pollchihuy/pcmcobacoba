package coid.juaracoding.pcmcobacoba.logikapemrograman;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Mon 19:24
@Last Modified Mon 19:24
Version 1.0
*/
public class CobaHitung {

    public static void main(String[] args) {
        int intPembilang = 75;
        int intPenyebut = 8;
        double douPenyebut = 8;
//        double doHasil = 75/8.0;//9.375
        double doHasil = (intPembilang/douPenyebut);//9.375
        System.out.println("Nilai douHasil adalah : "+doHasil);
        // 5 * 3 / 2
        double hitung = 5 * 3 * 0.5;
        System.out.println("Hitung : "+hitung);
        System.out.println("5"+3*0.5);// 1.5 menjadi string

        System.out.println((5%2)==0);

        String strHuruf = "o";
        if(strHuruf.equals("a") ||
                strHuruf.equals("i") ||
                strHuruf.equals("u") ||
                strHuruf.equals("e") ||
                strHuruf.equals("o")
        ){
            System.out.println("Huruf Vocal");
        }else {
            System.out.println("Huruf Konsonan");
        }
        String strCuaca = "Kemarau";
        boolean isValid = true;
        int intNominalGaji = 5000000;
        String statusRumah = "Sendiri";
        boolean isHaveRecomendation = true;

        if(intNominalGaji >10000000 &&
                statusRumah.equals("Sendiri") &&
                isHaveRecomendation
        ){
            System.out.println("Konsumen ini auto approve");
        }

        if(strHuruf.equals("b") ||
                strHuruf.equals("c") ||
                strHuruf.equals("d") ||
                strHuruf.equals("f") ||
                strHuruf.equals("g") ||
                strHuruf.equals("h") ||
                strHuruf.equals("j") ||
                strHuruf.equals("k") ||
                strHuruf.equals("k") ||
                strHuruf.equals("l") ||
                strHuruf.equals("m") ||
                strHuruf.equals("n")
        ){
            System.out.println("Huruf Konsonan");
        }else {
            System.out.println("Huruf Vocal");
        }

    }
}

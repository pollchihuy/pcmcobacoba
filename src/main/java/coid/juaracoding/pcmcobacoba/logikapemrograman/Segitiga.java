package coid.juaracoding.pcmcobacoba.logikapemrograman;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Mon 19:13
@Last Modified Mon 19:13
Version 1.0
*/
public class Segitiga {


    public static void main(String[] args) {
//        luasSegitiga(3,2);
//        luasLingkaran(4);
//        hirarki1();
//        hirarki2();
//        hirarki3();
        //function ->
        //procedure
        //
        hirarki1();

    }

    private static void luasSegitiga(int alas, int tinggi){
        double luas = alas*tinggi*0.5;
        System.out.println("Luas Segitiga adalah : " + luas);
    }

    private static void luasLingkaran(int jariJari){
        double luas = 3.14*jariJari*jariJari;
        System.out.println("Luas Lingkaran adalah : " + luas +" cm");
    }

    private static void hirarki1(){
        System.out.println("Ini Hirarki Satu");
        hirarki2();
    }

    private static void hirarki2(){
        System.out.println("Ini Hirarki Dua Revisi");
        hirarki3();
    }

    private static void hirarki3(){
        System.out.println("Ini Hirarki Tiga");
    }

}

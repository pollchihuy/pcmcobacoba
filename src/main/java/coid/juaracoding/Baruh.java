package coid.juaracoding;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Wed 22:53
@Last Modified Wed 22:53
Version 1.0
*/

import coid.juaracoding.pcmcobacoba.util.DataGenerator;

public class Baruh {

    public static void main(String[] args) {
//        int jariJari = 4;
//        double luas = 3.14*jariJari*jariJari;
//        System.out.println("Luas Lingkaran adalah : " + luas +" cm");

        DataGenerator dataGenerator = new DataGenerator();
        for (int i = 0; i < 100; i++) {
            System.out.println(dataGenerator.datakata());
        }
    }
}
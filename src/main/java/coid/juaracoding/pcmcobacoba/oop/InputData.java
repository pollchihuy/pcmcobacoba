package coid.juaracoding.pcmcobacoba.oop;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Wed 20:38
@Last Modified Wed 20:38
Version 1.0
*/
public class InputData {

    //v1
    public InputData() {
        System.out.println("Class Input Data Sudah Terbentuk tanpa parameter ");
    }//20 class
    
    
    //v2
    public InputData(String strParam) {
        /** proses pengolahan parameter */
        System.out.println("Class Input Data Sudah Terbentuk !! dengan parameter "+strParam);
    }

    public String getData(){
        return "Hue";
    }
}

package coid.juaracoding.pcmcobacoba.oop;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Tue 21:46
@Last Modified Tue 21:46
Version 1.0
*/
public class ClassParent {


    public final static double jariJari = 3.14;

    private String nama;
    public String alamat;

    public ClassParent() {
        System.out.println("Constructor Parent");
    }

    public void methodOne(){

        System.out.println("Ini Method One dari Class Parent");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void methodTwo(){
        System.out.println("Ini Method Two dari Class Parent");
    }

    public void methodHidden(){
        System.out.println("Ini Method Hidden dari Class Parent");
    }

    public void methodHiddenTwo(){
        System.out.println("Ini Method Hidden dari Class Parent");
    }
}

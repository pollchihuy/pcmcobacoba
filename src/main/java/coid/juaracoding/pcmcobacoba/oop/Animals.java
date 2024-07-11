package coid.juaracoding.pcmcobacoba.oop;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Thu 19:54
@Last Modified Thu 19:54
Version 1.0
*/
public abstract class Animals {

    private String nama;
    
    public Animals (String nama) {
        this.nama = nama;
    }
    public void setNama (String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public abstract void suara();
}

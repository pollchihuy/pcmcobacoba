package coid.juaracoding.pcmcobacoba.method2;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Tue 19:53
@Last Modified Tue 19:53
Version 1.0
*/
public class ClassTwo {

    protected int intX = 0;

    void privateMethod(){

    }
    public void publicMethod(){
        intX = 3;
        privateMethod();
    }
}

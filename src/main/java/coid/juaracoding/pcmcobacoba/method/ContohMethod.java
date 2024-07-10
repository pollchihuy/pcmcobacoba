package coid.juaracoding.pcmcobacoba.method;

import java.io.IOException;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Tue 19:31
@Last Modified Tue 19:31
Version 1.0
*/
public class ContohMethod {

    public String strContoh="";

    public static void main(String[] args) {
        //step 1
        try {
            System.out.println(denganBalikan("Kemarau"));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
            //D:file/dokumen
        }

        //step 2
    }

    public static void tanpaBalikan(){
        // ditaruhlah 100 line script disini
    }

    public static double denganBalikan(String param1)
            throws InterruptedException {//hujan
        if(param1.equals("Kemarau")){
            return 2.0;
        }
        System.out.println("Eksekusi ini");
        return 0.0;
    }
}

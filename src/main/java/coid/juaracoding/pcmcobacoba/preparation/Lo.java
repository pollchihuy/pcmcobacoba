package coid.juaracoding.pcmcobacoba.preparation;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Tue 18:58
@Last Modified Wed 18:58
Version 1.0
*/
public class Lo {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Class dibuat pada "+ sdf.format(new Date()));
        System.out.println(System.getProperty("user.dir"));
    }

}
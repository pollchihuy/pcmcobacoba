package coid.juaracoding.pcmcobacoba.oop;

import java.util.ArrayList;
import java.util.List;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Wed 20:37
@Last Modified Wed 20:37
Version 1.0
*/
public class Panggil {

    public static void main(String[] args) {
//        InputData inputData = new InputData();
//        inputData.getData();
//
//        String strX = "Welcome";
//        System.out.println(strX.substring(2,5));

        Config config = new Config(args[2],args[0],args[1]);
//        config.setBrowser("Chrome");
//        config.setHostApps("https://www.viu.com/");
//        config.setPathDownload("D://user//download");
//        config.setBrowser(args[0]);
//        config.setPathDownload(args[1]);
//        config.setHostApps(args[2]);

        System.out.println("Menggunakan Browser : "+config.getBrowser());
        System.out.println("URL "+config.getHostApps());
        System.out.println("Path Folder : "+config.getPathDownload());

//        config.setPathDownload("D://download//aja");
//        config.setBrowser("Firefox");
//        config.setHostApps("https://gak-aman.com");

        System.out.println();
        System.out.println();
        System.out.println("Menggunakan Browser : "+config.getBrowser());
        System.out.println("URL "+config.getHostApps());
        System.out.println("Path Folder : "+config.getPathDownload());

        String strX = "";
        strX.substring(3);
        strX.substring(2,4);
        //WElcome

        List lt = new ArrayList<>();

        Iface iface = new IfaceImpl();
        iface.ambilData();
        iface.sisipkanData();

        IfaceImpl iface1 = new IfaceImpl();
        iface1.ambilData();
        iface1.sisipkanData();
        iface1.deleteData();
        iface1.modifikasiData();


    }
}
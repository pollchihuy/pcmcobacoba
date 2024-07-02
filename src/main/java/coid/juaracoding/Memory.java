package coid.juaracoding;

import coid.juaracoding.pcmcobacoba.model.User;
import coid.juaracoding.pcmcobacoba.util.DataGenerator;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.ArrayList;
import java.util.List;

public class Memory {

    public static void main(String[] args) {
        /**
         *  CARA PRINT PROCESS ID DI METHOD MAIN
         */
        RuntimeMXBean runtime = ManagementFactory.getRuntimeMXBean();
        long pid = runtime.getPid();
        System.out.println("Process ID : " + pid);
        try {
            Thread.sleep(40000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        DataGenerator d = new DataGenerator();
        List<User> l = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            User u = new User();
            u.setAlamat(d.dataAlamat());
            u.setEmail(d.dataEmail());
            u.setNoHP(d.dataNoHp());
            u.setProvinsi(d.dataKodePos());
            u.setUsername(d.dataUsername());
            l.add(u);
        }

        System.out.println("ALAMAT\tEMAIL\tNOHP\tPROVINSI\tUSERNAME");
        for (int i = 0; i < l.size(); i++) {
            System.out.print("-----");
            System.out.print("Data Alamat : "+l.get(i).getAlamat());
            System.out.print("-----");
            System.out.print("Data Email : "+l.get(i).getEmail());
            System.out.print("-----");
            System.out.print("Data No Hp : "+l.get(i).getNoHP());
            System.out.print("-----");
            System.out.print("Data Provinsi : "+l.get(i).getProvinsi());
            System.out.print("-----");
            System.out.print("Data Username : "+l.get(i).getUsername());
            System.out.print("-----");
            System.out.println();
        }

//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

//        l.clear();

        for (int i = 0; i < 100000; i++) {
            User u = new User();
            u.setAlamat(d.dataAlamat());
            u.setEmail(d.dataEmail());
            u.setNoHP(d.dataNoHp());
            u.setProvinsi(d.dataKodePos());
            u.setUsername(d.dataUsername());
            l.add(u);
        }

        System.out.println("ALAMAT\tEMAIL\tNOHP\tPROVINSI\tUSERNAME");
        for (int i = 0; i < l.size(); i++) {
            System.out.print("-----");
            System.out.print("Data Alamat : "+l.get(i).getAlamat());
            System.out.print("-----");
            System.out.print("Data Email : "+l.get(i).getEmail());
            System.out.print("-----");
            System.out.print("Data No Hp : "+l.get(i).getNoHP());
            System.out.print("-----");
            System.out.print("Data Provinsi : "+l.get(i).getProvinsi());
            System.out.print("-----");
            System.out.print("Data Username : "+l.get(i).getUsername());
            System.out.print("-----");
            System.out.println();
        }

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
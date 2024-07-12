package coid.juaracoding;

import java.util.Scanner;

public class CobaZ {

    CobaP cobaP = new CobaP();

    public CobaP getCobaP(int y){
        cobaP.setIntX(y);
        return cobaP;
    }

    public static void main(String[] args) {
//while(variable)

        try {
            int intX = 1/0;
        }catch (Exception e){
            System.out.println(e.getMessage());
            // send email ....
            System.exit(0);
        }
        System.out.println("Masuk sini");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input Untuk Hari ===weekday=== \n 1 = Senin\n 2 = Selasa \n 3 = Rabu \n ===weekend=== 4 = Jumat \n 5 = Sabtu  \n 6 = minggu");
//        System.out.print("Masukkan Hari : ");
//        int intHari = scanner.nextInt();
//        if(intHari >8 && intHari<0){
//            System.out.println("Nilai Yang anda masukkan Salah !!");
////            variabel =
//        }
    }
}
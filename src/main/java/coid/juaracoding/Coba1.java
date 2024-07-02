package coid.juaracoding;

import java.util.ArrayList;
import java.util.List;

public class Coba1 {

    // untuk informasi nama customer
    /**
     *
     */
    private String strNama ;

    // ini adalah fungsi untuk bla blabalbla
    public static void main(String[] args) {
        int intX = Integer.parseInt(args[0]);//4
        int intY = 11+intX;int intZ ; // ini DEKLARASI VARIABEL

        intZ = 10; // ini INISIALISASI VARIABEL

        int intA = 10; // ini DEKLARASI + INISIALISASI VARIABLE

        int intB = 7*4;


        /**
            Perkalian -> *
            Pembagian -> /
            Pengurangan -> -
            Penjumlahan -> + ( penyambung kata variable String)
            Modulus     -> %

         adi+guna
         adiguna
         */


        // dev.ptkimia.com/dev1
        // dev.ptkimia.com/dev3
        // global parameter

        System.out.println("Nilai int Y : "+intY);
//        var varX = 4.9;

        // signed -> ada minus sampai dengan plus 256 -> -128 s.d 127
        // unsigned -> full nilainya ke plus -> 256 ->


//        char chX = 'a';
//        int intC = Integer.parseInt("ABC");
//        System.out.println("Nilai char chX adalah : "+chX);
//        System.out.println("Nilai int C adalah : "+intC);
        // input nomor maksimal 128
        // Exception in thread "main" java.lang.NumberFormatException: For input string: "ABC"

        char chInput = 53;
        System.out.println("Nilai ch input adalah "+chInput);
        int intInput = chInput;

        System.out.println("PAUL'");
//        ^$\+
        int intJumlah;
        double doJumlah;
        float floJumlah;
        String  strJumlah;
        byte bytJumlah;
        short shoJumlah;
        String strTotal;

        boolean isValid = true;
        System.out.println("PAUL DOANK");
        // PAUL'
        if(intInput>=48 && intInput<=57){//masukkan nomor
            System.out.println(chInput+" Adalah Nomor");
        }else {
            System.out.println(chInput+" Adalah Huruf ");
        }

        short shoX = 30000;
        int intSho = shoX;
        System.out.println("Nilai intSho -> "+intSho);

        long cobaLong = 9223372036854775000L;
        int cobaInt = (int) cobaLong;
        System.out.println("Nilai cobaInt -> "+cobaInt);//-808
        //2147483647

        System.out.println(cobaLong%2147483647);

        int intHarga = 10000;
        int intQty = 8;
        int intTotal = intHarga * intQty;

        int intG  = 10;
        System.out.println("intG -> "+intG);//10
        int intJ = intG;//10
        System.out.println("intJ -> "+intJ);//10
        intG = 30;//30
        System.out.println("nilai intG selanjutnya adalah "+intG);
        System.out.println("nilai intJ adalah "+intJ);//kalian tebak intJ adalah 30
        // berapa nilai intG?

//        Cobaan cobaan = new Cobaan();//10
//        System.out.println("nilai cobaan saat ini "+cobaan);
//
//        Cobaan cobaan1 = cobaan;//10
//        System.out.println("nilai cobaan1 saat ini "+cobaan1);
//
//        cobaan1 = new Cobaan();//40
//        System.out.println("nilai cobaan saat ini "+cobaan);//40
//        System.out.println("nilai cobaan1 saat ini "+cobaan1);//10
//        berapa nilai cobaan1 saat ini ?

//        List l = new ArrayList();
//        l.add("a");
//        System.out.println("Nilai l => "+l.get(0));
//        List x = l;
//        System.out.println("Nilai x => "+x.get(0));
//        l  = new ArrayList();
//        l.add("b");
//        System.out.println("Nilai l => "+l.get(0));//b
//        System.out.println("Nilai x => "+x.get(0));//b
//
//        System.out.println();

        List l = new ArrayList();
        l.add("isi1");
        l.add("isi1");
        l.add("isi1");
        l.add("isi1");
        l.add("isi1");
        l.add("isi1");
        l.add("isi1");
        l.add("isi1");
        l.add("isi1");
        l.add("isi1");
        l.add("isi1");
        l.add("isi1");
        l.add("isi1");
        l.add("isi1");
        l.add("isi1");
        l.add("isi1");
        l.add("isi1");
        l.add("isi1");
        l.add("isi1");
        l.add("isi1");
        l.add("isi1");
        l.add("isi1");
        l.add("isi1");
        l.add("isi1");
        l.add("isi1");
        l.add("isi1");
        l.add("isi1");
        l.add("isi1");
        l.add("isi1");
        l.add("isi1");
        l.add("isi1");// 1 GB

        l.clear();

        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");
        l.add("isi2");//1GB
    }
}
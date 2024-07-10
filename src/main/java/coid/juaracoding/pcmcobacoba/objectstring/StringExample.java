package coid.juaracoding.pcmcobacoba.objectstring;

import coid.juaracoding.Coba1;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Thu 19:05
@Last Modified Thu 19:05
Version 1.0
*/
public class StringExample {

    public static void main(String[] args) {
        //P a u L
        //Paul
        Coba1 coba1 = new Coba1();
        Coba1 coba2 = new Coba1();
        System.out.println("Value dari coba1 adalah "+coba1);//214c265e
        System.out.println("Value dari coba1 adalah "+coba2);//448139f0
        coba2 = new Coba1();
        System.out.println("Value dari coba1 adalah "+coba2);//448139f0

        int intX = 0;
        double douX = 0;
        String strPrint = "Saya adalah seorang QA";

        System.out.println("Value dari strPrint adalah : "+strPrint);
        System.out.println(2);
        System.out.println(2.0);
        System.out.println(true);

        String strName = "isiString";

        char chArr [] = {'i','s','i'};

        String strOne = "ABCDE";
        String strTwo = "fghij";// + concat append
        System.out.println("Concat StrOne dan StrTwo : "+strOne.concat(strTwo));
        String strAppend = new StringBuilder().append("abcdef").append("defghi").
                append("abcdef").append("defghi").append("abcdef").append("defghi").
                append("abcdef").append("defghi").append("abcdef").append("defghi").
                append("abcdef").append("defghi").append("abcdef").append("defghi").
                append("abcdef").append("defghi").append("abcdef").append("defghi").
                append("abcdef").append("defghi").append("abcdef").append("defghi").
                append("abcdef").append("defghi").append("abcdef").append("defghi").
                append("abcdef").append("defghi").append("abcdef").append("defghi").
                append("abcdef").append("defghi").toString();



        String strCheckNoBPJS = "231654987321321";

        boolean isValidTest = strCheckNoBPJS.length()==16;//false
        boolean isValidReturn = true;//dari web true
        System.out.println(true);// isFalse -- error

        // "NAMA LENGKAP MIN 8 MAKS 40 KARAKTER!!"
        // "NAMA LENGKAP MIN 8 MAKS 40 KARAKTER!!         "

        // aplikasi testing -> SQA
        // aplikasi yang di test -> Web Dev


        System.out.println(strCheckNoBPJS.length()==16);// functional tester
        System.out.println("Length noBPJS : "+strCheckNoBPJS.length());// return dari aplikasi


        // info-1 + info-2




//        String strIsi = "isiString";
//        System.out.println("strIsi Index ke 3 : "+strIsi.charAt(3));
//        int intTotal = 0;
//        for (int i = 0; i < strIsi.length(); i++) {
//            char chCh = strIsi.charAt(i);
//            int intCh = chCh;// menjadi ascii code
//            if(intCh>=48 && intCh<=57) {
//                intTotal = intTotal + 1;
////                intTotal++;
//            }
//        }
//        System.out.println("Total character numeric dalam kalimat ada : "+intTotal);
//        System.out.println("heoiruhqwer8091u798273ijiewurhy7346hkjheljrkhew9832y49lkj123");

//        String strHue = "Tuing";
//        String strHue1 = "Tuing";
//        System.out.println("Compare strHue dan strHue1 : "+(strHue == strHue1));

        String namaFirst  = new String("Dono");
        String namaSecond = new String("dono");
//        System.out.println("Print namaFirst : "+namaFirst);
//        System.out.println("Print namaSecond : "+namaSecond);
        System.out.println("NamaFirst compare namaSecond "+(namaFirst.equalsIgnoreCase(namaSecond)));
//        System.out.println("Kami pemuda pemudi Indonesia berjanji bertumpah".
//                contains("Indonesia"));
//        char ch0 = 'i';
//        System.out.println("Nilai ch0 adalah : "+(int)ch0);

        "Paul.christian@gmail.com".equalsIgnoreCase("paul.christian@gmail.com");
        String strSubString = "ujhjwiueh872ty3867t578t8267t313";
        System.out.println("Hasil dari substring adalah : "+strSubString.substring(4,9));
        System.out.println("Hasil dari substring 1 parameter adalah : "+strSubString.substring(4));
//        char ch1 = 's';
//        char ch2 = 'i';
//        char ch3 = 'S';
//        char ch4 = 't';

    }
}

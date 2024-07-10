package coid.juaracoding.pcmcobacoba.percabangan;

public class IfElseExample {


    public static void main(String[] args) {
        int intNum = 2;
        int intX = 0;

        // KAPAN DI GUNAKAN IF , IF ELSE , IF ELSE IF?
        if(intNum>2){
            intX = 10 * intNum + 2;
            System.out.println(intX);
        }
        if(intNum>2){
            intX = 10 * intNum + 2;
            System.out.println(intX);
        }
        if(intNum>2){
            intX = 10 * intNum + 2;
            System.out.println(intX);
        }
        if(intNum>2){
            intX = 10 * intNum + 2;
            System.out.println(intX);
        }

        double gaji = 5000000.0;
        String strStatusRumah = "Tetap";
        int jumlahTanggungan = 0;


        if(gaji>3000000){
            intX = 10 * intNum + 2;
            System.out.println(intX);
        }else if(strStatusRumah.equals("Tetap")) {
            System.out.println("Ini Else");
        }else if(jumlahTanggungan==0) {
            System.out.println("Ini Else");
        }


        if(intNum>2){
            intX = 10 * intNum + 2;
            System.out.println(intX);
        }else if(intNum >3) {
            System.out.println("Ini Else");
        }else if(intNum >3) {
            System.out.println("Ini Else");
        }else {
            System.out.println("Ini Else");
        }

        int x = 20;
        if(x%2 == 0 ){
            if(x/100 !=0){
                System.out.println(x+" Genap lebih dari seratus");
            }
        } else {
            if (x / 10 != 0) {
                System.out.println(x + " Genap Lebih dari sepuluh");
            }
        }


        int intMyVal = 100;
        boolean isReminderOn = true;
        if(intMyVal > 50 && isReminderOn==true){
            if(isReminderOn==true){
                System.out.println("Hue");
            }
        }

        String strHari = "Sabtu";
        if(strHari.equals("Senin")){
            System.out.println("Ini hari Senin");
        } else if(strHari.equals("Selasa")){
            System.out.println("Ini hari Selasa");
        } else if(strHari.equals("Rabu")){
            System.out.println("Ini hari Rabu");
        }else {
            System.out.println("Mungkin kami atau jumat atau sabtu atau minggu");
        }

        String strHurufVokal = "z";

        if(strHurufVokal.equals("a") ||
            strHurufVokal.equals("i") ||
                strHurufVokal.equals("u") ||
                strHurufVokal.equals("e") ||
                strHurufVokal.equals("o")
        ){

        }else {

        }
        String strTambah = "Tambah";
        switch (strHari){
            case "Senin":
                System.out.println("Ini hari Senin");break;
            case "Selasa":
                System.out.println("Ini hari Selasa");break;
            case "Rabu":
                System.out.println("Ini hari Rabu");break;
            default:
                System.out.println("Ini hari Senin");break;
        }

        String strBrowser = "Chrome";
        switch (strBrowser){
            case "Chrome":
                System.out.println("Ini hari Senin");break;
            case "Firefox":
                System.out.println("Ini hari Selasa");break;
            case "Edge":
                System.out.println("Ini hari Rabu");break;
            case "Opera":
                System.out.println("Ini hari Rabu");break;
            case "Safari":
                System.out.println("Ini hari Rabu");break;
            default:
                System.out.println("Ini hari Senin");break;
        }
        if(strBrowser.equals("Chrome")){

        }else if(strBrowser.equals("Safari")) {

        }else if(strBrowser.equals("Edge")){

        }else if(strBrowser.equals("Firefox")){
            
        }


        int intNilai = 75;

//        String output = (intNilai > 75) ? "Selamat Anda Lulus " : "Anda Tidak Lulus";
        String output = (intNilai > 75) ? "Selamat Anda Lulus " : "Anda Tidak Lulus";
        System.out.println(output);

        if(intNilai > 75) {
            System.out.println("Selamat Anda Lulus ");
        } else {
            System.out.println("Anda Tidak Lulus");
        }


        for (int i = 0; 
             i < 5;
             i++) {
            System.out.print("Nilai i : "+i);

            for (int j = 0; j < 3; j++) {
                
                System.out.print("Nilai j : "+j);
                if(j==0){
                    break;
                }
                for (int k = 0; k < 2; k++) {
                    System.out.print("Nilai k : "+k);
                }
            }
        }
        
        for (int i = 0; i < 50; i++) {
            
        }
        //    sBuild.setLength(0);
//    //before
//        System.out.println("\n==BEFORE==");
//        for (String num:nums)
//    {
//        bef = sBuild.append(num).append(",").toString();
//    }
//
//        System.out.print(bef.substring(0,bef.length()-1));
        
    }
}

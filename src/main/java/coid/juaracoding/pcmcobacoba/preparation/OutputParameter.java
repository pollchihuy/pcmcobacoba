package coid.juaracoding.pcmcobacoba.preparation;

public class OutputParameter {

    public static void main(String[] args) {
//        System.out.println("ARGS index ke 0 -> "+args[0]);
//        System.out.println("ARGS index ke 1 -> "+args[1]);
//        System.out.println("ARGS index ke 2 -> "+args[2]);
        String strAlamatServer = "https://dev.juaracoding.com";//HARDCODE
//        String strAlamatServer = args[0];

//        try {
//            Thread.sleep(20000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        String strBrowser = "SAFARI";
//        String strBrowser = args[1];
        String strPathFileImage = "/usr/local/bin";
//        String strPathFileImage = args[2];
        System.out.println("Value browser : "+strBrowser);
        System.out.println("Value Alamat Server : "+strAlamatServer);
        System.out.println("Value Path Image : "+strPathFileImage);

    }
}

package coid.juaracoding;

public class ApaKek {

    public static void main(String[] args) {
        Cobaan cobaan = new Cobaan();//10
        System.out.println("nilai cobaan saat ini "+cobaan);

        Cobaan cobaan1 = cobaan;//10
        System.out.println("nilai cobaan1 saat ini "+cobaan1);

        cobaan = new Cobaan();//40
        System.out.println("nilai cobaan saat ini "+cobaan);//40
        System.out.println("nilai cobaan1 saat ini "+cobaan1);//10
        /*
            nilai cobaan saat ini Cobaan@f6f4d33
            nilai cobaan1 saat ini Cobaan@f6f4d33
            nilai cobaan saat ini Cobaan@f6f4d33
            nilai cobaan1 saat ini Cobaan@23fc625e
         */
    }
}

package coid.juaracoding;

public class CobaX {


    public static void main(String[] args) {
        CobaZ cobaZ = new CobaZ();
        CobaP cobaP = cobaZ.getCobaP(5);
        CobaP cobax = cobaP;
        CobaP cobazz = cobax;
        CobaP cobaM = cobazz;
        System.out.println("Reference cobaP -> "+cobaP);
        System.out.println("Reference cobaX -> "+cobax);
        System.out.println("Reference cobazz -> "+cobazz);
        System.out.println("Reference cobaM -> "+cobaM);

        System.out.println(cobaP.getIntX());//5
        System.out.println(cobax.getIntX());//5
        System.out.println(cobazz.getIntX());//5
        System.out.println(cobaM.getIntX());//5

        cobax.setIntX(7);
        System.out.println("Reference cobaP -> "+cobaP);
        System.out.println("Reference cobaX -> "+cobax);
        System.out.println(cobaP.getIntX());//7
        System.out.println(cobax.getIntX());//5
        System.out.println(cobazz.getIntX());//5
        System.out.println(cobaM.getIntX());//5
    }
}
package coid.juaracoding.pcmcobacoba.oop;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Thu 19:57
@Last Modified Thu 19:57
Version 1.0
*/
public class AnimalsImpl {

    public static void main(String[] args) {
        Animals animals = new Animals("Kucing Buntut Keinjek") {
            @Override
            public void suara() {
                System.out.println("Meong Meong Meong !!!");
            }
        };

        animals.suara();

        Animals animals1 = new Animals("Kucing Tidur") {
            @Override
            public void suara() {
                System.out.println("Meong .... ZZZZZZZZZZZZZZZZZZZZ");
            }
        };
        animals1.suara();
    }
}

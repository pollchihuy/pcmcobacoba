package coid.juaracoding.pcmcobacoba;

import coid.juaracoding.pcmcobacoba.testing.OperatorAritmatika;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Thu 20:48
@Last Modified Thu 20:48
Version 1.0
*/
public class TestOperatorAritmatika {

    private OperatorAritmatika operatorAritmatika;
    @BeforeTest
    public void prepare(){
        operatorAritmatika = new OperatorAritmatika();
    }

    @Test
    public void testTambah(){
        double proses = operatorAritmatika.tambah(1,1);
        Assert.assertEquals(2,proses);
    }

    @Test
    public void testKurang(){
        double proses = operatorAritmatika.kurang(10,1);
        Assert.assertEquals(9,proses);
    }

    @Test
    public void testBagi(){
        //1000
        double proses = operatorAritmatika.bagi(12,3);
        Assert.assertEquals(5,proses);
    }

    @Test
    public void testKali(){
        double proses = operatorAritmatika.kali(2,4);
        Assert.assertEquals(8,proses);
    }
    @Test
    public void testModulus(){
        double proses = operatorAritmatika.modulus(20,4);
        Assert.assertEquals(0,proses);
    }
}

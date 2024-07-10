package coid.juaracoding.pcmcobacoba.oop;

import coid.juaracoding.pcmcobacoba.page.HomePage;
import coid.juaracoding.pcmcobacoba.page.web.LoginPage;
import coid.juaracoding.pcmcobacoba.util.DataGenerator;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Wed 20:20
@Last Modified Wed 20:20
Version 1.0
*/
public class LoginPositif {

    public static void main(String[] args) {
        DataGenerator dataGenerator = new DataGenerator();
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();
        loginPage.inputTextUsername(dataGenerator.dataUsername());
    }
}

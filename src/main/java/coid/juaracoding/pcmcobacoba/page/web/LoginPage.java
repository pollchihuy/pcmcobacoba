package coid.juaracoding.pcmcobacoba.page.web;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Wed 20:00
@Last Modified Wed 20:00
Version 1.0
*/
public class LoginPage {

    private String labelSignIn;
    private String labelUsername;
    private String textUsername;
    private String labelPassword;
    private String textFieldPasword;
    private String btnSignIn;
    private String btnRegis;
    private String btnForgotPwd;
    private String btnHome;
    private String layoutLogin;
    private String msgError;

    public String getValueLabelSignIn(){
        return labelSignIn;
    }

    public void inputTextUsername(String inputUsername){
        textUsername = inputUsername;
    }
    public String getValTextUsername(){
        return textUsername;
    }


}
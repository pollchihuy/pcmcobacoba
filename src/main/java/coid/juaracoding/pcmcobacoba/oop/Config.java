package coid.juaracoding.pcmcobacoba.oop;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Wed 20:58
@Last Modified Wed 20:58
Version 1.0
*/
public class Config {

    //https://www.viu.com/
    private String hostApps;

    //Chrome, Safari, firefox, Edge
    private String browser;

    // windows D://user//download
    // Linux /user/var/lbx
    private String pathDownload;

    public Config(String hostApps, String browser, String pathDownload) {
        this.hostApps = hostApps;
        this.browser = browser;
        this.pathDownload = pathDownload;
    }

    public String getHostApps() {
        return hostApps;
    }

//    public void setHostApps(String hostApps) {
//        this.hostApps = hostApps;
//    }

    public String getBrowser() {
        return browser;
    }

//    public void setBrowser(String browser) {
//        this.browser = browser;
//    }

    public String getPathDownload() {
        return pathDownload;
    }

//    public void setPathDownload(String pathDownload) {
//        this.pathDownload = pathDownload;
//    }
}

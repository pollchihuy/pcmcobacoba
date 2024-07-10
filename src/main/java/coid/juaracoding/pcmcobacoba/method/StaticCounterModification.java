package coid.juaracoding.pcmcobacoba.method;

public class StaticCounterModification {
	
	public static int count = 0;//10
    //@uiX789
    /*
        USER 1 -> 25 -> 26
        USER 2 -> 18 -> 26
        USER 3 -> 23 -> 26
     */
	int a=0;
	
	StaticCounterModification()
	{
        count ++;
        
    }
    public void getCount()
    {
        System.out.println(count+",");
    }
    
    public static void main( String args[] ) throws InterruptedException
    {
    	int k;
        StaticCounterModification c1 = new StaticCounterModification(); //count incremented to 1
        System.out.println("Referensi C1 : "+c1);
        c1.getCount();
        StaticCounterModification c2 = new StaticCounterModification(); //count incremented to 2
        System.out.println("Referensi C2 : "+c2);
        c2.getCount();
        StaticCounterModification c3 = new StaticCounterModification(); //count incremented to 3
        System.out.println("Referensi C3 : "+c3);
        c3.getCount();
//        c1.start();
//        Thread.sleep(2000);
//        X xX = new X();
//        xX.start();
//        xX.putMethod();
//        c1.sleep(5000);
//        System.out.println("Hmmm");

    }
    
//    static class X extends Thread {
//
//    	public void putMethod() throws InterruptedException {
//    		for(int i=0;i<5;i++)
//    		{
//    			Thread.sleep(1000);
//    			StaticCounterModification c4 = new StaticCounterModification();
//                c4.getCount();
//    		}
//    	}
//    }
}
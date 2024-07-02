package coid.juaracoding.pcmcobacoba.preparation;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

public class TestMemory {
    private static boolean isStop = true;
    /** login sebagai administrator pada cmd windows */
    //java -XX:+PrintFlagsFinal -version | findstr HeapSize
    //java -XX:+PrintFlagsFinal -version | findstr /i “HeapSize PermSize ThreadStackSize”


    /** akses su pada linux */
//    java -XX:+PrintFlagsFinal -version | grep HeapSize
//    java -XX:+PrintFlagsFinal -version | grep -iE ‘HeapSize|PermSize|ThreadStackSize’


    /** setting di arguments*/
	//-verbose:gc -XX:+PrintGCDetails -Xloggc:D:/aa/gc.log
	
    //Creating static variable j with default value  0
    static int j = 0;
    
    public static void main(String[] args) {
        final RuntimeMXBean runtime = ManagementFactory.getRuntimeMXBean();
        final long pid = runtime.getPid();
        System.out.println("PID "+pid);
    	try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

        if(isStop && j==27){
            System.out.println("Maximum Heap Size: " + returnSize(Runtime.getRuntime().maxMemory()));
            System.out.println("Used Memory   :  " + returnSize(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));
            System.out.println("Free Memory   : " + returnSize(Runtime.getRuntime().freeMemory()) );
            System.out.println("Total Memory  : " + returnSize(Runtime.getRuntime().totalMemory()));
            System.out.println("Max Memory    : " + returnSize(Runtime.getRuntime().maxMemory()));
            isStop = false;
        }
    	//set this to manage process memory used
        if (j < 28) {
            j++;    //increment j
            System.out.println(j);  //print j  
            main(new String[] { (args[0] + args[0]).intern() });
        }
//        try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
    }

    private static String returnSize(double maxHeapSize){
        String sizeInReadableForm;
        double kbSize = maxHeapSize / 1024;
        double mbSize = kbSize / 1024;
        double gbSize = mbSize / 1024;

        if (gbSize > 1) {
            sizeInReadableForm = gbSize + " GB";
        } else if (mbSize > 1) {
            sizeInReadableForm = mbSize + " MB";
        } else {
            sizeInReadableForm = kbSize + " KB";
        }
        return sizeInReadableForm;
    }
}
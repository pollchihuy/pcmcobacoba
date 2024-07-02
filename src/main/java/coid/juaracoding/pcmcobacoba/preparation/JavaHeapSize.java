package coid.juaracoding.pcmcobacoba.preparation;

public class JavaHeapSize {

	public static void main(String[] args) {

        double maxHeapSize = Runtime.getRuntime().maxMemory();
        System.out.println("Used Memory   :  " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) + " bytes");
        System.out.println("Free Memory   : " + Runtime.getRuntime().freeMemory() + " bytes");
        System.out.println("Total Memory  : " + Runtime.getRuntime().totalMemory() + " bytes");
        System.out.println("Max Memory    : " + Runtime.getRuntime().maxMemory() + " bytes");
        System.out.println(maxHeapSize);
        String sizeInReadableForm;

        double kbSize = maxHeapSize / 1024;
        double mbSize = kbSize / 1024;
        double gbSize = mbSize / 1024;

        if (gbSize > 0) {
            sizeInReadableForm = gbSize + " GB";
        } else if (mbSize > 0) {
            sizeInReadableForm = mbSize + " MB";
        } else {
            sizeInReadableForm = kbSize + " KB";
        }

        System.out.println("Maximum Heap Size: " + sizeInReadableForm);
    }
}
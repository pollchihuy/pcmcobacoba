package coid.juaracoding.pcmcobacoba.preparation;

public class JavaHeapSizeModif {

	public static void main(String[] args) {
        System.out.println("Maximum Heap Size: " + returnSize(Runtime.getRuntime().maxMemory()));
        System.out.println("Used Memory   :  " + returnSize(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));
        System.out.println("Free Memory   : " + returnSize(Runtime.getRuntime().freeMemory()) );
        System.out.println("Total Memory  : " + returnSize(Runtime.getRuntime().totalMemory()));
        System.out.println("Max Memory    : " + returnSize(Runtime.getRuntime().maxMemory()));
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
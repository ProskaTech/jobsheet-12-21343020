// Budi Prasetyo 21343020
package PolymorphismeDynamic;

public class polymorphismDynamic {
    public static void main(String[] args) {
        Bank B;
        B = new BRI();
        System.out.println("Tingkat Suku Bunga BRI Adalah : "+ B.sukuBunga());
        B = new BNI();
        System.out.println("Tingkat Suku Bunga BNI Adalah : "+ B.sukuBunga());
        B = new Mandiri();
        System.out.println("Tingkat Suku Bunga Mandiri Adalah : "+ B.sukuBunga());      
    }    
}
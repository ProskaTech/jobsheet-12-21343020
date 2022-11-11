// Budi Prasetyo 21343020
package Encapsulation;

public class BuahUtama {
    public static void main(String[] args) {
        EncapsulationBuah Apel = new EncapsulationBuah("Apel", "Rp.3000", "Merah");
        System.out.println("Nama Buah : "+ Apel.getname()+"\nHarga : "+Apel.getPrice()+"\nWarna : "+Apel.getColor());
        
        Apel.setcolor("Hijau");
        Apel.setPrice("Rp.7000");
        System.out.println("\nInformasi Terkait Apel Setelah di Update");
        System.out.println("Nama Buah : "+ Apel.getname()+"\nHarga : "+Apel.getPrice()+"\nWarna : "+ Apel.getColor());
    }
}
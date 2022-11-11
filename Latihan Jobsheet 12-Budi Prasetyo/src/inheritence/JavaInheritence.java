// Budi Prasetyo 21343020
package inheritence;

public class JavaInheritence {
    public static void main(String[] args) {
        RodaDua sepeda = new RodaDua();
        RodaEmpat mobil = new RodaEmpat();
        
        sepeda.tampilkanHarga();
        sepeda.hargaAkhir();
        
        mobil.tampilkanHarga();
        mobil.hargaAkhir();
    }
}

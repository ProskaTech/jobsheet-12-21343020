// Budi Prasetyo 21343020
package inheritence;

public class RodaEmpat extends Kendaraan {
    double NaikHargaKe = 8;
    void hargaAkhir(){
        hargaDasar = hargaDasar + (hargaDasar + NaikHargaKe);
        System.out.println("Setelah di Modifikasi, Harga Mobil Menjadi Rp."+ hargaDasar);
    }
}
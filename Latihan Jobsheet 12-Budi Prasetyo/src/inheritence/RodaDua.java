// Budi Prasetyo 21343020
package inheritence;

class RodaDua extends Kendaraan {
    double NaikHargaKe = 0.20;
    void hargaAkhir(){
        hargaDasar = hargaDasar + (hargaDasar + NaikHargaKe);
        System.out.println("Setelah di Modifikasi, Harga Sepeda Menjadi Rp."+ hargaDasar);
    }   
}
package Soal_No_7;

public class PesananFood {
    private String idPesanan;
    private String namaMenu;
    private double totalHarga;

    public PesananFood(String idPesanan, String namaMenu) {
        this.idPesanan = idPesanan;
        this.namaMenu = namaMenu;
        this.totalHarga = 0;
    }

    public void hitungTotal(double harga, int jumlah) {
        if (harga > 0 && jumlah > 0) {
            this.totalHarga = harga * jumlah;
        }
    }

    public double getTotalHarga() {
        return totalHarga;
    }
}
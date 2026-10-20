package Soal_No_10;

class Driver {
    String nama = "Budi";
}

class PesananFood {
    private double totalHarga = 50000;
    Driver driver;   // ASOSIASI

    void tampilkan() {
        System.out.println("Total: Rp" + totalHarga + " | Driver: " + driver.nama);
    }
}

public class Main {
    public static void main(String[] args) {
        PesananFood p = new PesananFood();
        p.driver = new Driver();   // hubungkan Pesanan dengan Driver
        p.tampilkan();
    }
}
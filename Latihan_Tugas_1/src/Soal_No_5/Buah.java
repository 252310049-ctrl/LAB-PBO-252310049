package Soal_No_5;

class Buah {
    void rasa() { System.out.println("Buah punya rasa"); }
}

class Apel extends Buah {
    // Overloading: nama sama, parameter beda
    void hitung(int jumlah) {
        System.out.println("Jumlah apel: " + jumlah);
    }
    void hitung(int jumlah, int harga) {
        System.out.println("Total harga: " + (jumlah * harga));
    }

    // Overriding: menulis ulang rasa() milik Buah
    @Override
    void rasa() { System.out.println("Apel manis"); }
}

public class Latihan5 {
    public static void main(String[] args) {
        Apel a = new Apel();
        a.hitung(3);
        a.hitung(3, 5000);
        a.rasa();
    }
}
package Soal_No_3;

public class Buah {
    void tumbuh() {
        System.out.println("Buah tumbuh");
    }
}

class Apel extends Buah {
    void berwarnaMerah() {
        System.out.println("Apel berwarna merah");
    }

    public static void main(String[] args) {
        Apel a = new Apel();
        a.tumbuh();         // diwarisi dari Buah
        a.berwarnaMerah();  // milik Apel sendiri
    }
}
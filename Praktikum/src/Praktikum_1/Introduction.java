package Praktikum_1;

public class Introduction {
    public static void main(String[] args) {
        System.out.println("Hello Word");

        // Variabel
        int angka1 = 10;
        int angka2 = 20;

        String nama = "Ibnu";

        // Operator
        int hasilTambah = angka1 + angka2;
        hasilTambah++; // Increment

        // Operator perbandingan
        boolean pembanding = angka1 > angka2;
        boolean tesNama = nama == "Ibnu";

        // Operator kondisional
        boolean kondisional = (true || false) && (true && true);

        // Operator assignment
        angka1 *= angka2; // angka1 dikali angka2
                          // hasilnya disimpan di angka1

        // Object Dog
        Dog mydog = new Dog();
        mydog.hungry();

        String name = "Reza";
        mydog.puppyName(name);
    }
}
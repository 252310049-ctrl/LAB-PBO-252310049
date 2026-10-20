package Soal_No_4;

class Buah {
    void rasa() { System.out.println("Buah punya rasa"); }
}

class Apel extends Buah {
    @Override
    void rasa() { System.out.println("Apel manis"); }
}

class Jeruk extends Buah {
    @Override
    void rasa() { System.out.println("Jeruk asam"); }
}

public class Latihan4 {
    public static void main(String[] args) {
        Buah b1 = new Apel();
        Buah b2 = new Jeruk();
        b1.rasa();
        b2.rasa();
    }
}
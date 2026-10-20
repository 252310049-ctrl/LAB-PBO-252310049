package Soal_No_9;

import java.util.List;

abstract class MediaAudio {
    abstract void putarAudio();
}

class Lagu extends MediaAudio {
    void putarAudio() { System.out.println("Memutar lagu"); }
}

class Podcast extends MediaAudio {
    void putarAudio() { System.out.println("Memutar podcast"); }
}

public class Main {
    public static void main(String[] args) {
        List<MediaAudio> playlist = List.of(new Lagu(), new Podcast(), new Lagu());

        for (MediaAudio m : playlist) {
            m.putarAudio();   // polimorfisme: hasil beda tergantung objek aslinya
        }
    }
}
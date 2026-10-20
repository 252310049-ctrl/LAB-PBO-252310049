package Soal_No_10;

public class MediaAudio {
	abstract class MediaAudio {
	    String judul = "Hati-Hati di Jalan";

	    void tampilkanInfo() {
	        System.out.println("Judul: " + judul);   // metode warisan
	    }

	    abstract void putarAudio();
	}

	class Lagu extends MediaAudio {   // PEWARISAN
	    void putarAudio() {
	        System.out.println("Memutar lagu: " + judul);
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        MediaAudio m = new Lagu();
	        m.tampilkanInfo();   // dari MediaAudio (diwariskan)
	        m.putarAudio();      // dari Lagu (override)
	    }
	}
}

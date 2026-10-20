package Soal_No_9;

//Satu-satunya yang ditambahkan: kelas baru
class Audiobook extends MediaAudio {
 void putarAudio() { System.out.println("Memutar audiobook"); }
}

//Di main, tinggal tambah objeknya, perulangan tidak berubah
List<MediaAudio> playlist = List.of(new Lagu(), new Podcast(), new Audiobook());
for (MediaAudio m : playlist) {
 m.putarAudio();
}

package com.ibik.pbo.Pembelajaran;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppBukuTelp {

    public static void main(String[] args) {

        ArrayList<String> daftarNama = new ArrayList<>();

        ArrayList<ArrayList<String>> bukuTelepon = new ArrayList<>();

        tambahKontak(daftarNama, bukuTelepon,
                "Septian Cahyadi",
                "Dramaga cantik residance II, Bogor",
                "+62 899-9506-210");

        tambahKontak(daftarNama, bukuTelepon,
                "Isnan Mulia",
                "Jl.Manunggal, Bogor",
                "+62 819-3208-0875");

        tambahKontak(daftarNama, bukuTelepon,
                "Edi Nurachmand",
                "Taman Cimanggu Permai, Bogor",
                "+62 856-9380-0384");

        while (true) {

            String[] menu = {
                "Lihat Kontak",
                "Tambah Kontak",
                "Keluar"
            };

            int pilihan = JOptionPane.showOptionDialog(
                    null,
                    "Pilih menu Buku Telepon",
                    "Aplikasi Buku Telepon",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    menu,
                    menu[0]
            );

            if (pilihan == 0) {

                StringBuilder hasil = new StringBuilder();

                for (int i = 0; i < bukuTelepon.size(); i++) {

                    ArrayList<String> kontak = bukuTelepon.get(i);

                    hasil.append("Nama: ").append(kontak.get(0)).append("\n");
                    hasil.append("Alamat: ").append(kontak.get(1)).append("\n");
                    hasil.append("No Telp: ").append(kontak.get(2)).append("\n");
                    hasil.append("--------------------------\n");
                }

                JOptionPane.showMessageDialog(
                        null,
                        hasil.toString(),
                        "Daftar Buku Telepon",
                        JOptionPane.INFORMATION_MESSAGE
                );

            } else if (pilihan == 1) {

                String nama = JOptionPane.showInputDialog("Masukkan Nama Lengkap:");

                if (nama == null) continue;

                String alamat = JOptionPane.showInputDialog("Masukkan Alamat:");

                if (alamat == null) continue;

                String telepon = JOptionPane.showInputDialog("Masukkan Nomor Telepon:");

                if (telepon == null) continue;

                tambahKontak(daftarNama, bukuTelepon, nama, alamat, telepon);

                JOptionPane.showMessageDialog(
                        null,
                        "Kontak berhasil ditambahkan!"
                );

            } else {
                break;
            }
        }

        JOptionPane.showMessageDialog(null, "Program selesai.");
    }

    public static void tambahKontak(
            ArrayList<String> daftarNama,
            ArrayList<ArrayList<String>> bukuTelepon,
            String nama,
            String alamat,
            String telepon) {

        daftarNama.add(nama);

        ArrayList<String> kontak = new ArrayList<>();
        kontak.add(nama);
        kontak.add(alamat);
        kontak.add(telepon);

        bukuTelepon.add(kontak);
    }
}


package com.ibik.pbo.Pembelajaran;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppLogistik {

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> daftarPesanan = new ArrayList<>();
        int nomorResi = 1;

        while (true) {

            String[] menu = {
                "Input Pengiriman",
                "Lacak Resi",
                "Keluar"
            };

            int pilihan = JOptionPane.showOptionDialog(
                    null,
                    "Pilih Menu Logistik PT. XYZ",
                    "Aplikasi Logistik",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    menu,
                    menu[0]
            );

            // Jika tombol menu ditutup
            if (pilihan == -1 || pilihan == 2) {
                if (konfirmasiKeluar()) {
                    break;
                } else {
                    continue;
                }
            }

            if (pilihan == 0) {

                String pengirim = JOptionPane.showInputDialog(
                        "Masukkan Nama Pengirim:"
                );

                if (pengirim == null) {
                    if (konfirmasiKeluar()) break;
                    continue;
                }

                String penerima = JOptionPane.showInputDialog(
                        "Masukkan Nama Penerima:"
                );

                if (penerima == null) {
                    if (konfirmasiKeluar()) break;
                    continue;
                }

                String beratInput = JOptionPane.showInputDialog(
                        "Masukkan Berat Barang (gram):"
                );

                if (beratInput == null) {
                    if (konfirmasiKeluar()) break;
                    continue;
                }

                double berat;

                try {
                    berat = Double.parseDouble(beratInput);

                    if (berat <= 0) {
                        throw new NumberFormatException();
                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Masukan angka",
                            "Error Info",
                            JOptionPane.ERROR_MESSAGE
                    );
                    continue;
                }

                String jarakInput = JOptionPane.showInputDialog(
                        "Masukkan Jarak Pengiriman (km):"
                );

                if (jarakInput == null) {
                    if (konfirmasiKeluar()) break;
                    continue;
                }

                double jarak;

                try {
                    jarak = Double.parseDouble(jarakInput);

                    if (jarak <= 0) {
                        throw new NumberFormatException();
                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Masukan angka",
                            "Error Info",
                            JOptionPane.ERROR_MESSAGE
                    );
                    continue;
                }

                double biayaBerat = Math.ceil(berat / 100) * 5000;
                double biayaJarak = Math.ceil(jarak / 10) * 8000;
                double totalBiaya = biayaBerat + biayaJarak;

                String resi = "XYZ" + nomorResi++;

                ArrayList<String> pesanan = new ArrayList<>();

                pesanan.add(resi);
                pesanan.add(pengirim);
                pesanan.add(penerima);
                pesanan.add(beratInput);
                pesanan.add(jarakInput);
                pesanan.add(String.format("%.0f", totalBiaya));

                daftarPesanan.add(pesanan);

                JOptionPane.showMessageDialog(
                        null,
                        "Pengiriman Berhasil!\n\n"
                        + "Nomor Resi: " + resi + "\n"
                        + "Nama Pengirim: " + pengirim + "\n"
                        + "Nama Penerima: " + penerima + "\n"
                        + "Total Biaya: Rp" + String.format("%.0f", totalBiaya),
                        "Bukti Pengiriman",
                        JOptionPane.INFORMATION_MESSAGE
                );

            } else if (pilihan == 1) {

                if (daftarPesanan.isEmpty()) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Belum ada pesanan yang dapat dilacak",
                            "Error Info",
                            JOptionPane.ERROR_MESSAGE
                    );
                    continue;
                }

                String cariResi = JOptionPane.showInputDialog(
                        "Masukkan Nomor Resi:"
                );

                if (cariResi == null) {
                    if (konfirmasiKeluar()) break;
                    continue;
                }

                boolean ditemukan = false;

                for (ArrayList<String> pesanan : daftarPesanan) {

                    if (pesanan.get(0).equalsIgnoreCase(cariResi)) {

                        JOptionPane.showMessageDialog(
                                null,
                                "Data Pengiriman Ditemukan\n\n"
                                + "Nomor Resi: " + pesanan.get(0) + "\n"
                                + "Pengirim: " + pesanan.get(1) + "\n"
                                + "Penerima: " + pesanan.get(2) + "\n"
                                + "Berat: " + pesanan.get(3) + " gram\n"
                                + "Jarak: " + pesanan.get(4) + " km\n"
                                + "Total Biaya: Rp" + pesanan.get(5),
                                "Informasi Pengiriman",
                                JOptionPane.INFORMATION_MESSAGE
                        );

                        ditemukan = true;
                        break;
                    }
                }

                if (!ditemukan) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Data tidak ditemukan",
                            "Error Info",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Program selesai.");
    }

    public static boolean konfirmasiKeluar() {

        int jawaban = JOptionPane.showConfirmDialog(
                null,
                "Apakah anda ingin keluar ?",
                "Konfirmasi",
                JOptionPane.YES_NO_OPTION
        );

        return jawaban == JOptionPane.YES_OPTION;
    }
}

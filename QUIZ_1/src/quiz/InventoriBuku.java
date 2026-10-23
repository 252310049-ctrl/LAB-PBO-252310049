package quiz;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class InventoriBuku {
	public static void main(String[] args) {
		ArrayList<String> buku = new ArrayList<String>();
		String[] pilihan = { "Simpan buku", "Hapus buku", "Output data buku", "Keluar" };
		int menu = 0;

		while (menu != 3) {
			menu = JOptionPane.showOptionDialog(null, "Pilih menu", "Inventori Buku",
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
					null, pilihan, pilihan[0]);

			if (menu == 0) {
				String judul = JOptionPane.showInputDialog(null, "Masukkan judul buku yang ingin diinput:");
				buku.add(judul);
				JOptionPane.showMessageDialog(null, "Buku \"" + judul + "\" berhasil disimpan.");

			} else if (menu == 1) {
				if (buku.size() == 0) {
					JOptionPane.showMessageDialog(null, "Data buku masih kosong.");
				} else {
					Object hapus = JOptionPane.showInputDialog(null, "Pilih buku yang dihapus:",
							"Hapus Buku", JOptionPane.QUESTION_MESSAGE, null,
							buku.toArray(), buku.get(0));
					buku.remove(hapus);
					JOptionPane.showMessageDialog(null, "Buku \"" + hapus + "\" berhasil dihapus.");
				}

			} else if (menu == 2) {
				if (buku.size() == 0) {
					JOptionPane.showMessageDialog(null, "Data buku masih kosong.");
				} else {
					String hasil = "Daftar Buku:\n";
					for (int i = 0; i < buku.size(); i++) {
						hasil = hasil + (i + 1) + ". " + buku.get(i) + "\n";
					}
					JOptionPane.showMessageDialog(null, hasil);
				}

			} else {
				JOptionPane.showMessageDialog(null, "Terima kasih, program selesai.");
				menu = 3;
			}
		}
	}
}
package praktikum4;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListApp {
	public static void main(String[] args) {
		ArrayList<String> nama = new ArrayList<String>();
		nama.add("Rafly"); // input data
		System.out.println(nama.get(0));

		// input dari user menggunakan JOptionPane
		nama.add(JOptionPane.showInputDialog(null, "Input nama:"));
		JOptionPane.showMessageDialog(null, "Nama " + nama.get(nama.size() - 1));

		nama.remove(0); // menghapus
		System.out.println("Nama setelah dihapus: " + nama.get(0));

		nama.add("Ade");
		nama.add("Abo");

		// pertanyaan
		System.out.println(nama.get(1));

		System.out.println("List Nama: ");
		for (int i = 0; i < nama.size(); i++) {
			System.out.println(nama.get(i));
		}
	}
}
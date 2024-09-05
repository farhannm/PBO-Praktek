import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        String platNumbers = scanner.nextLine();

        // Menggabungkan nomor plat menjadi satu string tanpa spasi
        String gabunganPlat = platNumbers.replace(" ", "");

        // Mengkonversi gabungan plat menjadi angka
        long gabunganAngka = Long.parseLong(gabunganPlat);

        // Menghitung (gabungan angka - 999999) % 5
        long hasil = (gabunganAngka - 999999) % 5;

        // Menentukan output berdasarkan hasil
        String output = hasil == 0 ? "berhenti" : "jalan";

        // Menampilkan hasil
        System.out.println(output);

        // Menutup scanner
        scanner.close();
    }
}

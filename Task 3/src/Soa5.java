import java.util.Scanner;

public class Soa5 {
    public static void main(String[] args) {
        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        String platNumbers = scanner.nextLine();

        // Menggabungkan nomor plat menjadi satu string tanpa spasi
        String gabunganPlat = platNumbers.replace(" ", "");

        // Konversi gabungan plat menjadi angka
        long gabunganAngka = Long.parseLong(gabunganPlat);

        // Menghitung (gabungan angka - 999999) % 5
        long hasil = (gabunganAngka - 999999) % 5;

        // Menentukan output berdasarkan hasil
        if (hasil != 0) {
            System.out.println("berhenti");
        } else {
            System.out.println("jalan");
        }

        scanner.close();
    }
}

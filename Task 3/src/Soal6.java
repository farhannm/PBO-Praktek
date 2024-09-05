import java.math.BigInteger;
import java.util.Scanner;

public class Soal6  {
    public static void main(String[] args) {
        // Membuat scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Membaca input dari pengguna
        System.out.print("Masukkan angka pertama: ");
        String inputA = scanner.nextLine();
        System.out.print("Masukkan angka kedua: ");
        String inputB = scanner.nextLine();

        // Mengonversi input menjadi BigInteger
        BigInteger a = new BigInteger(inputA);
        BigInteger b = new BigInteger(inputB);

        // Membuat objek BigNumber
        BigNumber bigNumber = new BigNumber();

        // Melakukan operasi penjumlahan dan perkalian
        BigInteger sum = bigNumber.addition(a, b);
        BigInteger product = bigNumber.multiply(a, b);

        // Menampilkan hasil penjumlahan dan perkalian
        System.out.println("Hasil Penjumlahan: " + sum);
        System.out.println("Hasil Perkalian: " + product);

        // Menutup scanner
        scanner.close();
    }
}

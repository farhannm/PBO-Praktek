import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah kalimat:"); // Input kalimat
        String input = scanner.nextLine();
        
        // Memisahkan string berdasarkan karakter non-alfabetik menggunakan regex
        String[] words = input.split("\\W+");

        // Menghitung jumlah kata
        int wordCount = words.length;
        
        // Memeriksa apakah array words kosong jika input kosong
        if (words.length == 1 && words[0].isEmpty()) {
            wordCount = 0; // Jika kosong maka jumlah kata 0
        }

        // Menampilkan jumlah kata
        System.out.println(wordCount);

        // Menampilkan kata-kata yang dipisahkan
        if (wordCount > 0) {
            for (String word : words) {
                System.out.println(word);
            }
        } else {
            System.out.println("Tidak ada kata yang valid ditemukan.");
        }

        scanner.close();
    }
}

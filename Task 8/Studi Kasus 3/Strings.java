// Kelas Strings yang membaca array String dan mengurutkannya menggunakan Selection Sort
import java.util.Scanner;

public class Strings {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] words = new String[5];  // Array String

        // Memasukkan kata-kata ke array
        System.out.println("Enter 5 words: ");
        for (int i = 0; i < words.length; i++) {
            words[i] = scan.nextLine();
        }

        // Mengurutkan menggunakan Selection Sort
        Sorting.selectionSort(words);

        // Menampilkan hasil array yang telah diurutkan
        System.out.println("\nYour words in sorted order: ");
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}

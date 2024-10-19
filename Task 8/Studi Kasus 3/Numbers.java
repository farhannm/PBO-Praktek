// Kelas Numbers yang membaca array angka dan mengurutkannya menggunakan Selection Sort
import java.util.Scanner;

public class Numbers {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer[] numbers = new Integer[5];  // Menggunakan Integer (bukan int) untuk autoboxing

        // Memasukkan angka ke array
        System.out.println("Enter 5 integers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();  // Menggunakan autoboxing dari int ke Integer
        }

        // Mengurutkan menggunakan Selection Sort
        Sorting.selectionSort(numbers);

        // Menampilkan hasil array yang telah diurutkan
        System.out.println("\nYour numbers in sorted order: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

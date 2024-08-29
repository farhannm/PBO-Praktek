import java.util.Scanner;

public class Soal5 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // membuat objek scanner untuk membaca input

        // membaca input kata pertama dan kata kedua
        System.out.print("Kata pertama : ");
        String A = scanner.nextLine();
        
        System.out.print("Kata kedua : ");
        String B = scanner.nextLine();

        // 1. menjumlahkan panjang kata pertama dengan kata keduaa
        int totalLength = A.length() + B.length();
        System.out.println(totalLength);

        // 2. membandingan  kata pertama dengan kata kedua secara leksikografis dengan fungsi compareTo
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 3. kapitalisasi huruf pertama pada kata pertama dengan kata kedua
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);

        // mencetak kata pertama dan kata kedua yang sudah dikapitalisasi dalam satu baris
        System.out.println(capitalizedA + " " + capitalizedB);
   
    }    
}
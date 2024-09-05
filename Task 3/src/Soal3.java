import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nOperasi Aritmatika\n");
        System.out.println("[ + ] Pertambahan");
        System.out.println("[ - ] Pengurangan");
        System.out.println("[ * ] Perkalian");
        System.out.println("[ / ] Pembagian");
        System.out.println("[ % ] Modulus\n");

        // Membaca input dari keyboard
        System.out.print("input : ");
        int A = scanner.nextInt();  // Membaca bilangan pertama
        char operator = scanner.next().charAt(0);  // Membaca operator
        int B = scanner.nextInt();  // Membaca bilangan kedua

        // Variabel untuk menyimpan hasil operasi
        int result = 0;

        // Menggunakan switch untuk menentukan proses matematika
        switch (operator) {
            case '+':
                result = A + B;
                break;
            case '-':
                result = A - B;
                break;
            case '*':
                result = A * B;
                break;
            case '/':
                result = A / B;
                break;
            case '%':
                result = A % B;
                break;
            default:
                System.out.println("Operator tidak valid");
                return;
        }

        // Menampilkan hasil operasi
        System.out.println(result);

        // Menutup scanner
        scanner.close();
    }
}

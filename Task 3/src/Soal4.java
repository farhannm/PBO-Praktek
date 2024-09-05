import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        // Menyimpad data terkait gaji dan harga item
        int gajiPokok = 500000, gajiTotal;
        int hargaItem = 50000;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nKalkulasi Upah Agent\n");

        // Membaca input dari keyboard
        System.out.print("Masukkan Jumlah Item yang Terjual: ");
        int jmlItemTerjual = scanner.nextInt();

        // Kalkulasi total penjualan
        int totalPenjualan = jmlItemTerjual * hargaItem;

        // Menghitung gaji dengan ternary control flow
        gajiTotal = 
            jmlItemTerjual >= 80 
                ? gajiPokok + (int)(0.35 * totalPenjualan) // Bonus 35% jika lebih dari 80 item
                : jmlItemTerjual >= 40 
                ? gajiPokok + (int)(0.25 * totalPenjualan) // Bonus 25% jika antara 40-79 item
                : jmlItemTerjual >= 15 
                ? gajiPokok + (int)(0.10 * totalPenjualan) // Bonus 10% jika antara 15-39 item
                : gajiPokok - (int)(0.15 * (15 - jmlItemTerjual) * hargaItem); // Denda jika di bawah 15 item

        // Menampilkan hasil gaji total
        System.out.println("Gaji Total: Rp. " + gajiTotal);

        scanner.close();

    }
    
}

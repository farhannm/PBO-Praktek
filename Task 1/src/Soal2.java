public class Soal2 { // Definisi kelas bernama Soal2
    public static void main(String[] args) { // Main method yang akan dieksekusi pertama kali oleh compiler
        int i = 42; // Deklarasi dan Inisialisasi variabel bertipe integer

        /*
         * Inisialisasi variabel dengan konsep control flow dengan bentuk nested ternary
         */
        String s = (i < 40) ? "life" : (i > 50) ? "universe" : "everything";

        System.out.println(s); // Mencetak ke layar dari variabel s yang memenuhi kondisi berdasarkan variabel
                               // i
    }
}

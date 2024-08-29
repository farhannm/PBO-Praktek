public class Constants {
    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54; // variabel lokal yang bersifat statis, atau tidak dapat berubah nilanya
        double paperWidth = 8.5; // deklarasi dan inisialisasi panjang dari kertas
        double paperHeight = 11; // deklarasi dan inisialisasi lebar dari kertas

        /* Mencetak ukuran kertas dalam cm (sentimeter) */
        System.out.println("Paper size in centimeters: " +
        paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH); 
    }
}
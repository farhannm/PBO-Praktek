public class Soal1 { // Definisi class bernama Soal1
    public static void main(String[] args) { // Main method yang akan dieksekusi pertama kali oleh compiler
        byte angka1 = 125; /* Deklarasi dan Inisialisasi variabel dengan tipe data byte */
        byte angka2 = 6;
        byte hasil = (byte) (angka1 + angka2); // Operasi matematika pertambahan dari kedua variabel berjenis numerik
                                               // yang disimpan ke sebuah variabel dengan tipe data byte

        System.out.println("Hasil 1 = " + hasil); // Mencetak keluaran dari variabel bernama "hasil"
    }
}
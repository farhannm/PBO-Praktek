public class Welcome { // Definisi Class bernama Welcome
    public static void main(String[] args) { // Main method yang akan dieksekusi pertama kali oleh compiler
        String greeting = "Welcome to Core Java!"; // Deklarasi dan Inisialisasi variabel
        System.out.println(greeting); // Mencetak ke layar dari variabel
        for (int i = 0; i < greeting.length(); i++) // For loop dengan kondisi i kurang dari panjang nilai dari variabel
                                                    // "greeting"
            System.out.print("="); // Mencetak ke layar selama state i < greeting.length bernilai TRUE
        System.out.println(); // Membuat new line atau garis baru
    }
} 

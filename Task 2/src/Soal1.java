import java.util.Scanner; // import package untuk input

public class Soal1 {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in); // membuat objek scanner untuk membaca input
        
        /* deklarasi variabel */
        String temp; 
        String answer = "Y";

        System.out.println("");
        System.out.println("Penentuan Tipe Data\n");
        
        /* Looping untuk menentukan apakah program berakhir atau lanjut */
        do {
            System.out.print("Input Angka : ");
            Long angka = inputObj.nextLong(); // Membaca input dari keyboard yang ditampung dalam sebuah variabel
            System.out.println("");

            /* conditions statement untuk mengecek nilai dari variabel angka dari range tipe data byte */
            if (angka >= Byte.MIN_VALUE && angka <= Byte.MAX_VALUE) {
                temp = "*byte"; // mencetak informasi tipe data di range tersebut
                /* mengecek juga kondisi keseluruhan, karena setiap range dari byte masuk ke beberapa tipe data primitif lainnya */
                if (angka >= Short.MIN_VALUE && angka <= Short.MAX_VALUE) {
                    temp += "\n*short"; 
                    if (angka >= Integer.MIN_VALUE && angka <= Integer.MAX_VALUE) {
                        temp += "\n*integer";
                        if (angka >= Long.MIN_VALUE && angka <= Long.MAX_VALUE) {
                            temp += "\n*long";
                        }
                    }
                }
            } else if (angka >= Short.MIN_VALUE && angka <= Short.MAX_VALUE) {
                temp = "*short";
                if (angka >= Integer.MIN_VALUE && angka <= Integer.MAX_VALUE) {
                    temp += "\n*integer";
                    if (angka >= Long.MIN_VALUE && angka <= Long.MAX_VALUE) {
                        temp += "\n*long";
                    }
                }
            } else if (angka >= Integer.MIN_VALUE && angka <= Integer.MAX_VALUE) {
                temp = "*integer";
                if (angka >= Long.MIN_VALUE && angka <= Long.MAX_VALUE) {
                    temp += "\n*long";
                }
            } else if (angka >= Long.MIN_VALUE && angka <= Long.MAX_VALUE) {
                temp = "*long";
            } else {
                temp = String.valueOf(angka) + " Can’t be fitted anywhere";
            }

            System.out.printf("%d can be fitted in \n%s", angka, temp); // mencetak angka yang mana akan masuk ke kelompok tipe data primitif
            System.out.println("");

            System.out.print("Input lagi? (Y/N) : ");
            answer = inputObj.next(); // input opsi lanjut atau keluar dari program
        } while (answer.equalsIgnoreCase("Y")); // mengecek nilai answer untuk menentukan program berlanjut atau berakhir

        inputObj.close(); // menutup objek scanner
    }
}

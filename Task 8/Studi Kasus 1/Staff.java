public class Staff {
    // Daftar staff yang merupakan array dari StaffMember
    private StaffMember[] staffList;

    // Konstruktor untuk kelas Staff
    public Staff() {
        // Membuat array staffList berukuran 8
        staffList = new StaffMember[8];  

        // Menambahkan beberapa anggota staf asli (bisa disesuaikan)
        staffList[0] = new Executive("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
        staffList[1] = new Employee("Carla", "456 Off Line", "555-0101", "987-65-4321", 1246.15);
        staffList[2] = new Employee("Woody", "789 Off Rocker", "555-0000", "010-20-3040", 1169.23);
        staffList[3] = new Hourly("Diane", "678 Fifth Ave.", "555-0690", "958-47-3625", 10.55);
        staffList[4] = new Volunteer("Norm", "987 Suds Blvd.", "555-8374");
        staffList[5] = new Volunteer("Cliff", "321 Duds Lane", "555-7282");

        // Menambahkan dua karyawan dengan komisi
        staffList[6] = new Commission("Alice", "111 North St.", "555-1111", "123-11-1111", 6.25, 0.20);  // Komisi 20%
        staffList[7] = new Commission("Bob", "222 South St.", "555-2222", "234-22-2222", 9.75, 0.15);   // Komisi 15%

        // Menetapkan jam kerja dan penjualan untuk karyawan komisi
        ((Hourly)staffList[3]).addHours(40);  // Contoh untuk karyawan Hourly
        ((Commission)staffList[6]).addHours(35);  // Karyawan komisi pertama
        ((Commission)staffList[6]).addSales(400);  // Menambahkan penjualan $400
        ((Commission)staffList[7]).addHours(40);  // Karyawan komisi kedua
        ((Commission)staffList[7]).addSales(950);  // Menambahkan penjualan $950
    }

    // Metode untuk membayar semua staf
    public void payday() {
        // Looping melalui semua anggota staffList
        for (int i = 0; i < staffList.length; i++) {
            // Mencetak informasi karyawan
            System.out.println(staffList[i]);

            // Menghitung gaji karyawan menggunakan polymorphism
            double amount = staffList[i].pay();  

            // Jika gaji adalah 0 (misalnya volunteer), cetak "Thanks!"
            if (amount == 0.0) {
                System.out.println("Thanks!");
            } else {
                // Jika tidak, cetak jumlah gaji yang dibayar
                System.out.println("Paid: " + amount);
            }

            // Memisahkan output untuk setiap staf
            System.out.println("-----------------------------------");
        }
    }
}

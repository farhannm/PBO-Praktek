// Kelas Commission yang meng-extend kelas Hourly
public class Commission extends Hourly {
    // Variabel instance untuk menyimpan total penjualan dan komisi
    private double totalSales;
    private double commissionRate;

    // Konstruktor untuk kelas Commission
    public Commission(String name, String address, String phone, String socialSecurityNumber, double payRate, double commissionRate) {
        // Memanggil konstruktor kelas induk (Hourly)
        super(name, address, phone, socialSecurityNumber, payRate);
        // Inisialisasi variabel instance
        this.commissionRate = commissionRate;
        this.totalSales = 0.0;  // Awalnya total sales adalah 0
    }

    // Metode untuk menambahkan penjualan ke total penjualan
    public void addSales(double totalSales) {
        this.totalSales += totalSales;  // Menambahkan penjualan ke total
    }

    // Override metode pay dari kelas Hourly untuk menghitung gaji
    @Override
    public double pay() {
        // Menghitung gaji berdasarkan jam kerja (memanggil metode pay dari Hourly)
        double basePay = super.pay();  
        // Menghitung komisi berdasarkan penjualan
        double commissionPay = totalSales * commissionRate;
        // Setelah gaji dibayarkan, total penjualan direset menjadi 0
        totalSales = 0;  
        // Mengembalikan total gaji dengan menambahkan gaji dasar dan komisi
        return basePay + commissionPay;
    }

    // Override metode toString untuk menampilkan informasi tambahan
    @Override
    public String toString() {
        // Menggabungkan output dari metode toString induk dan total penjualan
        return super.toString() + "\nTotal Sales: " + totalSales;
    }
}

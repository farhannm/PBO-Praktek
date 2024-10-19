// Kelas Salesperson yang mengimplementasikan Comparable
public class Salesperson implements Comparable<Salesperson> {
    private String firstName, lastName;
    private int totalSales;

    // Konstruktor untuk kelas Salesperson
    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    // Mengimplementasikan metode compareTo untuk membandingkan total sales
    public int compareTo(Salesperson other) {
        if (this.totalSales != other.totalSales) {
            return this.totalSales - other.totalSales;  // Bandingkan berdasarkan total sales
        } else {
            // Jika total sales sama, bandingkan berdasarkan nama belakang
            return other.lastName.compareTo(this.lastName);  // Urutan terbalik untuk nama
        }
    }

    // Metode toString untuk menampilkan data salesperson
    public String toString() {
        return lastName + ", " + firstName + ": " + totalSales;
    }
}

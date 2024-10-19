// Kelas Paint yang merepresentasikan cat dengan cakupan tertentu
public class Paint {
    private double coverage;  // Cakupan cat dalam satuan per area

    // Konstruktor untuk kelas Paint
    public Paint(double c) {
        coverage = c;
    }

    // Metode untuk menghitung jumlah cat yang dibutuhkan untuk suatu bentuk
    public double amount(Shape s) {
        System.out.println("Computing amount of paint for " + s);  // Menampilkan bentuk yang dihitung
        return s.area() / coverage;  // Menghitung jumlah cat berdasarkan luas area bentuk
    }
}

// Kelas abstrak Shape yang menjadi parent class untuk semua bentuk
public abstract class Shape {
    // Variabel instance untuk menyimpan nama bentuk
    protected String shapeName;

    // Konstruktor untuk menginisialisasi nama bentuk
    public Shape(String name) {
        shapeName = name;
    }

    // Metode abstrak untuk menghitung luas area bentuk
    public abstract double area();

    // Metode toString untuk mengembalikan nama bentuk
    public String toString() {
        return shapeName;
    }
}

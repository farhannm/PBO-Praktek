// Kelas Sphere yang meng-extend kelas Shape, merepresentasikan sebuah bola
public class Sphere extends Shape {
    private double radius;  // Jari-jari bola

    // Konstruktor untuk kelas Sphere
    public Sphere(double r) {
        super("Sphere");  // Menginisialisasi nama bentuk sebagai "Sphere"
        radius = r;
    }

    // Mengoverride metode area untuk menghitung luas permukaan bola
    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(radius, 2);  // Rumus luas permukaan bola
    }

    // Mengoverride metode toString untuk menampilkan info bola
    @Override
    public String toString() {
        return super.toString() + " with radius " + radius;
    }
}

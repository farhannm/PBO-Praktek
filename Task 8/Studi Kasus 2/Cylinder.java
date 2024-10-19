// Kelas Cylinder yang meng-extend kelas Shape, merepresentasikan silinder
public class Cylinder extends Shape {
    private double radius, height;  // Jari-jari dan tinggi silinder

    // Konstruktor untuk kelas Cylinder
    public Cylinder(double r, double h) {
        super("Cylinder");  // Menginisialisasi nama bentuk sebagai "Cylinder"
        radius = r;
        height = h;
    }

    // Mengoverride metode area untuk menghitung luas permukaan silinder
    @Override
    public double area() {
        return 2 * Math.PI * radius * (radius + height);  // Rumus luas permukaan silinder
    }

    // Mengoverride metode toString untuk menampilkan info silinder
    @Override
    public String toString() {
        return super.toString() + " with radius " + radius + " and height " + height;
    }
}

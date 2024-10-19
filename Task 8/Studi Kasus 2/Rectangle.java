// Kelas Rectangle yang meng-extend kelas Shape, merepresentasikan persegi panjang
public class Rectangle extends Shape {
    private double length, width;  // Panjang dan lebar persegi panjang

    // Konstruktor untuk kelas Rectangle
    public Rectangle(double l, double w) {
        super("Rectangle");  // Menginisialisasi nama bentuk sebagai "Rectangle"
        length = l;
        width = w;
    }

    // Mengoverride metode area untuk menghitung luas persegi panjang
    @Override
    public double area() {
        return length * width;  // Rumus luas persegi panjang
    }

    // Mengoverride metode toString untuk menampilkan info persegi panjang
    @Override
    public String toString() {
        return super.toString() + " with length " + length + " and width " + width;
    }
}

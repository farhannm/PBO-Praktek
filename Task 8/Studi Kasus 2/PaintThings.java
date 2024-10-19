// Kelas utama untuk menghitung jumlah cat yang diperlukan untuk berbagai bentuk
public class PaintThings {
    public static void main(String[] args) {
        // Membuat objek Paint dengan cakupan 350
        Paint paint = new Paint(350);

        // Membuat objek bentuk
        Rectangle deck = new Rectangle(20, 35);  // Persegi panjang dengan panjang 20 dan lebar 35
        Sphere bigBall = new Sphere(15);  // Bola dengan jari-jari 15
        Cylinder tank = new Cylinder(10, 30);  // Silinder dengan jari-jari 10 dan tinggi 30

        // Menghitung jumlah cat yang diperlukan untuk setiap bentuk
        double deckAmt = paint.amount(deck);
        double ballAmt = paint.amount(bigBall);
        double tankAmt = paint.amount(tank);

        // Menampilkan hasil
        System.out.println("Amount of paint required:");
        System.out.println("Deck: " + deckAmt);
        System.out.println("Big Ball: " + ballAmt);
        System.out.println("Tank: " + tankAmt);
    }
}

public class Soal4 {
    /* method untuk konversi tipe data */
    static short methodOne(long l)
    {
        int i = (int) l;
        return (short)i;
    }
    public static void main(String[] args)
    {
        double d = 10.25; // deklarasi dan inisialisasi variabel bertipe double
        float f = (float) d; // konversi dari double ke float
        
        byte b = (byte) methodOne((long) f); //konversi dari long -> integer -> short -> byte
        System.out.println(b); // mencetak nilai dari variabel b
    }
}

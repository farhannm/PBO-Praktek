import com.polban.jtk.inventory.*;

public class Soal2 {
    public static void main(String[] args) throws Exception {
        Inventori beli = new Inventori();
        
        beli.initBarang(); // Menginisialisasi barang

        // Menambah stok barang pertama
        beli.pengadaan(0, 5);
        beli.pengadaan(1, 4); // Menambah stok Baju sebanyak 5
        
        // Menampilkan stok setelah penambahan
        beli.showBarang();
    }
}

import com.polban.jtk.sales.Product;
import com.polban.jtk.sales.Sales;

public class Soal1 {
    public static void main(String[] args) throws Exception {
        // Membuat objek Product
        Product product = new Product("Skincare", 10000000, 10);

        // Membuat objek Sales yang menggunakan objek Product
        Sales sales = new Sales(product);

        // Menjual produk
        sales.sellProduct(5); // Menjual 5 unit

        // Menambah stok produk
        sales.restockProduct(20); // Menambah 20 unit stok

        // Memperbarui harga produk
        sales.updateProductPrice(10000000);

    }
}

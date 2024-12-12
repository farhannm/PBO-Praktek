import java.util.*;

public class SoalB {
    public static void main(String[] args) {
        // deklarasi HashMap
        HashMap<String, Double> productCatalog = new HashMap<>();

        // masukkan data produk ke dalam HashMap
        productCatalog.put("Apple Iphone 15", 13000000.0);
        productCatalog.put("Apple Macbook Air M2", 15000000.0);
        productCatalog.put("Apple Watch", 1000000.0);

        // menampilkan katalog produk (nama produk & harga)
        String productName1 = "Apple Iphone 15", productName2 = "Apple Macbook Air M2", productName3 = "Apple Watch";
        Double productPrice1 = productCatalog.get(productName1), productPrice2 = productCatalog.get(productName2), productPrice3 = productCatalog.get(productName3);
        
        System.out.println("Katalog Produk:");
        System.out.println("Produk: " + productName1 + ", Harga: " + productPrice1);
        System.out.println("Produk: " + productName2 + ", Harga: " + productPrice2);
        System.out.println("Produk: " + productName3 + ", Harga: " + productPrice3);

        // mencari harga produk berdasarkan nama
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama produk yang ingin dicari: ");
        String productName = scanner.nextLine();

        if (productCatalog.containsKey(productName)) {
            System.out.println("Harga " + productName + ": " + productCatalog.get(productName));
        } else {
            System.out.println(productName + " tidak ditemukan");
        }
    }
}

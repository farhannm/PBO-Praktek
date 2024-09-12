package com.polban.jtk.inventory;

public class Barang {
    
    String kode_barang;
    String nama_barang;
    int stok;
    
    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }

    
    int getStock() {
        return stok;
    }

    int addStock(int quantity) {
        if (quantity > 0) {
            stok += quantity;
            System.out.println(quantity + " unit ditambahkan.");
        } else {
            System.out.println("Kuantitas harus lebih dari 0.");
        } 

        return quantity;
    }

    public String getKodeBarang() {
        return nama_barang;
    }

    public String getNamaBarang() {
        return nama_barang;
    }
}
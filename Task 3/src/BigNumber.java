import java.math.BigInteger;

public class BigNumber {
    // Variabel private yang hanya bisa diakses di kelasnya sendiri
    private BigInteger a, b, sum, multiply;

    // Method untuk penjumlahan
    public BigInteger addition(BigInteger a, BigInteger b) {
        this.a = a;
        this.b = b;
        return a.add(b); // Operasi penjumlahan
    }

    // Method untuk perkalian
    public BigInteger multiply(BigInteger a, BigInteger b) {
        this.a = a;
        this.b = b;
        return a.multiply(b); // Operasi perkalian
    }
}

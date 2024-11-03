// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//
// ****************************************************************
public class MathUtils {
    //-------------------------------------------------------------
    // Returns the factorial of the argument given.
    // Throws IllegalArgumentException for invalid inputs.
    //-------------------------------------------------------------
    public static int factorial(int n) throws IllegalArgumentException {
        // Cek apakah n negatif atau lebih besar dari 16
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative integers: " + n);
        } else if (n > 16) {
            throw new IllegalArgumentException("Factorial is only defined for values up to 16: " + n);
        }

        // Menghitung faktorial
        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}

// Kelas WeeklySales yang menjadi driver untuk menguji sorting Salesperson
public class WeeklySales {
    public static void main(String[] args) {
        Salesperson[] staff = new Salesperson[10];  // Array Salesperson

        // Memasukkan data Salesperson
        staff[0] = new Salesperson("John", "Smith", 300);
        staff[1] = new Salesperson("Jane", "Doe", 500);
        staff[2] = new Salesperson("Bob", "Johnson", 400);
        staff[3] = new Salesperson("Alice", "Williams", 400);
        staff[4] = new Salesperson("Charlie", "Brown", 500);
        staff[5] = new Salesperson("Eve", "Davis", 300);
        staff[6] = new Salesperson("Frank", "Wilson", 400);
        staff[7] = new Salesperson("Grace", "Taylor", 500);
        staff[8] = new Salesperson("Hank", "Anderson", 400);
        staff[9] = new Salesperson("Ivy", "Thomas", 300);

        // Mengurutkan staff berdasarkan total sales menggunakan Selection Sort
        Sorting.selectionSort(staff);

        // Menampilkan hasil sorting
        System.out.println("Salesperson sorted by total sales:");
        for (Salesperson person : staff) {
            System.out.println(person);
        }
    }
}

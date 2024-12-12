public class SoalA {
    // kelas abstrak Employee
    abstract static class Employee<T> {
        protected T id;
        protected String name;
    
        public Employee(T id, String name) {
            this.id = id;
            this.name = name;
        }

        public abstract double calculatePayment();

        public void displayDetails() {
            // mencetak ID dan nama karyawan di kelas Employee<T>
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
        }
    }

    // kelas turunan FullTimeEmployee
    static class FullTimeEmployee<T> extends Employee<T> {
        private double monthlySalary;

        public FullTimeEmployee(T id, String name, double monthlySalary) {
            super(id, name);
            this.monthlySalary = monthlySalary;
        }

        @Override
        public double calculatePayment() {
            // hitung pembayaran untuk karyawan full-time
            return monthlySalary;
        }
    }

    // kelas turunan PartTimeEmployee
    static class PartTimeEmployee<T> extends Employee<T> {
        private double hourlyRate;
        private int hoursWorked;

        public PartTimeEmployee(T id, String name, double hourlyRate, int hoursWorked) {
            super(id, name);
            this.hourlyRate = hourlyRate;
            this.hoursWorked = hoursWorked;
        }

        @Override
        public double calculatePayment() {
            // hitung pembayaran untuk karyawan part-time
            return hourlyRate * hoursWorked;
        }
    }

    public static void main(String[] args) {
        // objek FullTimeEmployee dengan ID Integer
        FullTimeEmployee<Integer> fullTimeEmployee = new FullTimeEmployee<>(1001, "Alice", 10000000.0);

        // objek PartTimeEmployee dengan ID String
        PartTimeEmployee<String> partTimeEmployee = new PartTimeEmployee<>("PT2025", "Bob", 75000.0, 50);
        
        System.out.println("Full-Time Employee Details:");
        fullTimeEmployee.displayDetails();
        System.out.println("Monthly Payment: " + fullTimeEmployee.calculatePayment());

        System.out.println("\nPart-Time Employee Details:");
        partTimeEmployee.displayDetails();
        System.out.println("Monthly Payment: " + partTimeEmployee.calculatePayment());
    }
}

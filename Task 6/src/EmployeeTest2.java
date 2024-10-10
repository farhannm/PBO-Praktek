public class EmployeeTest2 {
    public static void main(String[] args) {
        Employee[] staff = new Employee[5];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
        staff[3] = new Manager("Atok Dalang", 8000000, 1, 1, 1995); // Manager instance
        staff[4] = new Manager("Angkel Ah Tong", 5000000, 1, 8, 2000);  // Manager instance

        // Before sorting
        System.out.println("Before sorting:");
        for (Employee e : staff) {
            e.print();
        }

        // Sort using shell_sort
        Sortable.shell_sort(staff);

        // After sorting
        System.out.println("\nAfter sorting:");
        for (Employee e : staff) {
            e.print();
        }
    }
}


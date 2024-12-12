import java.util.*;

public class SoalC {
    // kelas Subject (Publisher)
    public static class Employee<T> {
        private final List<Observer<T>> observers = new ArrayList<>();
        private T state;
        
        // menambahkan observer
        public void addObserver(Observer<T> observer) {
            observers.add(observer);
        }

        // menghapus observer
        public void removeObserver(Observer<T> observer) {
            observers.remove(observer);
        }

        // ubah state
        public void setState(T state) {
            this.state = state;
            notifyObservers();
        }

        // beri notifikasi ke semua observer
        private void notifyObservers() {
            for (Observer<T> observer : observers) {
                observer.update(state);
            }
        }
    }

    // Antarmuka observer
    public interface Observer<T> {
        void update(T state);
    }

    // implement observer
    public static class EmployeeObserver<T> implements Observer<T> {
        private final String name;

        public EmployeeObserver(String name) {
            this.name = name;
        }

        @Override
        public void update(T state) {
            System.out.println(name + " menerima notifikasi: " + state);
        }
    }

    public static void main(String[] args) {
        // membuat employee sebagai subject
        Employee<String> employee = new Employee<>();

        // buat observer
        Observer<String> hrObserver = new EmployeeObserver<>("HR Department");
        Observer<String> managerObserver = new EmployeeObserver<>("Manager");

        // mendaftar observer ke subject Employee
        employee.addObserver(hrObserver);
        employee.addObserver(managerObserver);

        // state diubah (misalnya nama atau gaji) dan lihat notifikasi
        employee.setState("Farhan Maulana");
        employee.setState("Gaji berubah menjadi 15000000");
    }
}

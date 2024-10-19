// Kelas Sorting yang mengimplementasikan algoritma Selection Sort dan Insertion Sort
public class Sorting {
    
    // Metode Selection Sort untuk mengurutkan array Comparable dalam urutan naik
    public static void selectionSort(Comparable[] list) {
        int min;
        Comparable temp;

        for (int index = 0; index < list.length-1; index++) {
            min = index;
            for (int scan = index+1; scan < list.length; scan++) {
                if (list[scan].compareTo(list[min]) < 0) {
                    min = scan;
                }
            }
            // Menukar elemen terkecil dengan elemen saat ini
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

    // Metode Insertion Sort untuk mengurutkan array Comparable dalam urutan naik
    public static void insertionSort(Comparable[] list) {
        for (int index = 1; index < list.length; index++) {
            Comparable key = list[index];
            int position = index;

            // Memindahkan elemen yang lebih besar ke posisi selanjutnya
            while (position > 0 && list[position - 1].compareTo(key) > 0) {
                list[position] = list[position - 1];
                position--;
            }
            list[position] = key;
        }
    }

    // Metode Insertion Sort yang dimodifikasi untuk mengurutkan array dalam urutan menurun
    public static void insertionSortDescending(Comparable[] list) {
        for (int index = 1; index < list.length; index++) {
            Comparable key = list[index];
            int position = index;

            // Memindahkan elemen yang lebih kecil ke posisi selanjutnya (urutan menurun)
            while (position > 0 && list[position - 1].compareTo(key) < 0) {
                list[position] = list[position - 1];
                position--;
            }
            list[position] = key;
        }
    }
}

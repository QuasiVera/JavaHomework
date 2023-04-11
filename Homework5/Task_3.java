import java.util.Arrays;
import java.util.Random;

/*
 * 3. Реализовать алгоритм пирамидальной сортировки (HeapSort)
 */

public class Task_3 {
    public static void main(String[] args) {

        Random rnd = new Random();
        int size = rnd.nextInt(31);     // Ограничила размер массива и максимальный размах значений для простоты
                                            // проверки
        int max = 31;

        int[] array = createArray(size, max);

        System.out.println(Arrays.toString(array));
        int[] res = heapSort(array);
        System.out.println(Arrays.toString(res));
    }

    // --------------------- Создание случайного массива

    static int[] createArray(int size, int max) {

        int[] array = new int[size];
        Random item = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = item.nextInt(max + 1);
        }
        return array;
    }

    // ------------------ Cортировка

    static int[] heapSort(int[] array) {
        if (array.length == 0) {
            return array;
        }

        int len = array.length;

        for (int i = len / 2 - 1; i >= 0; i--) {
            array = heapify(array, len, i);
        }

        for (int i = len - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            array = heapify(array, i, 0);
        }
        return array;
    }

    // -------------- Приведение к структуре кучи

    static int[] heapify(int[] array, int len, int i) {
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
        int max = i;

        if (leftChild < len && array[leftChild] > array[max]) {
            max = leftChild;
        }
        if (rightChild < len && array[rightChild] > array[max]) {
            max = rightChild;
        }

        if (max != i) {
            int temp = array[i];
            array[i] = array[max];
            array[max] = temp;

            heapify(array, len, max);
        }
        return array;
    }

}

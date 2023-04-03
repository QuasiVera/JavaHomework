import java.util.Arrays;
import java.util.Random;

/**
 * *Реализовать алгоритм сортировки слиянием
 */
public class Task3 {

    public static void main(String[] args) {
        Random rnd = new Random();
        int size = rnd.nextInt(21); // Ограничила размер массива и максимальный размах значений для простоты
                                    // проверки
        int max = 21;

        int[] array = createArray(size, max);
        // System.out.println(size);
        System.out.println(Arrays.toString(array));
        int[] res = mergeSort(array);
        System.out.println(Arrays.toString(res));

    }

    static int[] createArray(int size, int max) {

        int[] array = new int[size];
        Random item = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = item.nextInt(max + 1);
        }
        return array;
    }

    static int[] mergeSort(int[] array) {
        if (array.length < 2) {
            return array;
        }

        int[] array_1half = new int[array.length / 2];
        System.arraycopy(array, 0, array_1half, 0, array.length / 2);

        int[] array_2half = new int[array.length - array.length / 2];
        System.arraycopy(array, array.length / 2, array_2half, 0, array.length - array.length / 2);

        array_1half = mergeSort(array_1half);
        array_2half = mergeSort(array_2half);

        int i = 0;
        int j = 0;
        int k = 0;
        int[] res_array = new int[array_1half.length + array_2half.length];

        while (i < array_1half.length && j < array_2half.length) {
            if (array_1half[i] < array_2half[j]) {
                res_array[k] = array_1half[i];
                i++;
            } else {
                res_array[k] = array_2half[j];
                j++;
            }
            k++;
        }

        while (i < array_1half.length) {
            res_array[k] = array_1half[i];
            i++;
            k++;
        }
        while (j < array_2half.length) {
            res_array[k] = array_2half[j];
            j++;
            k++;
        }
        return res_array;
    }

}


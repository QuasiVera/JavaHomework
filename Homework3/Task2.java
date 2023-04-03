import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    /*
     * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка
     */
    public static void main(String[] args) {
        
        Random rnd = new Random();
        int size = rnd.nextInt(20);
       
        ArrayList<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            int rand_item = rnd.nextInt(21);
            list.add(rand_item);
        }
        
        System.out.println(list);

        int max = list.get(0);
        int min = list.get(0);
        int sum = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            sum += list.get(i);
            if (list.get(i) > max) {
                max = list.get(i);
            }
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }

        double average = (double) sum / list.size();
        System.out.printf("Max = %d, min = %d, Среднее арифметическое = %f", max,min,average);
    }
    
}

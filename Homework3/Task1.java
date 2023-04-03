
import java.util.ArrayList;
import java.util.Random;

public class Task1 {

    /*
     * Пусть дан произвольный список целых чисел, удалить из него четные числа
     */
    public static void main(String[] args) {

        Random rnd = new Random();
        int size = rnd.nextInt(20);
       
        ArrayList<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            int rand_item = rnd.nextInt(11);
            list.add(rand_item);
        }
        
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        
        System.out.printf("Результат: \n %s", list);

    }
}

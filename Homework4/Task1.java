package Homework4;

import java.util.LinkedList;
import java.util.ListIterator;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("инверсия");
        ll.add("слов");
        ll.add("магистра");
        ll.add("Йоды");

        System.out.println(ll);

        System.out.println(list_reverse(ll));
    }
    
    //=============== Разворот списка

    static LinkedList<String> list_reverse(LinkedList<String> ll) {
        LinkedList<String> ll_reversed = new LinkedList<>();
        // while (!ll.isEmpty()) {                                           // Без сохранения исходного списка
        //     ll_reversed.add(ll.removeLast());
        // }

        ListIterator <String> iterator = ll.listIterator(ll.size());         // С сохранением исходного списка
        
        while (iterator.hasPrevious()) {
            ll_reversed.add(iterator.previous());
        }
        
        return ll_reversed;
    }

}

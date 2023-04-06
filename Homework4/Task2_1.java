package Homework4;

public class Task2_1 {
   public static void main(String[] args) {
    MyQueue1 queue = new MyQueue1();
        queue.enqueue("3");
        queue.enqueue("45");
        queue.enqueue("7");

        System.out.println(queue.first());

        System.out.println("Первый элемент = " + queue.dequeue());
        System.out.println("size = " + queue.size());
        System.out.println("После duqueue: \n" + queue.toStr());
        queue.enqueue("17");
        System.out.println("Добавили 17 \n"+queue.toStr());
   } 
}

package Homework4;

import java.util.LinkedList;

public class MyQueue1 {
    private LinkedList<String> ll = new LinkedList<>();
    
    public int size() {
        return ll.size();
    }
    public void enqueue(String val) {
        ll.addLast(val);
    }

    public String first() {
        return ll.element();
    }

    public String dequeue() {
        return ll.removeFirst();
    }
    
    public String toStr() {
        return ll.toString();
    }
}

package Homework4;


public class MyQueue {
    private int[] arr = new int[10];
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean empty() {
        return size == 0;
    }

    public void enqueue(int val) {
        if (size == arr.length) {
            int[] arr1 = new int[arr.length * 2];
            System.arraycopy(arr, 0, arr1, 0, arr.length);
            arr = arr1;
        }
        arr[size] = val;
        size++;
    }

    public int first() {
        return arr[0];
    }

    public int dequeue() { // что-то надо придумать
        int res = first();
        int[] arr1 = new int[arr.length];
        System.arraycopy(arr, 1, arr1, 0, arr.length-1);
        arr = arr1;
        size--;
        return res;
    }

    public String toStr() {
        String res = "";
        for (int i = 0; i < size; i++) {
            if (arr[i] == 0)
                continue;
            res += Integer.toString(arr[i]) + " " ;
        }
        return res;
    }
}

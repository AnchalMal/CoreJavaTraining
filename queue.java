package com.java.training;

/**
 * Created by anchalmal on 2/1/17.
 */
public class queue {

        int top = -1;
        int rear = 0;
        private static final int max = 3;
        int arr[] = new int[max];
        int size = 0;


        public void enqueue(int enqueuedElement) {
            if (top < max - 1) {
                top++;
                arr[top] = enqueuedElement;
                System.out.println("Element " + enqueuedElement + " is pushed to Queue !");
                display();
            } else {
                System.out.println("Overflow !");
            }

        }

        public void dequeue() {
            if (top >= rear) {
                rear++;
                System.out.println("dequeue operation done !");
                display();
            } else {
                System.out.println("Underflow !");
            }
        }

    public void display() {
        if (top >= rear) {
            System.out.println("Elements in Queue : ");
            for (int i = rear; i <= top; i++) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        queue q = new queue();
        q.dequeue();
        q.enqueue(23);
        q.enqueue(2);
        q.enqueue(73);
        q.enqueue(21);
        q.dequeue();
        q.dequeue();


    }
}

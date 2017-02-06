package com.java.training;

/**
 * Created by anchalmal on 2/2/17.
 */


class Stack<T> {
    private int size;
    private T[] arr;
    private int top;

    public Stack(int size) {
        this.size = size;
        arr = (T[])new Object[size];
        top = -1;
    }

    public void push(T value){
        if(isFull()){
            System.out.println("Stack is full");
        }
        arr[++top] = value;
    }

    public T pop() {
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        return arr[top--];
    }


    public boolean isEmpty(){
        return (top == -1);
    }


    public boolean isFull(){
        return (top == size - 1);
    }

}

public class stackGeneric {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);


        System.out.print("Pop: ");
        System.out.print(stack.pop()+" ");
        System.out.print(stack.pop()+" ");
        System.out.print(stack.pop()+" ");



    }

}



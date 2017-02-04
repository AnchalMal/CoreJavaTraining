package com.stackImplementation;

import com.sun.jdi.InvalidStackFrameException;
import java.util.EmptyStackException;

/**
 * Created by anchalmal on 1/27/17.
 */
public class stack {
    private int top;
    private int max;
    private int array[];
    public int i;

    public stack(int j) {
        max= j;
        array = new int[max];
        top = -1; }


    public int pop(){
        if(array[0]==0)
        {
            throw new EmptyStackException();
        }
        else{
        return array[top--];}

    }

    public int push(int i) throws Exception{
        if (top==max )
        {
            throw new Exception("stack overflow");
        }
        else{
        return array[top++];}

    }

    public int peek(){
        return array[top];

    }

    public static void main(String[] args) {
        try {
            stack s = new stack(5);
            s.push(100);
            s.push(200);
            s.push(300);
            s.pop();
            s.pop();
        }
        catch(Exception e)
            {
                System.out.println("all is well");
            }

    }
}

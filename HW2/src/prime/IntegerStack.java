package prime;

import java.util.Stack;

public class IntegerStack {
    private int[] stacks;
    private int top;
    private int cap;

    public IntegerStack(int size) {
        cap = size;
        stacks = new int[cap];
        top = -1;
    }

    public void push(int value) {
        if (top == cap - 1) {
            System.out.println("Stack is full");
            return;
        }
        stacks[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stacks[top--];
    }

    public boolean isEmpty() {
        return top == -1;


    }
}

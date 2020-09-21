package com.structure.queue;

public class CustomQueue {

    private int queue[];
    private int top; // Position of the last inserted element
    private int size; // Number of possible positions

    public CustomQueue(int size) {
        this.size = size;
        queue = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size);
    }

    public int getTop() {
        return queue[top];
    }

    public void enqueue(int newValue) {
        if (isFull()) {
            System.err.println("You cannot enqueue that element beacuse the Queue is already full.");
        } else {
            queue[++top] = newValue;
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.err.println("You cannot dequeue that element because the Queue is empty.");
        } else {
            Integer nextNullValue = queue[0];
            for (int index = 0; index < top; index++) {
                queue[index] = queue[index + 1];
            }
            top--;
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.err.println("Your Queue is empty.");
        } else {
            for (int index = 0; index <= top; index++) {
                System.out.print(queue[index] + " ");
            }
        }
    }

}

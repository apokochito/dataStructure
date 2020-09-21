package com.structure;

import com.structure.linkedList.Car;
import com.structure.linkedList.CustomList;
import com.structure.queue.CustomQueue;
import com.structure.stack.CustomStack;

public class Main {

    public static void main(String[] args) {

        // LINKED LIST
        CustomList customList = new CustomList();
        customList.insertAtTheBeginning(new Car("TOYOTA", "RED")); //0
        customList.insertAtTheBeginning(new Car("POINTER", "BLUE")); //1
        customList.insertAtTheBeginning(new Car("POINTER", "BROWN")); //2
        customList.insertAtTheBeginning(new Car("POINTER", "GREEN")); //3
        customList.insertAtTheBeginning(new Car("POINTER", "GRAY")); //4
        customList.insertAtTheBeginning(new Car("POINTER", "GOLD")); //5
        customList.insertAtTheBeginning(new Car("POINTER", "CYAN")); //6
        customList.deleteFirstNode(); //six node
        customList.deleteLastNode(); //zero node
        System.out.println(customList.countCars()); //5
        customList.insertAtTheBeginning(new Car("TOYOTA", "YELLOW")); //6
        System.out.println(customList.getSpecificCar(0)); //six node
        System.out.println(customList.countCars()); //six
        System.out.println(customList.getCars());

        /*
         QUEUE
            FIFO (first in, first out), for example a queue of process that your pc has
            JAVA
                Queue queue = new PriorityQueue();
                Queue queue1 = new ArrayDeque();
                Queue queue2 = new LinkedList();
                Queue queue3 = new SynchronousQueue();
         */
        CustomQueue myQueue = new CustomQueue(5);
        myQueue.enqueue(4);
        myQueue.enqueue(12);
        myQueue.enqueue(50);
        System.out.println("TOP value: " + myQueue.getTop());
        myQueue.dequeue();
        myQueue.enqueue(20);
        System.out.println("TOP value: " + myQueue.getTop());
        myQueue.printQueue();

        /*
         STACK
            LIFO (last in, first out), for example a stack of plates.
            JAVA
                Stack stack = new Stack();
                Stack stack1 = new StringStack();
        */
        CustomStack myStack = new CustomStack();
        //myStack

        /*
         TREE

            JAVA

        */

    }
}

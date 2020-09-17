package com.structure;

import com.structure.linkedList.Car;
import com.structure.linkedList.CustomList;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;

import java.util.*;
import java.util.concurrent.SynchronousQueue;

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

        //QUEUE
        Queue queue = new PriorityQueue();
        Queue queue1 = new ArrayDeque();
        Queue queue2 = new LinkedList();
        Queue queue3 = new SynchronousQueue();



        //STACK
        Stack stack = new Stack();
        Stack stack1 = new StringStack();

        //TREE

    }
}

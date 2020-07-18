package com.structure;

import com.structure.linkedList.Car;
import com.structure.linkedList.List;

public class Main {

    public static void main(String[] args) {

        // LINKED LIST
        List list = new List();
        list.insertAtTheBeginning(new Car("TOYOTA", "RED")); //0
        list.insertAtTheBeginning(new Car("POINTER", "BLUE")); //1
        list.insertAtTheBeginning(new Car("POINTER", "BROWN")); //2
        list.insertAtTheBeginning(new Car("POINTER", "GREEN")); //3
        list.insertAtTheBeginning(new Car("POINTER", "GRAY")); //4
        list.insertAtTheBeginning(new Car("POINTER", "GOLD")); //5
        list.insertAtTheBeginning(new Car("POINTER", "CYAN")); //6
        list.deleteFirstNode(); //six node
        list.deleteLastNode(); //zero node
        System.out.println(list.countCars()); //5
        list.insertAtTheBeginning(new Car("TOYOTA", "YELLOW")); //6
        System.out.println(list.getSpecificCar(0)); //six node
        System.out.println(list.countCars()); //six
        System.out.println(list.getCars());
    }
}

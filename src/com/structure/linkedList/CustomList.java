package com.structure.linkedList;

import java.util.ArrayList;

public class CustomList {

    private Node head = null;

    private int length = 0;

    public class Node {

        public Car car;

        @Override
        public String toString() {
            return "Node{" + "car=" + car + '}';
        }

        //Reference (link)
        public Node nextNode = null;

        public Node(Car car) {
            this.car = car;
        }

    }

    public void insertAtTheBeginning(Car car) {
        //Create new Node from this new car
        Node node = new Node(car);
        //Put whatever Head contains as next reference of your new node
        node.nextNode = head;
        //Change the head to your new Node
        head = node;

        //Reflecting the new Node in the list
        length++;
    }

    public void insertAtTheEnd(Car car) {
        //Create new Node from this new car
        Node node = new Node(car);
        //Crate your Pointer at head value
        Node pointer = head;
        //Move next while there's not end of the list
        while (pointer.nextNode != null) {
            //Move one position
            pointer = pointer.nextNode;
        }
        //Insert the new node at null (end) position
        pointer.nextNode = node;

        //Reflecting the new Node in the list
        length++;
    }

    public void insertAtTheMiddle(int index, Car car) {
        //Create new Node from this new car
        Node node = new Node(car);
        //If there's an empty list...
        if (head == null) {
            head = node;
        } else {
            //Crate your Pointer at head value
            Node pointer = head;
            //We need to identify the Car number with a counter
            int count = 0;
            //Move next while there's not end of the list, and we're not in a specific index
            while (count < index && pointer.nextNode != null) {
                //Move one position
                pointer = pointer.nextNode;
                //We identify in which Car number we are
                count++;
            }
            //We link the left side
            node.nextNode = pointer.nextNode;
            //We link the right side
            pointer.nextNode = node;
        }

        //Reflecting the new Node in the list
        length++;
    }

    public String getSpecificCar(int index) {
        if (head == null) {
            //We cannot return a Car that doesn't exist
            return null;
        } else {
            //Crate your Pointer at head value
            Node pointer = head;
            //We need to identify the Car number with a counter
            int count = 0;
            //Move next while there's not end of the list, and we're not in a specific index
            while (count < index && pointer.nextNode != null) {
                //Move one position
                pointer = pointer.nextNode;
                //We identify in which Car number we are
                count++;
            }
            //We cannot return a Car that doesn't exist
            if (count != index) {
                return null;
            } else {
                return pointer.car.toString();
            }
        }
    }

    public int countCars() {
        return length;
    }

    public void deleteFirstNode() {
        if (head != null) {
            //Garbage Collector will delete this variable
            Node firstNode = head;
            //Set the next Node as the first Node
            head = head.nextNode;
            firstNode.nextNode = null;

            //Reflecting the previous Node in the list
            length--;
        }
    }

    public boolean isListEmpty() {
        return head == null;
    }

    public void deleteLastNode() {
        if (head != null) {
            //Crate your Pointer at head value
            Node pointer = head;
            //Move next while there's not end of the list
            while (pointer.nextNode != null) {
                //Move one position
                pointer = pointer.nextNode;
            }
            //Delete the last node at null (end) position
            pointer = null;
        }

        //Reflecting the previous Node in the list
        length--;
    }

    public void deleteSpecificCar(int index) {
        if (head != null) {
            //In case the user needs to delete the first Car
            if (index == 0) {
                //Garbage Collector will delete this variable
                Node firstNode = head;
                //Set the next Node as the first Node
                head = head.nextNode;
                firstNode.nextNode = null;

                //we need to validate the index
            } else if (index < length) {
                //Crate your Pointer at head value
                Node pointer = head;
                //We need to identify the Car number with a counter
                int count = 0;
                //Move next while there's not end of the list, and we're not in a specific index
                while (count < (index - 1)) {
                    //Move one position
                    pointer = pointer.nextNode;
                    //We identify in which Car number we are
                    count++;
                }
                Node toDelete = pointer.nextNode;
                pointer.nextNode = toDelete.nextNode;
                toDelete.nextNode = null;

            }

            //Reflecting the previous Node in the list
            length--;
        }
    }

    public ArrayList<Node> getCars() {
        if (head == null) {
            //We cannot return a Car that doesn't exist
            return null;
        } else {
            //Crate your Pointer at head value
            Node pointer = head;
            //We need to identify the Car number with a counter
            int count = 0;

            ArrayList<Node> carList = new ArrayList<>();

            //Move next while there's not end of the list, and we're not in a specific index
            while (pointer.nextNode != null) {
                carList.add(pointer.nextNode);
                //Move one position
                pointer = pointer.nextNode;
                //We identify in which Car number we are
                count++;
            }

            return carList;
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.stacknque;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

class Stack {
    private LinkedList list;

    public Stack() {
        this.list = new LinkedList();
    }

    public void push(int data) {
        list.insert(data);
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int data = list.head.data;
        list.head = list.head.next;
        return data;
    }

    public boolean isEmpty() {
        return list.head == null;
    }

    public void display() {
        list.display();
    }
}

class Queue {
    private LinkedList list;

    public Queue() {
        this.list = new LinkedList();
    }

    public void enqueue(int data) {
        list.insert(data);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Node current = list.head;
        Node prev = null;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }
        int data = current.data;
        if (prev != null) {
            prev.next = null;
        } else {
            list.head = null;
        }
        return data;
    }

    public boolean isEmpty() {
        return list.head == null;
    }

    public void display() {
        list.display();
    }
}

public class Stacknque {
    public static void main(String[] args) {
        // Stack example
        Stack stack = new Stack();
        stack.push(54);
        stack.push(67);
        stack.push(32);

        System.out.println("Stack:");
        stack.display();

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop:");
        stack.display();

        Queue queue = new Queue();
        queue.enqueue(43);
        queue.enqueue(76);
        queue.enqueue(65);

        System.out.println("Queue:");
        queue.display();

        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Queue after dequeue:");
        queue.display();
    }
}

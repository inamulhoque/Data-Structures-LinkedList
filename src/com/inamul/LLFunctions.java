package com.inamul;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LLFunctions {
    static Scanner sc = new Scanner(System.in);
    static Node firstNode;
    public static void insertFirst(int data){
        Node node = new Node(data);
        node.data = data;
        node.next = firstNode;
        firstNode = node;
    }

    public static void add(int data) {
        Node newNode = new Node(data);
        if(firstNode == null) {
            firstNode = newNode;
        }else {
            Node temp = firstNode;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static void insertLast(int data){
        Node temp = firstNode;
        while (temp.next!=null){
            temp = temp.next;
        }
        Node node = new Node(data);
        node.data = data;
        temp.next = node;
    }

    public static void insertInBetween(int previousData,int afterData) {
        Node temp = firstNode;
        while(temp.data != previousData) {
            temp = temp.next;
        }
        Node node = new Node(afterData);
        node.next = temp.next;
        temp.next = node;
    }

    public static void deleteFirst(){
        Node temp = firstNode;
        firstNode = firstNode.next;
    }
    public static void deleteLast(){
        Node temp = firstNode;
        Node secondLast = null;
        while(temp.next != null) {
            secondLast = temp;
            temp = temp.next;
        }
        secondLast.next = null;
    }

    public static void deleteAnyNode(int data) {
        Node temp = firstNode;
        Node previousNode = firstNode;

        while(temp != null) {
            if(temp.data == data) {
                previousNode.next = temp.next;
                return;
            }
            previousNode = temp;
            temp = temp.next;
        }
    }

    public static Node searchNode(int data){
        Node temp = firstNode;
        while (temp.next != null){
            if (temp.data == data){
                System.out.println("Element Found "+data);
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public static void printData(){
        Node temp = firstNode;
        while (temp!=null){
            System.out.print("Data -> "+temp.data+" ");
            temp = temp.next;
        }
    }

}

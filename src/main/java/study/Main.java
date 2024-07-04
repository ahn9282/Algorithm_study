package study;

import org.w3c.dom.Node;
import study.basic.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.printList();
        System.out.println(myLinkedList.removeFirst());
        System.out.println(myLinkedList.removeFirst());
        System.out.println(myLinkedList.removeFirst());

    }



}
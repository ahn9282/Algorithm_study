package study.datastructure;

public class DoublyLinkedList {
    private Node tail;
    private Node head;
    private int length;
    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(7);
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();
        myDLL.append(5);

        myDLL.printList();

        System.out.println("=======================removeLast===============");

        DoublyLinkedList dll1 = new DoublyLinkedList(1);
        dll1.append(2);

        System.out.println(dll1.removeLast().value);
        System.out.println(dll1.removeLast().value);
        System.out.println(dll1.removeLast());
        System.out.println("=======================prepend===============");
        DoublyLinkedList dll2 = new DoublyLinkedList(2);
        dll2.append(3);

        dll2.prepend(4);
        dll2.printList();
        System.out.println("=======================removeFirst===============");
        DoublyLinkedList dll3 = new DoublyLinkedList(8);
        dll3.append(14);
        System.out.println(dll3.removeFirst().value);
        System.out.println(dll3.removeFirst().value);
        System.out.println(dll3.removeFirst());

        System.out.println("=======================get===============");
        DoublyLinkedList dll4 = new DoublyLinkedList(8);
        dll4.append(14);
        dll4.append(54);
        dll4.append(57);

        System.out.println(dll4.get(1).value);
        System.out.println(dll4.get(2).value);
        dll4.printList();
        System.out.println("=======================insert===============");
        DoublyLinkedList dll5 = new DoublyLinkedList(8);
        dll5.append(14);
        dll5.append(54);
        dll5.insert(1, 2);
        dll5.printList();

    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node temp = tail;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
            length++;
    }
    public Node removeFirst(){
        if(length == 0) return null;
        Node temp= head;
        if(length == 1){
            head = null;
            tail = null;
        }else{
            head = head.next;
            head.prev = null;
        temp.next = null;
        }
        length--;
        return temp;
    }

    public Node remove(int index) {
        if(index > 0 || index >= length)return null;
        if(index == 0) return removeFirst();
        if(index == length - 1) return removeLast();

            Node temp = get(index);
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
            temp.next = null;
            temp.prev = null;
        length--;
        return temp;
    }
    public Node get(int index) {
        if(index >= length || index < 0) return null;
            Node temp = tail;

        if (length / 2 <= index) {
            for(int i =length - 1; i> index ; i--){
                temp =temp.prev;
            }
        } else {
            temp = head;
            for(int i =0; i< index ; i++){
                temp =temp.next;
            }
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if(temp  != null){
            temp.value = value;
            return true;
        }else{
            return false;
        }
    }
    public boolean insert (int index, int value){
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(value);
            return true;
        } else if (index == length) {
            append(value);
            return true;
        }else{
            Node now =get(index);
            Node pre = now.prev;
            Node newNode = new Node(value);
            newNode.next = now;
            newNode.prev = pre;
            pre.next = newNode;
            now.prev = newNode;
            length++;
            return true;
        }
    }

    public void getHead() {
        System.out.println("head = " + head.value);
    }

    public void getTail() {
        System.out.println("tail = " + tail.value);
    }

    public void getLength() {
        System.out.println("length = " + length);
    }

    static class Node {
        public int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public int getV() {
            return value;
        }
    }
}

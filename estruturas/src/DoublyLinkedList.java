import LL.LinkedList;

public class DoublyLinkedList {
    private  Node head;
    private  Node tail;
    private int length;

    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    public void printList(){

        Node temp = head;

        while(temp != null){
            System.out.print(" <-> " + temp.value + " <-> " );

            temp = temp.next;
        }
        System.out.println();
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
           head = newNode;
           tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast(){
        if(length == 0) return null;

        Node tempNode = tail;
        tail = tail.prev;
        tail.next = null;
        tempNode.prev = null;
        length --;

        return tempNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }
}

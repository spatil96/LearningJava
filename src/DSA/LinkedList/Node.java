package DSA.LinkedList;

public class Node {
    Node head;
    String data;
    Node next;
    int size;
    public Node() {
    }

    Node(String data) {
        this.data = data;
        this.next = null; // Since the new node will always point
        // to null reference. As it will be the last in the LL
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("NUll");
    }

    public void delFirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        head = head.next;
    }

    public void delLast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node lastNode = head.next;
        Node secondLastNode = head;
        while (lastNode != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }
    public int getSize(){
        return size;
    }
    //This is an iterative approach
    public void reverseLL(){
        if(head==null || head.next==null){
            System.out.println("Either the list is empty or having one element");
            return;
        }
        Node currNode = head.next;
        Node prevNode = head;
        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode=currNode;
            currNode = nextNode;
        }
        head.next=null;
        head = prevNode;
    }
    //Reversing a linkedList using the recursive approach
    public Node revRecursiveLL(Node node){
        return null;
    }

}

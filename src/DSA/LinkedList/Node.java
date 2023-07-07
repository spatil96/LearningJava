package DSA.LinkedList;

public class Node {
    Node head;
    String data;
    Node next;

    public Node() {
    }

    Node(String data) {
        this.data = data;
        this.next = null; // Since the new node will always point
        // to null reference. As it will be the last in the LL
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node node) {
        this.next = next;
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head ==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head ==null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return ;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.print("NUll");
    }
}

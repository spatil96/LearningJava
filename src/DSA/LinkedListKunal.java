package DSA;

public class LinkedListKunal {
    private Node head;
    private Node tail;
    private int size=0;

    public LinkedListKunal(int size) {
        this.size = 0   ;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }
    }
    public static void main(String[] args) {

    }
}

package DSA.Trees;

import java.util.Scanner;

public class BinarySearchTreeDesign {
    public BinarySearchTreeDesign() {
    }

    private static class Node{
        int value;
        Node left;
        Node right;
        static int height;

        public int getValue() {
            return value;
        }

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public boolean isEmpty(){
        return root ==null;
    }

    public int height(Node node){
        if(node == null){return -1;}
        else return node.height;
    }

    public Node insert(int value,Node node){
        if(node ==null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){
            node.left = insert(value, node.left);
        }
        if(value > node.value){
            node.right = insert(value, node.right);
        }
        Node.height = Math.max(height(node.left), height(node.right))+1;
        return node;
    }
    //insert elements
    public void populate(Scanner scanner){
        System.out.println("Enter the root node value");
        int val = scanner.nextInt();
        root = new Node(val);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter the left of "+node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left of "+node.value);
            int val = scanner.nextInt();
            node.left = new Node(val);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to enter the right of "+node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right of "+node.value);
            int val = scanner.nextInt();
            node.right = new Node(val);
            populate(scanner, node.right);
        }
    }

    public void display(){
        display(root, "Root Node: ");
    }

    private void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details+node.value);
        display(node.left,"Left child of "+ node.getValue()+" : ");
        display(node.right,"Right child of "+ node.getValue()+" : ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTreeDesign tree = new BinarySearchTreeDesign();
        tree.populate(scanner);
        tree.display();
    }
}

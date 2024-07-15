package DSA.Trees;

import java.util.Scanner;

public class BinaryTreeDesign {
    public BinaryTreeDesign() {
    }
    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node root;
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
        display(root, "");
    }
    private void display(Node node, String indent){
        if(node == null){
            return;
        }
        System.out.println(indent+node.value);
        display(node.left, indent+"\t");
        display(node.right, indent+"\t");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTreeDesign tree = new BinaryTreeDesign();
        tree.populate(scanner);
        tree.display();
    }
}

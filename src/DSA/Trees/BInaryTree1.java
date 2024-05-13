package DSA.Trees;

import java.util.LinkedList;
import java.util.Queue;

// Node class to define the structure of the node
class Node {
    int data;
    Node left, right;
    // Parameterized Constructor
    Node(int val) {
        data = val;
        left = right = null;
    }
}

public class BInaryTree1 {
    // Function to insert nodes
    public static Node insert(Node root, int data) {
        // If tree is empty, new node becomes the root
        if (root == null) {
            root = new Node(data);
            return root;
        }
        // Queue to traverse the tree and find the position to
        // insert the node
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            // Insert node as the left child of the parent node
            if (temp.left == null) {
                temp.left = new Node(data);
                break;
            }
            // If the left child is not null push it to the
            // queue
            else
                q.offer(temp.left);
            // Insert node as the right child of parent node
            if (temp.right == null) {
                temp.right = new Node(data);
                break;
            }
            // If the right child is not null push it to the
            // queue
            else
                q.offer(temp.right);
        }
        return root;
    }

    /* function to delete the given deepest node
    (d_node) in binary tree */
    public static void deletDeepest(Node root, Node d_node) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        // Do level order traversal until last node
        Node temp;
        while (!q.isEmpty()) {
            temp = q.poll();
            if (temp == d_node) {
                temp = null;
                d_node = null;
                return;
            }
            if (temp.right != null) {
                if (temp.right == d_node) {
                    temp.right = null;
                    d_node = null;
                    return;
                } else
                    q.offer(temp.right);
            }
            if (temp.left != null) {
                if (temp.left == d_node) {
                    temp.left = null;
                    d_node = null;
                    return;
                } else
                    q.offer(temp.left);
            }
        }
    }

    /* function to delete element in binary tree */
    public static Node deletion(Node root, int key) {
        if (root == null)
            return null;
        if (root.left == null && root.right == null) {
            if (root.data == key)
                return null;
            else
                return root;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        Node temp = new Node(0);
        Node key_node = null;
        // Do level order traversal to find deepest
        // node(temp) and node to be deleted (key_node)
        while (!q.isEmpty()) {
            temp = q.poll();
            if (temp.data == key)
                key_node = temp;
            if (temp.left != null)
                q.offer(temp.left);
            if (temp.right != null)
                q.offer(temp.right);
        }
        if (key_node != null) {
            int x = temp.data;
            key_node.data = x;
            deletDeepest(root, temp);
        }
        return root;
    }

    // Inorder tree traversal (Left - Root - Right)
    public static void inorderTraversal(Node root) {
        if (root == null)
            return;
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    // Preorder tree traversal (Root - Left - Right)
    public static void preorderTraversal(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    // Postorder tree traversal (Left - Right - Root)
    public static void postorderTraversal(Node root) {
        if (root == null)
            return;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    // Function for Level order tree traversal
    public static void levelorderTraversal(Node root) {
        if (root == null)
            return;

        // Queue for level order traversal
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.print(temp.data + " ");
            // Push left child in the queue
            if (temp.left != null)
                q.offer(temp.left);
            // Push right child in the queue
            if (temp.right != null)
                q.offer(temp.right);
        }
    }
    public static void display(Node root){
        if(root==null){return;}
        System.out.print(root.data + "->");
        display(root.right);
        display(root.left);
//        System.out.println("");
    }
    /* Driver function to check the above algorithm. */
    public static void main(String[] args) {
        Node root = null;
        // Insertion of nodes
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);

        System.out.println("Display: ");
        display(root);

        System.out.print("\nPreorder traversal: ");
        preorderTraversal(root);

        System.out.print("\nInorder traversal: ");
        inorderTraversal(root);

        System.out.print("\nPostorder traversal: ");
        postorderTraversal(root);

        System.out.print("\nLevel order traversal: ");
        levelorderTraversal(root);

        // Delete the node with data = 20
        root = deletion(root, 20);

        System.out.print("\nInorder traversal after deletion: ");
        inorderTraversal(root);
    }
}


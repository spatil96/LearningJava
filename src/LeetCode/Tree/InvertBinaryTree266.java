package LeetCode.Tree;

import java.util.LinkedList;
import java.util.Queue;

// TreeNode class definition
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}


 class InvertTree {

    TreeNode invertTreeRecursive(TreeNode root) {

        if (root == null)
            return null;

        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        final Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            final TreeNode node = queue.poll();

            // Swap nodes
            final TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;

            // Add left and right of this node to the queue
            if (node.left != null) queue.add(node.left);

            if (node.right != null) queue.add(node.right);
        }
        return root;
    }

}
// Main driver class
public class InvertBinaryTree266 {

    // Method to create a sample binary tree
    static TreeNode createSampleTree() {
        /*
               1
              / \
             2   3
            / \ / \
           4  5 6  7
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        return root;
    }

    // Method to print the tree using inorder traversal
    static void printInOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.val + " ");
        printInOrder(node.right);
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = createSampleTree();

        // Instantiate the InvertTree class
        InvertTree treeInverter = new InvertTree();

        // Display original tree (inorder traversal)
        System.out.println("Original Tree (Inorder):");
        printInOrder(root);
        System.out.println();

        // Invert the tree recursively
        TreeNode invertedRootRecursive = treeInverter.invertTreeRecursive(root);

        // Display inverted tree (inorder traversal)
        System.out.println("Inverted Tree (Recursive Inorder):");
        printInOrder(invertedRootRecursive);
        System.out.println();

        // Create a new sample tree for iterative inversion
        TreeNode iterativeRoot = createSampleTree();

        // Invert the tree iteratively
        TreeNode invertedRootIterative = treeInverter.invertTree(iterativeRoot);

        // Display inverted tree (inorder traversal)
        System.out.println("Inverted Tree (Iterative Inorder):");
        printInOrder(invertedRootIterative);
        System.out.println();
    }
}

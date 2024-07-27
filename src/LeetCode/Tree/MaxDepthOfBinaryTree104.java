package LeetCode.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepthOfBinaryTree104 {
    public static void main(String[] args) {
        // Creating a sample tree:
        //      3
        //     / \
        //    9  20
        //       / \
        //      15  7
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        MaxDepthOfBinaryTree104 solution = new MaxDepthOfBinaryTree104();
        int maxDepth = solution.maxDepth(root);
        int maxDepthITR = solution.maxDepthITR(root);
        System.out.println("Maximum depth of the binary tree is: " + maxDepth);
        System.out.println("Maximum depth of the binary tree is: " + maxDepthITR);
    }
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
    public int maxDepthITR(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            depth++;
        }

        return depth;
    }
}

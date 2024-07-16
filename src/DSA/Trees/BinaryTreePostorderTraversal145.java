package DSA.Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// Definition for a binary tree node
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode() {
//    }
//
//    TreeNode(int val) {
//        this.val = val;
//    }
//
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}

public class BinaryTreePostorderTraversal145 {
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> output = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            output.push(node);

            // Push left child first (since we want to process right child first)
            if (node.left != null) {
                stack.push(node.left);
            }

            // Push right child
            if (node.right != null) {
                stack.push(node.right);
            }
        }

        while (!output.isEmpty()) {
            res.add(output.pop().val);
        }

        return res;
    }

    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = postorderTraversal(root);

        System.out.println("Postorder Traversal: " + result);
    }
}

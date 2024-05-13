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

public class BinaryTreePreorderTraversal144 {
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            res.add(node.val);

            // Push right child first (since we want to process left child first)
            if (node.right != null) {
                stack.push(node.right);
            }

            // Push left child
            if (node.left != null) {
                stack.push(node.left);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

//        Solution solution = new Solution();
        List<Integer> result = preorderTraversal(root);

        System.out.println("Preorder Traversal: " + result);
    }
}

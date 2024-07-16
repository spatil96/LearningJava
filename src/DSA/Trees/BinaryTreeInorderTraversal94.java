package DSA.Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

// Solution class with inorder traversal method
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorderHelper(root, res);
        return res;
    }

    private void inorderHelper(TreeNode node, List<Integer> res) {
        if (node == null) {
            return;
        }

        // Traverse left subtree
        inorderHelper(node.left, res);

        // Visit current node
        res.add(node.val);

        // Traverse right subtree
        inorderHelper(node.right, res);
    }

    public List<Integer> inorderTraversalIterative(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null){return res;}
        Stack<TreeNode> s= new Stack<TreeNode>();
//        TreeNode node = root;
        while(!s.isEmpty() || root != null){
            if(root != null){
                s.push(root);
                root = root.left;
            }else{
                root = s.pop();
                res.add(root.val);
                root = root.right;
            }
        }
        return res;
    }
    public List<Integer> inorderTraversalTest(TreeNode root) {
        List<Integer> li = new ArrayList<Integer>();
        if(root == null){
            return li;
        }
        inorderTraversal(root.left);
        li.add(root.val);
        inorderTraversal(root.right);
        return li;
    }
}

public class BinaryTreeInorderTraversal94 {
    public static void main(String[] args) {
        // Create a binary tree
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        // Instantiate the Solution class
        Solution solution = new Solution();

        // Perform inorder traversal
//        List<Integer> result = solution.inorderTraversalIterative(root);
        List<Integer> result = solution.inorderTraversalTest(root);

        // Print the result
        System.out.println("Inorder Traversal: " + result);
    }
}

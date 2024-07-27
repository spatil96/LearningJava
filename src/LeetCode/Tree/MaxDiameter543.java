package LeetCode.Tree;
import java.util.*;
public class MaxDiameter543 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

//        Solution solution = new Solution();
        int diameter = diameterOfBinaryTreeRecursive(root);
        int diameterItr = diameterOfBinaryTreeIterative(root);
        System.out.println("The diameter of the binary tree Recursive is: " + diameter);
        System.out.println("The diameter of the binary tree Iterative is: " + diameterItr);
    }
    public static int diameterOfBinaryTreeIterative(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Map<TreeNode, Integer> heightMap = new HashMap<>();
        Stack<TreeNode> stack = new Stack<>();
        Set<TreeNode> visited = new HashSet<>();
        int maxDiameter = 0;

        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.peek();

            if (node == null) {
                stack.pop();
                continue;
            }

            if (visited.contains(node)) {
                stack.pop();
                int leftHeight = heightMap.getOrDefault(node.left, 0);
                int rightHeight = heightMap.getOrDefault(node.right, 0);
                int nodeHeight = 1 + Math.max(leftHeight, rightHeight);
                heightMap.put(node, nodeHeight);
                maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);
            } else {
                visited.add(node);
                stack.push(node.right);
                stack.push(node.left);
            }
        }

        return maxDiameter;
    }

    //Recursive solution
    static int  ans = -1;
    public static int diameterOfBinaryTreeRecursive(TreeNode root){
        dfs(root);
        return ans;
    }
    public static int dfs(TreeNode root){
        if(root == null){return 0;}
        int left = dfs(root.left);
        int right  = dfs(root.right);
        ans = Math.max(ans, left+right);
        return 1+ Math.max(left, right);
    }
}

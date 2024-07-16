package DSA.Trees;

import java.util.List;

public class InvertBinaryTree226 {
    // public TreeNode invertTree(TreeNode root) {
    //       List<Integer> li = new ArrayList<Integer>();
    //     if(root == null){
    //         return root;
    //     }
    //     postOrderHelp(root);
    //     // li.add(root.val);
    //     // inorderTraversal(root.right);
    //     return root;
    // }
    // public static void postOrderHelp(TreeNode root){
    //     if(root == null){return;}
    //     TreeNode tempNode = new TreeNode();
    //     postOrderHelp(root.right);
    //     tempNode = root.left;
    //     root.left = root.right;
    //     root.right = tempNode;
    //     postOrderHelp(root.right);
    // }
    // public TreeNode invertTree(TreeNode root) {
    //     if (root == null)
    //         return null;

    //     TreeNode temp = root.right;
    //     root.right = root.left;
    //     root.left = temp;

    //     invertTree(root.left);
    //     invertTree(root.right);

    //     return root;
    // }
    public static TreeNode invertTree(TreeNode root) {
        if(root==null)
            return null;
        TreeNode left=root.left,right=root.right;
        root.left=invertTree(right);
        root.right=invertTree(left);
        return root;
    }
    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

//        Solution solution = new Solution();
        List<Integer> result = invertTree(root);

        System.out.println("Invert Tree Traversal: " + result);
    }
}

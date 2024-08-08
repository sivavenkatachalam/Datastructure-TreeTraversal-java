import java.util.*;
class TraversalNode{
    int value;
    TreeNode left, right;

    TraversalNode(int value) {
        this.value = value;
        left = right = null;
    }
}

class TraversalInorder {
    public static void inorder(TreeNode node) {
        if (node == null)
            return;
        inorder(node.left);
        System.out.println(node.value+ " ");
        inorder(node.right);
    }
    public static void preorder(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }
    public static void postorder(TreeNode node) {
        if (node == null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.value+ " ");
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(8);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(9);
        root.right.right.right = new TreeNode(10);

        System.out.println("");
        System.out.print("Inorder Traversal: ");
        TraversalInorder.inorder(root);
        
        System.out.println("");
        System.out.print("Pre order Traversal: ");
        TraversalInorder.preorder(root);

        System.out.println("");
        System.out.print("Postorder Traversal: ");
        TraversalInorder.postorder(root);
    }
}

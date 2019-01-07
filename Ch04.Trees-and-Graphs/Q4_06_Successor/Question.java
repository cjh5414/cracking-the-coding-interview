package Q4_06_Successor;

import CtCILibrary.TreeNode;

public class Question {
    private static TreeNode inorderSucc(TreeNode node) {
        if (node.right != null) {
            TreeNode nextNode = node.right;
            while (nextNode.left != null)
                nextNode = nextNode.left;
            return nextNode;
        }
        else {
            TreeNode parent = node.parent;

            while (parent.right == node) {
                node = parent;
                parent = node.parent;
                if (parent == null) return null;
            }
            return parent;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(array);

        root.print();

        for (int i = 0; i < array.length; i++) {
            TreeNode node = root.find(array[i]);
            TreeNode next = inorderSucc(node);
            if (next != null) {
                System.out.println(node.data + "->" + next.data);
            } else {
                System.out.println(node.data + "->" + null);
            }
        }
    }
}

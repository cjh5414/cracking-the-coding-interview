package Q4_04_Check_Balanced;

import Q4_03_List_of_Depths.TreeLibrary.TreeNode;

/**
 * Created by jihun on 2018. 10. 12..
 */
public class Question {
    public static void main() {

    }

    static int checkHeight(TreeNode root) {
        if (root == null) return -1;

        int leftHeight = checkHeight(root.left);
        if (leftHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;

        int rightHeight = checkHeight(root.right);
        if (rightHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;

        if (Math.abs(leftHeight - rightHeight) > 1)
            return Integer.MIN_VALUE;
        else
            return Math.max(leftHeight, rightHeight) + 1;
    }

    static boolean isBalanced(TreeNode root) {
        return checkHeight(root) != Integer.MIN_VALUE;
    }
}

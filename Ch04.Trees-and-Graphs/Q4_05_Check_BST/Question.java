package Q4_05_Check_BST;

import Q4_03_List_of_Depths.TreeLibrary;

/**
 * Created by jihun on 2018. 11. 15..
 */
public class Question {
    boolean checkBST(TreeLibrary.TreeNode root) {
        if (root == null) return true;

        if (root.left != null) {
            if (root.left.val > root.val) return false;
            else if (!checkBST(root.left)) return false;
        }

        if (root.right != null) {
            if (root.right.val < root.val) return false;
            else if (!checkBST(root.right)) return false;
        }

        return true;
    }
}

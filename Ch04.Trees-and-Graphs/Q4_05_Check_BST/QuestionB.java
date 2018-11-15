package Q4_05_Check_BST;

import Q4_03_List_of_Depths.TreeLibrary;

/**
 * Created by jihun on 2018. 11. 15..
 */
public class QuestionB {
    int cur_val = 0;
    boolean checkBST(TreeLibrary.TreeNode root) {
        if (root == null) return true;

        if (!checkBST(root.left)) return false;
        if (cur_val > root.val) return false;
        cur_val = root.val;
        if (!checkBST(root.right)) return false;

        return true;
    }
}

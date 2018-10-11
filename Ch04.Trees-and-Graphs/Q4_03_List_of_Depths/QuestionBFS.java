package Q4_03_List_of_Depths;

import java.util.ArrayList;
import java.util.LinkedList;

import Q4_03_List_of_Depths.TreeLibrary.*;
import static Q4_03_List_of_Depths.TreeLibrary.*;

/**
 * Created by jihun on 2018. 10. 9..
 */
public class QuestionBFS {
    public void main() {
        int[] nodes_flattened = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = createTreeFromArray(nodes_flattened);
        ArrayList<LinkedList<TreeNode>> list = createLevelLinkedList(root);
        printResult(list);
    }

    static ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeLibrary.TreeNode root) {
        ArrayList<LinkedList<TreeNode>> ret = new ArrayList<>();
        LinkedList<TreeNode> current = new LinkedList<>();
        current.add(root);

        while (!current.isEmpty()){
            ret.add(current);
            LinkedList<TreeNode> parents = current;
            current = new LinkedList<>();

            for (TreeNode parent : parents) {
                if (parent.left != null)
                    current.add(parent.left);
                if (parent.right != null)
                    current.add(parent.right);
            }
        }

        return ret;
    }
}

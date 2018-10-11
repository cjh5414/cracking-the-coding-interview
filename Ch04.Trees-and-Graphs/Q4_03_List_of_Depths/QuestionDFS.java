package Q4_03_List_of_Depths;

import java.util.ArrayList;
import java.util.LinkedList;

import Q4_03_List_of_Depths.TreeLibrary.*;
import static Q4_03_List_of_Depths.TreeLibrary.*;
/**
 * Created by jihun on 2018. 10. 10..
 */
public class QuestionDFS {
    public void main() {
        int[] nodes_flattened = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = createTreeFromArray(nodes_flattened);
        ArrayList<LinkedList<TreeNode>> list = createLevelLinkedList(root);
        printResult(list);
    }

    static ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root) {
        ArrayList<LinkedList<TreeNode>> lists = new ArrayList<>();
        createLevelLinkedList(root, lists, 1);
        return lists;
    }

    static void createLevelLinkedList(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level) {
        if (root == null) return;
        if (lists.size() < level)
            lists.add(new LinkedList<>());

        lists.get(level - 1).add(root);
        createLevelLinkedList(root.left, lists, level + 1);
        createLevelLinkedList(root.right, lists, level + 1);
    }
}


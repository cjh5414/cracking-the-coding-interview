package Q4_03_List_of_Depths;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by jihun on 2018. 10. 9..
 */
public class QuestionBFS {
    public void main() {
        int[] nodes_flattened = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeLibrary.TreeNode root = TreeLibrary.createTreeFromArray(nodes_flattened);
        ArrayList<LinkedList<TreeLibrary.TreeNode>> list = createLevelLinkedList(root);
        TreeLibrary.printResult(list);
    }

    static ArrayList<LinkedList<TreeLibrary.TreeNode>> createLevelLinkedList(TreeLibrary.TreeNode root) {
        ArrayList<LinkedList<TreeLibrary.TreeNode>> ret = new ArrayList<>();
        LinkedList<TreeLibrary.TreeNode> queue = new LinkedList<>();
        int count = 1;
        int i = 1;
        LinkedList<TreeLibrary.TreeNode> tmpList = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            TreeLibrary.TreeNode node = queue.remove(0);
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);

            tmpList.add(node);

            if (count == i) {
                ret.add(tmpList);
                tmpList = new LinkedList<>();
                i *= 2;
                count = 0;
            }

            count++;
        }

        return ret;
    }
}

package Q4_03_List_of_Depths;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by jihun on 2018. 10. 10..
 */
public class TreeLibrary {
    static TreeNode createTreeFromArray(int[] array) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        TreeNode node = new TreeNode(array[0]);
        TreeNode head = node;
        int i = 1;
        while (i < array.length) {
            TreeNode newNode = new TreeNode(array[i]);
            if (node.left == null) {
                node.left = newNode;
                queue.add(newNode);
                i++;
            }
            else if (node.right == null) {
                node.right = newNode;
                queue.add(newNode);
                i++;
            }
            else {
                node = queue.remove(0);
            }
        }

        return head;
    }

    static void printResult(ArrayList<LinkedList<TreeNode>> array) {
        int i = 1;
        for (LinkedList<TreeNode> list : array) {
            System.out.print(i + ": ");
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j).val + " ");
            }
            System.out.println();
            i++;
        }
    }

    static void printResult(TreeNode head) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(head);
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove(0);
            System.out.print(node.val + " ");
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
        System.out.println();
    }

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

}

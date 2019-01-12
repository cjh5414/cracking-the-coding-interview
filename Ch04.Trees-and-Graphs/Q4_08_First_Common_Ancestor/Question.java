package Q4_08_First_Common_Ancestor;

import CtCILibrary.TreeNode;

public class Question {
    static TreeNode commonAncestor(TreeNode root, TreeNode n1, TreeNode n2) {
        TreeNode tmp;
        int count1 = 0, count2 = 0;

        tmp = n1;
        while (tmp != root) {
            count1++;
            tmp = tmp.parent;
        }

        tmp = n2;
        while (tmp != root) {
            count2++;
            tmp = tmp.parent;
        }

        if (count1 < count2) {
            for (int i = 0; i < count2 - count1; i++)
                n2 = n2.parent;
        }
        else {
            for (int i = 0; i < count1 - count2; i++)
                n1 = n1.parent;
        }

        while (n1 != n2) {
            n1 = n1.parent;
            n2 = n2.parent;
        }

        return n1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(array);
        TreeNode n3 = root.find(1);
        TreeNode n7 = root.find(7);
        TreeNode ancestor = commonAncestor(root, n3, n7);
        System.out.println(ancestor.data);
    }
}

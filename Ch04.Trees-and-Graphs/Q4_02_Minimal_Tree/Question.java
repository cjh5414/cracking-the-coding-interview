package Q4_02_Minimal_Tree;

public class Question {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 6, 9, 10, 12, 16, 20, 30};

        Node head = createMinimalTree(array, 0, array.length - 1);
        head.print();
        System.out.println("\nDepth : " + head.getDepth());
    }

    static Node createMinimalTree(int[] array, int head, int tail) {
        int count = tail - head + 1;
        if (count < 1) return null;

        int midIdx = head + count / 2;
        Node node = new Node(array[midIdx]);

        if (count == 1) return node;
        else if (count == 2) node.left = new Node(array[head]);
        else {
            node.left = createMinimalTree(array, head, midIdx - 1);
            node.right = createMinimalTree(array, midIdx + 1, tail);
        }

        return node;
    }

    static class Node {
        int val;
        Node left, right;

        Node (int val) {
            this.val = val;
        }

        void print() {
            if (left != null) left.print();
            System.out.print(val + " ");
            if (right != null) right.print();
        }

        int getDepth() {
            int count = 0;
            Node n = this;
            while (n != null) {
                n = n.left;
                count++;
            }

            return count;
        }
    }
}
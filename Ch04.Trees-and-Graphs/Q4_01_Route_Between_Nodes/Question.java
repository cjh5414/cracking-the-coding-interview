package Q4_01_Route_Between_Nodes;

import java.util.ArrayList;
import java.util.LinkedList;

public class Question {
    public enum State {
        Unvisited, Visited, Visiting;
    }

    public static void main(String[] args) {
        Graph g = new Graph();
        Node[] nodes = new Node[5];

        for (int i = 0; i < 5; i++) {
            Node n = new Node(i);
            g.add(n);
            nodes[i] = n;
        }

        g.addDirection(0, 1);
        g.addDirection(0, 3);
        g.addDirection(0, 4);

        g.addDirection(2, 3);
        g.addDirection(2, 4);


        System.out.println(g.getNode(0) + " - " + g.getNode(1));
        System.out.println(g.isDirected(nodes[0], nodes[1]));
        System.out.println(g.getNode(0) + " - " + g.getNode(2));
        System.out.println(g.isDirected(nodes[0], nodes[2]));
        System.out.println(g.getNode(2) + " - " + g.getNode(3));
        System.out.println(g.isDirected(nodes[2], nodes[3]));
    }

    static class Graph {
        ArrayList<Node> nodes = new ArrayList<>();

        void add(Node node) {
            nodes.add(node);
        }

        void addDirection(int src, int dst) {
            nodes.get(src).addDirection(nodes.get(dst));
        }

        Node getNode(int i) {
            return nodes.get(i);
        }

        boolean isDirected(Node a, Node b) {
            LinkedList<Node> q = new LinkedList<>();

            for (Node n : nodes) {
                n.state = State.Unvisited;
            }

            q.add(a);

            while(!q.isEmpty()) {
                Node tmp = q.remove();
                if (tmp.state == State.Visited) continue;
                if (tmp == b) return true;
                else {
                    tmp.state = State.Visited;
                    for (Node c : tmp.getChildren())
                        q.add(c);
                }
            }

            return false;
        }
    }

    static class Node {
        int val;
        public Question.State state;
        ArrayList<Node> children= new ArrayList<>();

        Node(int val) {
            this.val = val;
        }

        void addDirection(Node node) {
            children.add(node);
        }

        ArrayList<Node> getChildren() {
            return children;
        }

        @Override
        public String toString() {
            return "" + val;
        }
    }
}
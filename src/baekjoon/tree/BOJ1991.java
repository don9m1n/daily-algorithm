package baekjoon.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 트리 순회
public class BOJ1991 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        TreeOrderClass tree = new TreeOrderClass();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String data = st.nextToken();
            String left = st.nextToken();
            String right = st.nextToken();

            tree.createNode(data, left, right);
        }

        tree.preOrder(tree.root);
        System.out.println();
        tree.inOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
    }

    static class TreeOrderClass {
        public Node root = null; // 초기 root 노드는 null

        public void createNode(String data, String leftData, String rightData) {
            if (root == null) { // 루트가 비어있다면(첫 번째 노드가 들어오는 경우)
                root = new Node(data);

                // 자식 노드가 있는 경우("."이 아닌 경우)
                if (!leftData.equals(".")) {
                    root.left = new Node(leftData);
                }
                if (!rightData.equals(".")) {
                    root.right = new Node(rightData);
                }
            }
            else { // 초기 노드가 아니라면 부모 노드 서치
                searchNode(root, data, leftData, rightData);
            }
        }

        public void searchNode(Node node, String data, String leftData, String rightData) {
            if (node == null) {
                return;
            } else if (node.data.equals(data)) { // 트리에 data와 같은 이름을 가진 노드가 있는 경우
                if (!leftData.equals(".")) {
                    node.left = new Node(leftData);
                }
                if (!rightData.equals(".")) {
                    node.right = new Node(rightData);
                }
            } else { // 아직 탐색할 노드가 남아있는 경우 재귀로 탐색
                searchNode(node.left, data, leftData, rightData);
                searchNode(node.right, data, leftData, rightData);
            }
        }

        // 전위 : Root -> Left -> Right
        public void preOrder(Node node) {
            if (node != null) {
                System.out.print(node.data);
                if(node.left != null) preOrder(node.left);
                if(node.right != null) preOrder(node.right);
            }

        }

        // 중위 : Left -> Root -> Right
        public void inOrder(Node node) {
            if (node != null) {
                if(node.left != null) inOrder(node.left);
                System.out.print(node.data);
                if(node.right != null) inOrder(node.right);
            }
        }

        // 후위 : Left -> Right -> Root
        public void postOrder(Node node) {
            if (node != null) {
                if(node.left != null) {
                    postOrder(node.left);
                }
                if(node.right != null) {
                    postOrder(node.right);
                }
                System.out.print(node.data);
            }
        }
    }

    static class Node {
        String data;
        Node left;
        Node right;

        public Node(String data) {
            this.data = data;
        }
    }
}
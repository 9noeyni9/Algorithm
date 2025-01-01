import java.io.*;

public class Main {
    
    static class Node {
        char value;
        Node left;
        Node right;
        
        Node(char value, Node left, Node right){
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
    
    static Node head = new Node('A', null, null);
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < N; i++) {
            String[] array = br.readLine().split(" ");
            char root = array[0].charAt(0);
            char left = array[1].charAt(0);
            char right = array[2].charAt(0);
            insertNode(head, root, left, right);
        }
        preOrder(head);
        System.out.println();
        inOrder(head);
        System.out.println();
        postOrder(head);
    }
    
    static void insertNode(Node temp, char root, char left, char right) {
        if(temp.value == root) {
            temp.left = left == '.' ?  null : new Node(left, null, null);
            temp.right = right == '.' ? null : new Node(right, null, null);
        } else {
            if(temp.left != null) 
                insertNode(temp.left, root, left, right);
            if(temp.right != null)
                insertNode(temp.right, root, left, right);
        }
    }
    
    static void preOrder(Node node) {
        if(node == null) return;
        System.out.print(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }
    
    static void inOrder(Node node) {
        if(node == null) return;
        inOrder(node.left);
        System.out.print(node.value);
        inOrder(node.right);
    }
    
    static void postOrder(Node node) {
        if(node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value);
    }
}
package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BT_7_Insertion {
    NodeBT root;
    BT_7_Insertion(){
        this.root = null;
    }
    public void Insert(int key){
//level search if we find a node with null left or right node then insert it there
        if (root == null) {
            root = new NodeBT(key);
            return;
        }
        Queue<NodeBT> queue = new LinkedList<>();
        NodeBT newNode = new NodeBT(key);
        queue.add(root);
        while (!queue.isEmpty()){
            NodeBT temp = queue.poll();
            if (temp.left == null) {
                temp.left = newNode;
                break;
            } else {
                queue.add(temp.left);
            }

            // If right child is empty, insert the new node here
            if (temp.right == null) {
                temp.right = newNode;
                break;
            } else {
                queue.add(temp.right);
            }
        }
    }
    public void Inorder(NodeBT node){
        if(node==null) return;
        Inorder(node.left);
        System.out.print(node.data+" ");
        Inorder(node.right);
    }
    public static void main(String[] args) {
        BT_7_Insertion tree = new BT_7_Insertion();
        tree.root = new NodeBT(2);
        tree.root.left = new NodeBT(3);
        tree.root.right = new NodeBT(4);
        tree.root.left.left = new NodeBT(5);
        tree.Inorder(tree.root);
        int key = 90;
        tree.Insert(key);

        System.out.print("Inorder traversal after insertion: ");
        tree.Inorder(tree.root);
        System.out.println();
    }

}

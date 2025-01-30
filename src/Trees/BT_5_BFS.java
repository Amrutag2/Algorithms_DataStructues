package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//QUEUE DATA STRUCTURE FOR Breadth first search
public class BT_5_BFS {
    NodeBT root;
    BT_5_BFS(){
        this.root=null;
    }
    void Bfs(NodeBT node){
        Queue queue = new LinkedList();
        queue.add(node);
        while (!queue.isEmpty()){
            NodeBT curr = (NodeBT) queue.poll();
            System.out.print(curr.data + " ");
            if (curr.left != null) {
                queue.add(curr.left);
            }
            if (curr.right != null) {
                queue.add(curr.right);
            }
        }

    }
    public static void main(String[] args) {
        BT_5_BFS tree = new BT_5_BFS();
        tree.root = new NodeBT(45);
        tree.root.left = new NodeBT(64);
        tree.root.left.right = new NodeBT(46);
        tree.root.left.right.left = new NodeBT(25);
        tree.root.right = new NodeBT(76);
        tree.root.right.right = new NodeBT(79);
        tree.root.right.right.left = new NodeBT(80);
        tree.Bfs(tree.root);
    }
}

package Trees;

import java.util.Stack;

//StacK Data Structure for DFS
public class BT_6_DFS {
    NodeBT root;
    BT_6_DFS(){
        root = null;
    }
    void Dfs(NodeBT node){
        Stack<NodeBT> stk = new Stack<>();
        stk.push(node);
        while(!stk.empty()){
            NodeBT curr = (NodeBT) stk.pop();
            System.out.print(curr.data + " ");
            if (curr.right != null) {
                stk.push(curr.right);
            }
            if (curr.left != null) {
                stk.push(curr.left);
            }

        }


    }
    public static void main(String[] args) {
        BT_6_DFS tree =  new BT_6_DFS();
        tree.root = new NodeBT(45);
        tree.root.left = new NodeBT(64);
        tree.root.left.right = new NodeBT(46);
        tree.root.left.right.left = new NodeBT(25);
        tree.root.right = new NodeBT(76);
        tree.root.right.right = new NodeBT(79);
        tree.root.right.right.left = new NodeBT(80);
        tree.Dfs(tree.root);
    }
}

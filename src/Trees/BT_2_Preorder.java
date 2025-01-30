package Trees;

public class BT_2_Preorder {
    NodeBT root;
    BT_2_Preorder(){
        root = null;
    }
    void PreOrder(NodeBT node){
        if (node == null)
            return;
        System.out.print(node.data+" ");
        PreOrder(node.left);
        PreOrder(node.right);
    }

    public static void main(String[] args) {
        BT_2_Preorder tree = new BT_2_Preorder();

        tree.root = new NodeBT(23);
         tree.root.left = new NodeBT(79);
        tree.root.left.right = new NodeBT(19);
        tree.root.right = new NodeBT(89);
        tree.root.right.left = new NodeBT(9);
        System.out.println("Preorder traversal of binary tree is: ");
        tree.PreOrder(tree.root);
    }
}

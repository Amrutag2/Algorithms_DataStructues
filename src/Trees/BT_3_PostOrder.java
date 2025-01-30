package Trees;

public class BT_3_PostOrder {
    NodeBT root;

    BT_3_PostOrder(){
        root = null;
    }
    void PostOrder(NodeBT node){
        if(node==null) return;
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.data+" ");
    }


    public static void main(String[] args) {
        BT_3_PostOrder tree = new BT_3_PostOrder();
        tree.root = new NodeBT(34);
        tree.root.left = new NodeBT(41);
        tree.root.left.left = new NodeBT(45);
        tree.root.right = new NodeBT(49);
        tree.root.left.right = new NodeBT(42);
        tree.PostOrder(tree.root);


    }

}

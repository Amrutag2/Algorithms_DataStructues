package Trees;

public class BT_4_Inorder {
    NodeBT root;
   BT_4_Inorder(){
       root = null;
   }
   void Inoder(NodeBT node){
       if(node==null) return;
       Inoder(node.left);
       System.out.print(node.data+" ");
       Inoder(node.right);
   }

    public static void main(String[] args) {
        BT_4_Inorder tree = new BT_4_Inorder();
        tree.root = new NodeBT(45);
//        tree.root.left = new NodeBT(64);
//        tree.root.left.right = new NodeBT(46);
//        tree.root.left.right.left = new NodeBT(25);
//        tree.root.right = new NodeBT(76);
//        tree.root.right.right = new NodeBT(79);
//        tree.root.right.right.left = new NodeBT(80);
        tree.root = new NodeBT(11);
        tree.root.left = new NodeBT(9);
        tree.root.right = new NodeBT(10);
        tree.root.left.left = new NodeBT(80);
        tree.root.left.left.right = new NodeBT(90);
        tree.root.right.left = new NodeBT(12);
        tree.root.right.left.right = new NodeBT(14);
        tree.root.right.right = new NodeBT(13);
        tree.Inoder(tree.root);


    }
}

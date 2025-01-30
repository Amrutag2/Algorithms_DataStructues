package Trees;

public class BT_14_NoOfLeafofLeftSubtree {
    NodeBT root;
    BT_14_NoOfLeafofLeftSubtree(){
        this.root =null;
    }
    public int LeftSubtree(NodeBT node){
        if(node==null){
            return 0;
        }
        if(node.left==null && node.right==null){
            return 1;
        }
        node=node.left;
        int l = LeftSubtree(node.left);
        int r = LeftSubtree(node.right);
        return l+r;
    }
    public static void main(String[] args) {
        BT_14_NoOfLeafofLeftSubtree tree = new BT_14_NoOfLeafofLeftSubtree();
        tree.root=new NodeBT(56);
        tree.root.left = new NodeBT(78);
        tree.root.right=new NodeBT(56);
        tree.root.left.right = new NodeBT(8);
        tree.root.left.right.left = new NodeBT(18);
        tree.root.left.right.left.right = new NodeBT(80);
        System.out.println(tree.LeftSubtree(tree.root));
    }
}

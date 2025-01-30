package Trees;

public class BT_12_NoOfLeafNodes {
    NodeBT root;
    BT_12_NoOfLeafNodes(){
        this.root=null;
    }
    public int LeafNodes(NodeBT node){
        if(node==null){
            return 0;
        }
        if(node.left==null && node.right==null){
            return 1;
        }
        return (LeafNodes(node.left)+LeafNodes(node.right));
    }
    public static void main(String[] args) {
        BT_12_NoOfLeafNodes tree = new BT_12_NoOfLeafNodes();
        tree.root=new NodeBT(56);
        tree.root.left = new NodeBT(78);
        tree.root.right=new NodeBT(56);
        tree.root.left.left = new NodeBT(8);
        tree.root.left.left.left = new NodeBT(18);
        tree.root.left.left.right = new NodeBT(80);
        System.out.println(tree.LeafNodes(tree.root));
    }
}

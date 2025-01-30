package Trees;

public class BT_13_LeftSubtreeHeigth {
    NodeBT root;
    BT_13_LeftSubtreeHeigth(){
        this.root=null;
    }
    public int LeftSubHeigth(NodeBT node){
        if(node==null){
            return 0;
        }
        if(node.left==null && node.right==null)
        {
            return 0;
        }
        if(root==node){
            node=node.left;
        }
        return 1+Math.max(LeftSubHeigth(node.left),LeftSubHeigth(node.right));
    }
    public static void main(String[] args) {
        BT_13_LeftSubtreeHeigth tree = new BT_13_LeftSubtreeHeigth();
        tree.root=new NodeBT(56);
        tree.root.left = new NodeBT(78);
        tree.root.right=new NodeBT(56);
        tree.root.left.right = new NodeBT(8);
        tree.root.left.right.left = new NodeBT(18);
        tree.root.left.right.left.right = new NodeBT(80);
        System.out.println(tree.LeftSubHeigth(tree.root));
    }
}

package Trees;

public class BT_11_Level {
    NodeBT root;
    BT_11_Level(){
        this.root = null;
    }
    public int LevelOfBT(NodeBT node){
        if(node==null){
            return 0;
        }
        if(node.left==null&&node.right==null){
            return 1;
        }
        return 1+Math.max(LevelOfBT(node.left),LevelOfBT(node.right));

    }
    public static void main(String[] args) {
        BT_11_Level tree = new BT_11_Level();
        tree.root=new NodeBT(56);
        tree.root.left = new NodeBT(78);
        tree.root.right=new NodeBT(56);
        tree.root.left.left = new NodeBT(8);
        tree.root.left.left.left = new NodeBT(18);
        System.out.println(tree.LevelOfBT(tree.root));
    }
}

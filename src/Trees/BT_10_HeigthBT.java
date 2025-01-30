package Trees;

public class BT_10_HeigthBT {
    NodeBT root;
    BT_10_HeigthBT(){
        this.root = null;
    }


    public int Heigth(NodeBT node){
        if(node==null){
            return 0;
        }
        if(node.left==null&&node.right==null){
            return 0;
        }
        return 1+Math.max(Heigth(node.left),Heigth(node.right));
    }
    public static void main(String[] args) {
        BT_10_HeigthBT tree = new BT_10_HeigthBT();
        tree.root=new NodeBT(56);
        tree.root.left = new NodeBT(78);
        tree.root.right=new NodeBT(56);
        tree.root.left.left = new NodeBT(8);
        tree.root.left.left.left = new NodeBT(18);
        System.out.println(tree.Heigth(tree.root));


    }
}

package Trees;

public class BT_8_Searching {
    NodeBT root;
    BT_8_Searching(){
        this.root= null;
    }
    public boolean SearchDFS(NodeBT root, int key){
        if (root == null) return false;
        if (root.data == key) return true;
        boolean left_res = SearchDFS(root.left, key);
        boolean right_res = SearchDFS(root.right, key);

        return left_res || right_res;
    }
    public static void main(String[] args) {
       BT_8_Searching tree =  new BT_8_Searching();
        tree.root = new NodeBT(45);
        tree.root.left = new NodeBT(64);
        tree.root.left.right = new NodeBT(46);
        tree.root.left.right.left = new NodeBT(25);
        tree.root.right = new NodeBT(76);
        tree.root.right.right = new NodeBT(79);
        tree.root.right.right.left = new NodeBT(80);

        System.out.println(tree.SearchDFS(tree.root,25));
    }
}

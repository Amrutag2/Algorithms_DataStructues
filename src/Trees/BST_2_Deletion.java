package Trees;

public class BST_2_Deletion {
    NodeBT delNode(NodeBT root,int x){
        if(root==null){
            return root;
        }
        if(root.data>x){
            root.left = delNode(root.left,x);
        } else if (root.data<x) {
            root.right = delNode(root.right,x);
        }else {
            // If root matches with the given key
            // Cases when root has 0 children or
            // only right child
            if (root.left == null) {
                return root.right;
            }

            // When root has only left child
            if (root.right == null) {
                return root.left;
            }

            // When both children are present
            NodeBT succ = getSuccessor(root);
            root.data = succ.data;
            root.right = delNode(root.right, succ.data);
        }
        return root;
    }
    NodeBT getSuccessor(NodeBT curr) {
        curr = curr.right;
        while (curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }
    void inorder(NodeBT root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        BST_2_Deletion tree = new BST_2_Deletion();
        NodeBT root = new NodeBT(10);
        root.left = new NodeBT(5);
        root.right = new NodeBT(15);
        root.right.left = new NodeBT(12);
        root.right.right = new NodeBT(18);

        int x = 15;
        root = tree.delNode(root, x);
        tree.inorder(root);
    }
}

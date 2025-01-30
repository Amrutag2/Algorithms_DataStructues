package Trees;



public class BST_1_BasicsOp {
    public NodeBT Search(NodeBT root,int key){
        if(root==null||key == root.data){
            return root;
        }
        if(root.data>key){
            return Search(root.left,key);
        }
        return Search(root.right,key);
    }

    public NodeBT InsertNode(NodeBT node, int key){
        if(node==null){
            return new NodeBT(key);

        }
        else{
            //If the key is already present in the tree,
            // return the node
            if(key==node.data){
                return node;
            }
            if(node.data>key){
                 node.left = InsertNode(node.left,key);
            }
            else{
                node.right= InsertNode(node.right,key);
            }
        }
        return node;
    }
    public static void inorder(NodeBT node){
        if(node!=null){
            inorder(node.left);
            System.out.println(node.data+" ");
            inorder(node.right);
        }
    }
    public static void main(String[] args) {
        BST_1_BasicsOp tree = new BST_1_BasicsOp();
        NodeBT root = null;
        root = tree.InsertNode(root,45);
        root = tree.InsertNode(root,78);
        root = tree.InsertNode(root,57);
        root = tree.InsertNode(root,9);
        root = tree.InsertNode(root,8);
        root = tree.InsertNode(root,5);
        inorder(root);

        System.out.println(tree.Search(root, 5) != null
                ? "Found"
                : "Not Found");


    }
    static NodeBT insert(NodeBT root, int x) {
        //using while loop
        NodeBT temp = new NodeBT(x);

        // If tree is empty
        if (root == null) {
            return temp;
        }

        // Find the node who is going to have
        // the new node temp as its child
        NodeBT parent = null;
        NodeBT curr = root;
        while (curr != null) {
            parent = curr;
            if (curr.data > x) {
                curr = curr.left;
            } else if (curr.data < x) {
                curr = curr.right;
            } else {
                return root; // Key already exists
            }
        }

        // If x is smaller, make it left
        // child, else right child
        if (parent.data > x) {
            parent.left = temp;
        } else {
            parent.right = temp;
        }
        return root;
    }

}

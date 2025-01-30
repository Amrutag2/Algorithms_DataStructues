package Trees;


import java.util.LinkedList;
import java.util.Queue;

//Then replace the node’s value with the value of the
// last node in the tree (found by traversing to the rightmost leaf),
// and then delete that last node.
public class BT_9_Deletion {
    NodeBT root;
    BT_9_Deletion(){
        this.root =null;
    }
    public NodeBT DeleteNodeBT(NodeBT node, int key){
        if(node == null) return null;
        //using BFS approach -queue
        Queue<NodeBT> queue = new LinkedList<>();
        NodeBT target = null;
        queue.add(root);
        while(!queue.isEmpty()){
            NodeBT current = queue.poll();
            if(current.data==key){
                target = current;
                break;
            }
            if(current.left!=null){
                queue.add(current.left);
            }
            if(current.right!=null){
                queue.add(current.right);
            }
        }
        if(target==null) return null;
//        if(target.left!=null && target.left.left==null && target.left.right==null){
//            NodeBT ChildL = target.left;
//            target.data = ChildL.data;
//            target.left=null;
//            return target;
//        }
//        if(target.right!=null && target.right.left==null && target.right.right==null){
//            NodeBT ChildL = target.right;
//            target.data = ChildL.data;
//            target.right=null;
//            return target;
//        }
        NodeBT Targetparent = null;
        NodeBT TargetChild = null;
        Queue<NodeBT> queueParent = new LinkedList<>();
        queueParent.add(null);
        Queue<NodeBT> queueChild = new LinkedList<>();
        queueChild.add(root);
        while(!queueChild.isEmpty()){
            NodeBT current = queueChild.poll();
            NodeBT parent = queueParent.poll();
            TargetChild = current;
            Targetparent =parent;
            if(current.left!=null){
                queueChild.add(current.left);
                queueParent.add(current);
            }
            if(current.right!=null){
                queueChild.add(current.right);
                queueParent.add(current);
            }
        }
        target.data = TargetChild.data;
        //remove last Node
        if(Targetparent!=null){
            if(Targetparent.left==TargetChild){
                Targetparent.left=null;
            }
            else{
                Targetparent.right=null;
            }
        }
        return root;

    }
    public void Inorder(NodeBT node){
        if(node==null) return;
        Inorder(node.left);
        System.out.print(node.data+" ");
        Inorder(node.right);
    }
    public static void main(String[] args) {
        BT_9_Deletion tree  = new BT_9_Deletion();
        tree.root = new NodeBT(11);
        tree.root.left = new NodeBT(9);
        tree.root.right = new NodeBT(10);
        tree.root.left.left = new NodeBT(80);
        tree.root.left.left.right = new NodeBT(90);
        tree.root.right.left = new NodeBT(12);
        tree.root.right.left.right = new NodeBT(14);
        tree.root.right.right = new NodeBT(13);
        tree.Inorder(tree.DeleteNodeBT(tree.root,9));



    }
}

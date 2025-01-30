package Trees;

public class BT_1_CreateBinaryTree {
    public static void main(String[] args) {
       NodeBT firstNd = new NodeBT(6);
        NodeBT SecondNd = new NodeBT(5);
        NodeBT thirdNd = new NodeBT(3);
        NodeBT furthNd = new NodeBT(16);
        firstNd.left = SecondNd;
        firstNd.right = thirdNd;
        thirdNd.left = furthNd;


    }
}

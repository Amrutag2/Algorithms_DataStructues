package Algorithms;
//complemxity o((2^n)-1)
public class Algo_4_Recursion_TowerOfHanoi {
    public static void towerOfHanoi(int n, String src, String helper, String desc){
        if(n==1){
            System.out.println("transfer disk "+n+" from "+src+" to "+desc);
            return;
        }
        towerOfHanoi(n-1,src,desc,helper);
        System.out.println("transfer disk "+n+" from "+src+" to "+desc);
        towerOfHanoi(n-1,helper,src,desc);
    }
    public static void main(String[] args) {
        int  n = 3;
        towerOfHanoi(n,"s","h","d");
    }
}

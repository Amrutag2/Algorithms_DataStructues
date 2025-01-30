public class CWH_23_FORloop {
    public static void main(String[] args) {

        for(int i=1;i<11;i++){
            System.out.println(i);
        }
        // 2n even numbers 0,2,4,6,8
        // 2n+1 = odd numbers 1,3,5,7,9
        int n =5;
        for (int i=0;i<n;i++){
            System.out.println(2*i+1);
        }
        //WAP to print first n natural number in reverse order
        int m = 20;
        for (int i =m;i>0;i--){
            System.out.println(i);
        }
    }
}

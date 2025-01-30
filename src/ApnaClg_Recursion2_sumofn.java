public class ApnaClg_Recursion2_sumofn {
    //Print sum of first n natural numbers

    public static void Sum(int i,int n,int sum){
        if(i==n){
            sum += i ;
            System.out.println(sum);

        }
        else {
            sum += i ;
            Sum(i+1,n,sum);
        }


    }
    public static int Summ(int n){
        if(n==0 || n==1){
            return n;
        }
        else return n+Summ(n-1);
    }

    public static void main(String[] args) {
        Sum(1,10,0);
        System.out.println(Summ(10));
    }
}

public class CWH_25_PRACTISE {
    public static void main(String[] args) {
        //practise problem
//        for(int i=4;i>0;i--){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println("\n");
//        }

        //practise problem 2 sum of 1st n even numbers using while loop

        int sum = 0;
        for(int n=0;n<=10;n++){
            sum = sum+n;
            // here for n-  sum of natural number
            // 2*n - sum of even natural number
            // 2*n+1 - sum of odd natural number
        }
        System.out.println(sum);

        //problem 3
        int mul = 5; //mulriplication table of 5
        int multi = 0;
        for(int n=0;n<=10;n++){
            multi  = mul*n;
            System.out.println(multi);
            // here for n-  sum of natural number
            // 2*n - sum of even natural number
            // 2*n+1 - sum of odd natural number
        }

        //problem 4
        int revmul = 5; //reverse mulriplication table of 5
        int reverse_multi = 0;
        for(int n=10;n>0;n--){
            reverse_multi  = mul*n;
            System.out.println(reverse_multi);
            // here for n-  sum of natural number
            // 2*n - sum of even natural number
            // 2*n+1 - sum of odd natural number
        }

        //factorial sing for loop
        int fact=1;
        for(int i = 1;i<=10;i++){
            fact = fact*i;
            System.out.println(fact);
        }

        //factorial sing while loop
        int j=1;int factorial =1;
        while(j<=10){
            factorial = factorial*j;
            j++;
            System.out.println(factorial);
        }
        //sum of 8's multiple
        int mul1 = 8; //mulriplication table of 5
        int sum1 = 0;
        for(int n=0;n<=10;n++){
            sum1 += mul1*n;
        }
        System.out.println(sum1);
    }
}

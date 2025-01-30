package data_structures;

public class Number_11_PalindromeWithRange {
    public static void main(String[] args){
        int l_range = 10;
        int h_range = 100;


        for(int i =l_range;i<h_range;i++){
            int mid = i;
            int rem=0;
            while(mid>0){
                int n = mid%10;
                rem = rem*10+n;
                mid/=10;
            }
            if(i==rem){
                System.out.println("Palindrome "+i);
            }

        }
    }
}


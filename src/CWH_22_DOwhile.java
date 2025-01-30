public class CWH_22_DOwhile {
    public static void main(String[] args) {
        // this loop is similar to a while loop except the fact that it guaranteed to execute at least once
        int i = 5;
        do {                         //do will not check the value of i no any condition checked
            System.out.println(i);
            i--;
        }while (i>2);                //here 1st condition checked
    }
}

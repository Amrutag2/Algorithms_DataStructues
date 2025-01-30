public class CWH_31_METHODS2 {
    static void change1(int a){
        a = 56;
    }
    static void change2(int [] arr){
        arr[1] = 56;
    }
    public static void main(String[] args) {
        int [] marks = {23,45,67,78,89};
        int x = 45;
        //case 1: changing integer
        change1(x);
        System.out.println("value of x after change "+x);
        //case 2:
        change2(marks);
        System.out.println(marks[1]);
    }
}

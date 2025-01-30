public class CHW_09_CH2_PRECENDENCE {
    public static void main(String[] args) {
        int m = 6*5+74/2;
        int n = 60/5-34*2;
        //* and / has highest precendence thus further they are evaluated as left to right
        System.out.println(m);
        System.out.println(n);
        // a=b=45 then 1st b= 45 then a=45
        //quiz
        int x =5;int y=10;int z=2;
        //int k = x*y/2;
        int a =5;int b=10;int c=2;
        int k = (b*b - (4*a*c))/(2*a);
        System.out.println(k);

    }
}

public class CWH_31_Methods {
    static void state(){
        System.out.println("This event was fun!!!");
    }
    static int sum(int x, int y){
        int z=0;
        if(x>y){
            z= x+y;
        }
        else {
            z = x*y;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 7;
        int b = 16;
        int c;
        //if statics keyword is not used for method creation
        CWH_31_Methods Obj = new CWH_31_Methods();  //method invocation using object creation
        c = Obj.sum(a,b);

        c = sum(a,b);
        state();
        System.out.println(c);

    }
}

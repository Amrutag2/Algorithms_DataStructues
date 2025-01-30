/*Annotations in java : used to provide extra information about a program annotations provides metadata to class/
49 video ref phone
1)override
2)SuppressWarnings
3)deprecated
4)FunctionalInterface : interfaces that contains only a single interface
 */
@FunctionalInterface
 interface myFunctionalInterface{
    void thisMethod();
    //void thisMethod3();
}
class NewPhone extends Phone{
    @Override
    public void Greet() {
        super.Greet();
        System.out.println("newphone overrided greet");
    }
    @Deprecated
    public int sum(int a , int b) {
        return a+b;
    }
}
public class CWH_108_JavaAnnotations {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewPhone nw = new NewPhone();
        nw.Greet();

        System.out.println(nw.sum(4,6));
    }
}

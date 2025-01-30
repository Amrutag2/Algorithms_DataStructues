interface sampleInterface{
    void meth1();
    void meth2();

}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();

}
class MysampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println(" meth1");
    }
    public void meth2(){
        System.out.println(" meth2");
    }
    public void meth3(){
        System.out.println(" meth3");
    }
    public void meth4(){
        System.out.println(" meth4");
    }
}

public class CWH_58_INHERITANCE_IN_INTERFACES {
    public static void main(String[] args) {
        MysampleClass SC = new MysampleClass();
        SC.meth1();
        SC.meth3();
        SC.meth4();
    }
}

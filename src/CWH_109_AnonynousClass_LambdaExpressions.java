interface Demo{
    void video(int a);
    //void photos();
}
class HarryFunc implements Demo{
    public void video(int i){
        System.out.println("harryfunc");
    }

}
//class AnonyDemo implements demo {
//    @Override
//    public void video(){
//        System.out.println("i m video");
//    }
//    @Override
//    public void photos(){
//        System.out.println("i m photos");
//    }
//    public void display(){
//        System.out.println("helllo");
//    }
//}
public class CWH_109_AnonynousClass_LambdaExpressions {


    public static void main(String[] args) {
//        Demo ad = new Demo() {
//            @Override
//            public void video() {
//                System.out.println("v");
//            }
//
//            @Override
//            public void photos() {
//                System.out.println("p");
//            }
//        };
//        ad.video();


        //lambda expression
//        Demo d = new HarryFunc();
//        d.video();

        //lambda expression
        Demo obj = (a)->{
            System.out.println("hello"+a);
        };
        obj.video(5);


    }
}

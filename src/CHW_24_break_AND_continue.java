public class CHW_24_break_AND_continue {
    public static void main(String[] args) {
        //break and continue using loops
        for(int i=0 ;i<5;i++){
            if(i==2){
                System.out.println("ending the loop");
                //break;
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
        }
        System.out.println("i am out beacuse of break");
    }
}

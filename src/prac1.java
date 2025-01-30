public class prac1 {
    public static void main(String[] args) {
        String x = "sadbutsad";
        String y = "sad";

        int index = -1;


        for(int j = 0;j<x.length();j++){
            char s = x.charAt(j);
            for (int i = 0; i < y.length() ; i++) {
                char ch = y.charAt(i);
                System.out.println("compare"+" "+ch+"and"+s);

                if(s==ch && index==-1){
                    index = j;
                    continue;
                }else if(s==ch && index!=-1){

                    continue;
                } else{
                    index=-1;
                    break;

                }
            }
        }
        System.out.println(index);

    }
}

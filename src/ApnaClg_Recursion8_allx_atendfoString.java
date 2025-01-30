//Move all x at the end of the string
//eg "abxbdxcxs" == "abbdcsxxx"
//0(n+count)==0{2n}=o(n)

public class ApnaClg_Recursion8_allx_atendfoString {

    public static void Processx(int index, char c, String str,String newStr,int count ){

        if(index == str.length()){
            for (int i = 0; i < count; i++) {
                newStr += c;
            }
            System.out.println(newStr);
            return ;
        }
        char ch = str.charAt(index);
        if(ch==c){
            count++;
            Processx(index+1, c, str,newStr,count);
        }
        else {
            newStr += ch;
            Processx(index+1, c, str,newStr,count);
        }

    }
    public static void main(String[] args){
        Processx(0,'b',"aabsabacc","",0);

    }

}

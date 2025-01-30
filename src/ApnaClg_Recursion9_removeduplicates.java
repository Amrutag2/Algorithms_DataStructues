//O(n)

public class ApnaClg_Recursion9_removeduplicates {
    public static boolean []Arr = new boolean[26];
    public static void removeDup( String Str, int index , String newStr){
        if(index == Str.length()){
            System.out.println(newStr);
            return;
        }
        char ch = Str.charAt(index);
        if(Arr[ch-'a']==true){
            removeDup( Str,index+1, newStr);
        }
        else {
            Arr[ch-'a']=true;
            newStr += ch;
            removeDup( Str,index+1, newStr);
        }
    }

    public static void main(String[] args) {
        char ch = 'e';
        String Str = "aammrr";
        removeDup(Str,0,"");
    }
}

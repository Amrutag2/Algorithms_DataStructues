//o(n)
public class ApnaClg_Recursion7_occurence {
    //Find the 1st and last occurence of an element in string
    public static int first = -1;
    public static int last = -1;
    public static void findOccurence(String str, int idx, char elemnet){

      if(idx == str.length()){
          System.out.println("first"+first);
          System.out.println("last"+last);
          return;
      }
      char currchar = str.charAt(idx);
      if(currchar == elemnet){
          if(first==-1){
              first =idx;
          }
          else{
              last=idx;
          }

      }
      findOccurence(str, idx+1,elemnet);
    }
    public static void main(String[] args) {
        findOccurence("amruta",0,'a');
    }
}

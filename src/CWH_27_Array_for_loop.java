public class CWH_27_Array_for_loop {
    public static void main(String[] args) {
        float [] marks = {20.5f,56.5f,33.0f,23,90.5f};
        String [] names = {"Athu","Amu","sakshi","bhoomi","vaibhya"};
        //System.out.println(marks.length);

        for(int i = 0;i< marks.length;i++){
            System.out.println(names[i]+" - "+marks[i]); //array traversal using for loop
        }
        //reverse order
        for(int i = marks.length-1;i>=0;i--){
            System.out.println(names[i]+" - "+marks[i]); //array traversal using for loop
        }

        for (float element:marks){
            System.out.println(element);
        }

    }
}

package data_structures;

public class StringArray_1_Syntax {
    public static void main(String[] args){
        int []arr1= new int[]{2,4,5,7};

        String []array= new String[]{"Amruta","Bhoomi"};

        String []array2 = {"Atharva","Sakshi"};
        System.out.println(array2);

        String[] arr2=new String[3];
        arr2[0]="Apple";
        arr2[1]="Banana";
        arr2[2]="Orange";

        //method1
        for(String i:arr2){
            System.out.println(i);
        }
        for(int i:arr1){
            System.out.println(i);
        }


        //method2
        for(int i =0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }

        //method3
        int j=0;
        while(j<arr2.length){
            System.out.println(arr2[j]);
            j++;
        }
    }

}

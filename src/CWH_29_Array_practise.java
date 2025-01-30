

public class CWH_29_Array_practise {
    public static void main(String[] args) {
        //PRB 1 CREATE AN ARRAY OF 5 FLOATS AND CALCULATE THEIR SUM
        Float [] Arr = {20.0f,30.5f,40.0f};
        float sum = 0;
        for(int i=0;i< Arr.length;i++){ //for(float element:marks)
            sum = sum + Arr[i];// in place of Ar[i] it should be element
        }
        System.out.println("sum : "+sum);

        //write a prg to find out whether a given
        // integer is present in an array or not
        float x = 40.0f;
        int i =0;
        boolean y = false;
        while (i< Arr.length ){
            if(Arr[i]== x){
                y = true;
                break;
            }
            else{
                i++;
            }
        }
        if (y==true){
            System.out.println(Arr[i]+" element found in array");

        }
        else {
            System.out.println("not presnet");
        }
        //prb 3 cALCULATE AVG OF MARKS IN PHYSICS
        System.out.println("The value of avg marks  : "+sum/ Arr.length);


        //problem4 create a java program to add two matrices of size 2X3
        int [][] mat1 = {{1,2,3},{4,5,6}};//mat1.lenght=2 as 2 inner array and
        int [][] mat2 = {{4,5,6,},{1,2,3}};
        int [][] mat3 = {{0,0,0},{0,0,0}};
        for (int k=0;k< mat1.length;k++ ){
            for(int l=0;l<mat1[k].length;l++ ){
                mat3[k][l] = mat1[k][l]+mat2[k][l] ;
                System.out.print(mat3[k][l]+" ");
            }
            System.out.println("");
        }
        //Problem 5 reverse an array
        int [] orig = {3,6,7,5,9,8,10};
        int temp1;
        int l = orig.length;
        //System.out.println(mid);
            /*    Try only for even lenght array
            for(int a = mid-1 ;a>=0;a--,mid++){
                    temp1=orig[mid];
                    orig[mid]=orig[a];
                    orig[a]=temp1;
                }
                for (int element:orig){
                    System.out.println(element);
                }
            */
        //solution using (l-i-1)
        int a = Math.floorDiv(l,2);
        for (int b=0;b<a;b++){
            //swap a[ i] and a[l-1-i] for reverse array
            temp1 = orig[b];
            orig[b]=orig[l-b-1];
            orig[l-b-1]= temp1;

        }
        for (int element:orig){
            System.out.print(element+" ");
        }


        // problem 6 maximum element in an array
        int [] newarr = {10,45,67,200,5};
        int max= 0;
        for(int element:newarr){
            if(element>max)
            {
                max = element;
            }
        }
        System.out.println(" MAximum element =" +max);

        // problem 7 mninimum element in an array
        int min=newarr[0];
        for(int element:newarr){
            if(element<min)
            {
                min = element;
            }
        }
        System.out.println(" Minimum element =" +min);

        //to find if an array is sorted or not
        int [] newarr2 = {10,45,67,200,5};
        int [] newarr3 = {10,15,27,100};
        /* trial
        if(newarr2[0]<newarr2[1] && newarr2[1]<newarr2[2] && newarr2[0]<newarr2[2]){
            System.out.println("array is sorted");
        }
        else {
            System.out.println("array is unsorted");
        }
        */
        boolean isSorted=false;
        for(int n =0;n<newarr2.length-1;n++){
            if(newarr2[n]>newarr2[n+1]){
                System.out.println("not sorted");
                isSorted= false;
                break;
            }
        }
        if(isSorted){
            System.out.println("array is sorted");
        }
    }
}

public class CWH_28_ARRAY_MULTIDEM {
    public static void main(String[] args) {
        int []marks; //1d Array
        int [][] flats;  //2d array
        flats = new int[4][2];
        int [][]flats1 = {{23,34},{32,4},{3,67},{64,45}};
        for (int i =0;i<flats1.length;i++){
            for (int j =0;j<flats1[i].length;j++){
                System.out.print(flats1[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }

    }
}

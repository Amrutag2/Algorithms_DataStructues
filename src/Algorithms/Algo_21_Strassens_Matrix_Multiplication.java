package Algorithms;

public class Algo_21_Strassens_Matrix_Multiplication {
    static int ROW_1 = 4,COL_1 = 4, ROW_2 = 4, COL_2 = 4;

    public static void printMat(int[][] a, int r, int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static int Naive_multiply(int A[][],int B[][],int C[][]){
        int N = 4;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                C[i][j] = 0;
                for (int k = 0; k < N; k++) {
                    C[i][j] += A[i][k]*B[k][j];
                }
            }
        }
        printMat(C,4,4);
        return 1;
    }
    public static void main(String[] args) {
        int[][] matrix_A = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 2, 2, 2, 2 } };

        int[][] matrix_B = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 2, 2, 2, 2 } };
        int [][] C = new int[4][4];

        printMat(matrix_A,4,4);
        printMat(matrix_B,4,4);
        Naive_multiply(matrix_A,matrix_B,C);
    }
}

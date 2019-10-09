import java.util.Scanner;
class Matrix{
    Scanner sc = new Scanner(System.in);
    int[][] createMatrix(int m,int n){
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        return a;
    }

    int[][] matrixSum(int[][] a,int[][] b,int m,int n){
        int[][] sum = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = a[i][j]+b[i][j];
            }
        }
        return sum;
    }

    void printMatrix(int[][] a,int m,int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Matrix ma = new Matrix();
        System.out.println("give your matrix height & width");
        int m = ma.sc.nextInt();
        int n = ma.sc.nextInt();
        System.out.println("give your matrix1 elements");
        int[][] arr1 = ma.createMatrix(m,n);
        System.out.println("give your matrix2 elements");
        int[][] arr2 = ma.createMatrix(m, n);
        System.out.println("::::::::::::matrix sumation:::::::::::");
        int[][] sum = ma.matrixSum(arr1, arr2, m, n);
        ma.printMatrix(arr1, m, n);
        System.out.println("    +");
        ma.printMatrix(arr2, m, n);
        System.out.println("    =");
        ma.printMatrix(sum, m, n);
    }
}
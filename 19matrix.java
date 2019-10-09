import java.util.Scanner;
class matrix{
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

    int[][] matrixMul(int[][] a,int[][] b,int m1,int n1,int m2, int n2){
        int[][] sum = new int[m1][n2];
        for (int i = 0; i < m1; i++) {      // 0,1 .. 
            for (int j = 0; j < n2; j++) {  // 0,1 ..
                for (int k = 0; k < m2; k++) {
                    sum[i][j] += a[i][k]*b[k][j];   // sum[0][0,1..] = a[0][0,1..]*b[0,1..][0]                                         // sum[1][0,1..] = a[1][0,1..]*b[0,1..][1] 
                }
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
        matrix ma = new matrix();
        int m1,n1,m2,n2;
        do{
            System.out.println("give your matrix1 height & width");
            m1 = ma.sc.nextInt();
            n1 = ma.sc.nextInt();
            System.out.println("give your matrix1 height & width");
            m2 = ma.sc.nextInt();
            n2 = ma.sc.nextInt();
            System.out.println("please check your matrix");
        }while(n1!=m2); 
        System.out.println("give your matrix1 elements");
        int[][] arr1 = ma.createMatrix(m1,n1);
        System.out.println("give your matrix2 elements");
        int[][] arr2 = ma.createMatrix(m2, n2);
        System.out.println("::::::::::::matrix sumation:::::::::::");
        int[][] mul = ma.matrixMul(arr1, arr2, m1, n1, m2, n2);
        ma.printMatrix(arr1, m1, n1);
        System.out.println("    *");
        ma.printMatrix(arr2, m2, n2);
        System.out.println("    =");
        ma.printMatrix(mul, m1, n2);
    }
}
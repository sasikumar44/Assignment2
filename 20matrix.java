class matrixRotate{
    String[][] createMatrix(){
        String[][] a = new String[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i==3 || i==4 || j==0||j==1 ){
                    a[i][j]="*";
                }
            }
        }
        return a;
    }

    String[][] rotare(String[][] a){
        String[][] rot = new String[5][5];
        for (int i = 0; i < 5; i++) {      // 0,1 .. 
            for (int j = 0; j < 5; j++) {  // 0,1 ..
                rot[i][j] = a[j][i];
            }
        }
        return rot;
    }

    void printMatrix(String[][] a){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(a[i][j]=="*")
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        matrixRotate ma = new matrixRotate();
        String[][] a = ma.createMatrix();
        ma.printMatrix(a);
        System.out.println("i->j  j->i");
        ma.printMatrix( ma.rotare(a));
    }
}
class investment{
    public static void main(String[] args) {

        double[] P1 = new double[10000];
        double[] P = new double[10000];
        double[] R = new double[10000];
        double[] N = new double[10000];
        for (int i = 1; i < 10000; i++) {
            double a = 1000 + (i-1)*1000;
            double k = 0.1 + (i-1)*0.01;
            double n = i;
            P[i-1] = a;
            P1[i-1] = a;
            R[i-1] = k;
            N[i-1] = n;
        }
      


        for (int i = 0; i < 5; i++) {
            System.out.println("for "+P[i]+" primary amount ");
            System.out.println("-------------------------------------------------------");
                for (int k = 0; k < 5; k++) {
                    Double V = P[i]*Math.pow((1+R[i]),N[k]) ;
                    System.out.print("after "+N[k]+" years ==> "+ "principal amount : "+round(P[i], 2));       
                    P[i] = V ;
                    int j = 0;
                    for (j = 0; j < 10000; j++) {
                        // System.out.println(P[i] +" "+P1[j]);
                        if(P[i]<P1[j]) {
                            break;
                        }       
                    }
                    R[i] = R[j];
                    System.out.println(", next year amount : "+ round( P[i], 2)+", so new k : "+round(R[i],2));
                }
                System.out.println();System.out.println();
        }

    }

    public static double round(double value, int places) {
        String num = value+ 0.0000001 + "";
        int i = num.indexOf('.');
        num = num.substring(0, i+places+1);
        return Double.valueOf(num);
    }
}
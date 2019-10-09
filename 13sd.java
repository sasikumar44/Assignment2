class SD{

    public static void main(String[] args) {
        double [] a = {4, 9, 11, 12, 17, 5, 8, 12, 14};
        int n = a.length;
        double sum =0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        double avg = sum / n;
        double sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum2 += Math.pow((a[i]-avg),2);
        }
        double sd = Math.sqrt(sum2/n);
        System.out.println(sd);

    }
    
}
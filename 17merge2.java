class Merge2{
    public static double[] a = {12.1, 21.4, 23.5, 98.8, 65.2, 45.6, 34.6, 56.7, 34.6};
    public static double[] Array2 = a;
    public static void mergeSort(double[] Array,int lb ,int ub ) {
        if(lb<ub){ // till only one element .. devide
            int mid = (lb+ub)/2;
            mergeSort(Array, lb, mid);
            mergeSort(Array, mid+1, ub);
            merge(Array,lb,mid,ub);
        }
    }
    public static void merge(double[] Array,int lb, int mid,int ub ) {
        
        int i = lb;
        int j = mid+1;
        int k = lb;
        while(i<=mid && j<=ub){
            if(Array[i]<= Array[j]){
                Array2[k]=Array[i];
                i++;
            }
            else{
                Array2[k]= Array[j];
                j++;
            }
            k++;
        }
        if(i>mid){
            while(j<=ub){
                Array2[k]=Array[j];
                j++;
                k++;
            }
        }
        if(j>ub){
            while(i<=mid){
                Array2[k]=Array[i];
                i++;
                k++;
            }
        }
        for (int l = 0; l < ub; l++) {
            Array[l] = Array2[l];
        }
    }
    public static void print(double[] Array) {
        int Size = Array.length; 
        for(int j = 0 ; j<Size; j++){
            System.out.print(Array[j]+" ");
        }
    }

    public static void main(String[] args) {       
        int size = a.length;
        mergeSort(a,0,size-1);
        print(a);
    }
}
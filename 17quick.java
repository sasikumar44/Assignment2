class Quick{
    void qucikSort(double[] arr,int lb,int ub){
        if(lb<ub){      // till only one element in patition
            int loc = partition(arr,lb,ub);
            qucikSort(arr, lb, loc-1);
            qucikSort(arr, loc+1, ub);
        }
    }
    void swap(double[] Array, int ind1, int ind2) {
        double tem = Array[ind1];
        Array[ind1] = Array[ind2];
        Array[ind2] = tem;
    }
    int partition(double[] arr, int lb, int ub){
        double pivot = arr[lb];
        int start = lb;
        int end = ub;
        while(start<end){
            while(pivot>=arr[start]){
                start++;
            }
            while(pivot<arr[end]){
                end--;
            }
            if(start < end) swap(arr, start, end);
        }
        swap(arr,lb,end);
        return end;
    }
    static void print(double[] Array) {
        int Size = Array.length; 
        for(int j = 0 ; j<Size; j++){
            System.out.print(Array[j]+" ");
        }
    }

	public static void main(String args[]) 
	{ 
		double [] a = {12.1, 21.4, 23.5, 98.8, 65.2, 45.6, 34.6, 56.7, 34.6};
		Quick ob = new Quick(); 
		ob.qucikSort(a, 0, a.length-1); 
		print(a); 
	} 
}
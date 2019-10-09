class binary{
    public static int binarySearch(double[] Array, double element) {
        int length = Array.length;
        int start = 0;
        int end = length -1;
        
        while(start<=end){
            int mid = (start + end)/2;      // when loop again start, end changed
            if(Array[mid]==element) return mid;
            else if(element > Array[mid]) start = mid+1;
            else end = mid-1;
        }
        return -1;
    }

    public static void swap(double[] Array, int ind1, int ind2) {
        double tem = Array[ind1];
        Array[ind1] = Array[ind2];
        Array[ind2] = tem;
    }
      
    public static void bubbleSort(double[] Array) {
        int Size = Array.length; 
        for(int j = Size-1; j>1; j--){
            for(int i=0; i<j; i++){
                if (Array[i]>Array[i+1]){
                    swap(Array,i,i+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        double[] a = {12.1, 21.4, 23.5, 65.2, 45.6, 34.6, 56.7, 34.7, 98.8, 54.8};
        bubbleSort(a);
        System.out.println(binarySearch(a, 56.7));
    }
}


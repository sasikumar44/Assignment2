class Selection{
    public static void swap(double[] Array, int ind1, int ind2) {
        double tem = Array[ind1];
        Array[ind1] = Array[ind2];
        Array[ind2] = tem;
    }
    public static void selectionSort(double[] Array) {
        int len = Array.length;
        for (int i = 0; i < len-1 ; i++) {   // last element will be sorted  so    i < len-1
            int min = i;                    // consider fist element of unSorted subArray is min
            for (int j = i+1 ; j < len; j++) {      // loop after considerd min ele of the unSortred subArray
                if(Array[j]<Array[min]) min = j;
                if(min != j) swap(Array,i,min);      
            }
            
        }
    }
    public static void print(double[] Array) {
        int Size = Array.length; 
        for(int j = 0 ; j<Size; j++){
            System.out.print(Array[j]+" ");
        }
    }

    public static void main(String[] args) {
        double[] a = {12.1, 21.4, 23.5, 98.8, 65.2, 45.6, 34.6, 56.7, 34.6};
        selectionSort(a);
        print(a);
    }
}


// worst case or best case O(n2)
// array devided into two parts sortedArray , unSortedArray ... unSortedArray first element swap with the minimum element 

class Bubble{
    public static void swap(double[] Array, int ind1, int ind2) {
        double tem = Array[ind1];
        Array[ind1] = Array[ind2];
        Array[ind2] = tem;
    }
      
    public static void bubbleSort(double[] Array) {
        int Size = Array.length; 
        for(int j = Size-1; j>1; j--){          // 2 .... with out last element stat loop
            for(int i=0; i<j; i++){             // 1 .... this will leave the biggest element in the last index
                if (Array[i]>Array[i+1]){
                    swap(Array,i,i+1);
                }
            }
        }
    }
// by 1&2 the array will sort form last index to 2 nd index ,,,, at the last loop will be sorted
    public static void print(double[] Array) {
        int Size = Array.length; 
        for(int j = 0 ; j<Size; j++){
            System.out.print(Array[j]+" ");
        }
    }

    public static void main(String[] args) {
        double[] a = {12.1, 21.4, 23.5, 65.2, 45.6, 34.6, 56.7, 34.7, 98.8, 54.8};
        bubbleSort(a);
        print(a);
    }
    // worst case O(n2), best case O(n) if array allready sorted , avg case O(log(n))
}

class Insertion{
    public static void insertionSort(double[] Array) {
        int len = Array.length;
        for (int i = 1; i < len ; i++) {    // outerLoop for unSorterd part 
            double temp = Array[i];         // get fist element of unSorted subArray in temp
            int j = i-1;                    // innerLoop goes from Right to Left
            while(j>0 && Array[j]>temp){       // if any element > temp ..... left shift
                Array[j+1] = Array[j];
                j--;
            }
            Array[j+1] =temp;       // if we found element < temp  ........... then temp's location is j+1
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
        insertionSort(a);
        print(a);
    }
}

// worst case 2 loops will run completly so O(n2)     ,,,, array in desending order
// best case O(n)     ,,,,, array allreay in sorted order ... allways while(condition) false
// 
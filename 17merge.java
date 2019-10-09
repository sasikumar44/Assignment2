class Merge { 

    void mergeSort(double Array[], int lb, int ub) 
	{ 
		if (lb < ub) 
		{ 
			int mid = (lb+ub)/2; 

			mergeSort(Array, lb, mid); 
			mergeSort(Array , mid+1, ub); 

			merge(Array, lb, mid, ub); 
		} 
	} 
	void merge(double Array[], int lb, int mid, int ub) { 
		int n1 = mid - lb + 1; //size of left array
		int n2 = ub - mid; 

		double Left[] = new double [n1]; 
		double Right[] = new double [n2]; 

		for (int i=0; i<n1; ++i) 
			Left[i] = Array[lb + i];    // fill array with element same as primary array
		for (int j=0; j<n2; ++j) 
			Right[j] = Array[mid + 1+ j];   

		int i = 0, j = 0; 
		int k = lb; 
		while (i < n1 && j < n2)        // normaly left and right not finish yet
		{ 
			if (Left[i] <= Right[j])    // get an small element from Left or Right
			{ 
				Array[k] = Left[i]; 
				i++; 
			} 
			else                // if Right is small then get element fom Right
			{ 
				Array[k] = Right[j];    
				j++;               
			} 
			k++; 
		} 

        
		while (i < n1)      // first Right finst ........ so get other element From Leftt
		{ 
			Array[k] = Left[i]; 
			i++; 
			k++; 
		} 
		while (j < n2) 
		{ 
			Array[k] = Right[j]; 
			j++; 
			k++; 
		} 
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
		Merge ob = new Merge(); 
		ob.mergeSort(a, 0, a.length-1); 
		print(a); 
	} 
} 
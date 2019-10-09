class q10{
	public static void main (String args[]){
		String[] arr1={"Cat","Lion","Tiger","Dog","Monkey","Fox"};

		System.out.println("Original order words are :");
		for(int i=0; i<arr1.length; i++){
			System.out.println(arr1[i]);
		}

		int k=0;
		int n=1;
		while(n<=arr1.length){
			for(int j=0; j<arr1.length-1; j++){
				if(arr1[j].charAt(k)>arr1[j+1].charAt(k)){
					String temp=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=temp;
				}
			}
			n++;
		}

		System.out.println();
		System.out.println("Dictionary order of words are :");
		for(int i=0; i<arr1.length; i++){
			System.out.println(arr1[i]);
		}

		System.out.println();
		System.out.println("-----Using compareTo function-----");
		int m=1;
      	while(m<=arr1.length) {
         	for (int i=0; i<arr1.length-1; i++) {
            	if (arr1[i].compareTo(arr1[i+1]) > 0) {
               		String temp = arr1[i];
               		arr1[i] = arr1[i+1];
               		arr1[i+1] = temp;
            	}
         	}
         	m++;
      	}

		System.out.println();
		System.out.println("Dictionary order of words are :");
		for(int i=0; i<arr1.length; i++){
			System.out.println(arr1[i]);
		}

	}
}
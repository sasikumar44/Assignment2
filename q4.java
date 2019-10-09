class q4{
	public static void main(String args[]){
		System.out.println("_______For Loop______");
		for(int i=1; i<=10; i++){
			for(int j=1; j<=10; j++){
				System.out.print(i*j+" ");
			}
			System.out.println();
		}

		System.out.println("_______While Loop______");
		int i=1,j=1;
		while(i<=10){
			while(j<=10){
				System.out.print(i*j+" ");
				j++;
			}
			System.out.println();
			i++;
			j=1;
		}
	}
}
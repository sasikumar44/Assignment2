class q5{
	public static void main(String args[]){
		int n=60;
		System.out.print("Factors of "+n+" are : ");
		for(int i=1; i<=n; i++){
			if(n%i==0){
				System.out.print(i+" ");
			}
		}
	}
}
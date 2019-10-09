class q2{
	public static void main(String args[]){
		int fact=1;
		int m=6;
		for(int i=1; i<=m; i++){
			fact=fact*i;
			System.out.println(i+" "+fact);
		}
		System.out.println("Factorial of "+m+" is : "+fact);
	}
}
class q1{
	public static void main(String args[]){
		int n=12345;
		int b=1,r=0;

		while(b!=0){
			b=n/10;
			r=n%10;
			n=b;
			System.out.print(r);
		}
		System.out.println();
	}
}
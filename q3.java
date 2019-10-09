class q3{
	public static void main(String args[]){
		int m=8,n=1,i=1,j=0,counter=1;
		do{
			System.out.print(n+" ");
			j=n+i;
			if(j<3 && m>1){
				System.out.print(n+" ");
			}
			i=n;
			n=j;
			counter++;
		}while(counter<m);

	}
}
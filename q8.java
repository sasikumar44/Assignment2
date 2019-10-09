class q8{
	public static void main(String args[]){
		String str="apple,orange,strawberry,banana";
		String[] arr=new String[4];

		int k=0;
		int m=0;
		StringBuilder sb = new StringBuilder();

		for(int i=k; i<str.length(); i++){
			if(str.charAt(i)!=','){
				sb.append(str.charAt(i));
				if(i==str.length()-1){
					String str1 = sb.toString();
					int n=m;
					arr[n]=str1;
				}
			}
			else{
				String str1 = sb.toString();
				int n=m;
				arr[n]=str1;
				m++;
				sb.setLength(0);
				k=i+1;
			}
		}

		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}

		System.out.println();
		System.out.println("Using split function!");
		System.out.println();

		String arr1[]=str.split(",");
		for ( String ss : arr1) {
		    System.out.println(ss);
		}
	}
}


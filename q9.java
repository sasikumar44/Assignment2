class q9{
	public static void main(String args[]){
		String str="I Love sL";

		StringBuilder sb = new StringBuilder();

		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)!=' '){
				sb.append(str.charAt(i));
			}
		}

		String str1=sb.toString();
		System.out.println(str1);

		System.out.println();
		System.out.println("Using replaceAll function");
		System.out.println();

		String str2=str.replaceAll("\\s+","");
		System.out.println(str2);
	}
}
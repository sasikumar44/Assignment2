class q6{
	public static void main(String args[]){
		System.out.println("-----Using if else statements!-----");
		System.out.println();

		char ch='X';
		if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
			System.out.println(ch+" is a vowel!");
		}
		else{
			System.out.println(ch+" is not a vowel!");
		}

		System.out.println();
		System.out.println("-----Using Switch case statements!-----");
		System.out.println();

		switch(ch){
			case 'A' :System.out.println(ch+" is a vowel!"); break;
			case 'E' :System.out.println(ch+" is a vowel!"); break;
			case 'I' :System.out.println(ch+" is a vowel!"); break;
			case 'O' :System.out.println(ch+" is a vowel!"); break;
			case 'U' :System.out.println(ch+" is a vowel!"); break;
			case 'a' :System.out.println(ch+" is a vowel!"); break;
			case 'e' :System.out.println(ch+" is a vowel!"); break;
			case 'i' :System.out.println(ch+" is a vowel!"); break;
			case 'o' :System.out.println(ch+" is a vowel!"); break;
			case 'u' :System.out.println(ch+" is a vowel!"); break;
			default : System.out.println(ch+" is not a vowel!");
		}
	}
}
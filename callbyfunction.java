class callbyfunction{
	public static void swapcall(int a,int b){
	int temp=a;
	a=b;
	b=temp;
	System.out.println("a is:"+a);
	System.out.println("b is:"+b);
	}
	public static void main(String[]args){
	int a=10;
	int b=20;
	swapcall(a,b);
}


	}
	
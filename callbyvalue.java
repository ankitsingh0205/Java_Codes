class callbyvalue{
	public static void main(String[]args){
	int a=10;
	int b=20;
	int c=30;
	int temp=c;
	a=c;
	a=b;
	b=temp;
	c=temp;
	System.out.println("a is:"+a);
	System.out.println("b is :"+b);
	System.out.println("c is :"+c);

	}
}
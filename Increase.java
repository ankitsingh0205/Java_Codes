class Increase{
	public static void printincrease(int n){
	if(n==1){
	System.out.print(1);
	return;
}
  printincrease(n-1);
  System.out.print(n+" ");
  
	}
	public static void main(String[]args){
	int n=10;
	printincrease(n);
	}

}
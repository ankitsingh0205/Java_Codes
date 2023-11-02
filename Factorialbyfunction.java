import java.util.Scanner;
class Factorialbyfunction{
	public static int multiply(int n){
		int f=1;
		for(int i=1;i<=n;i++){
			f=f*i;
		}
			return f;
		}
		public static void main (String[]args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number:");
			int a=sc.nextInt();
			System.out.println("Factorial is:"+multiply(7));
		}
	}

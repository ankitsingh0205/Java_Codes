import java.util.Scanner;
class King{
	public static void Calculatesum(int a,int b){
	 int sum=a+b;
	 System.out.println("Sum of a and b:"+sum);
	}
	public static void main (String[]args){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter First Number:");
	 int a=sc.nextInt();
	 System.out.println("Enter Second Number:");
	 int b=sc.nextInt();
	 //int c=a+b();
	 //System.out.println("Sum of a and b:"+sum);
	 Calculatesum(a,b);
	}
}
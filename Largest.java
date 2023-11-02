//  Find the largest number in array
import java.util.Scanner;
class Largest{
	public static int getlargest(int number[]){
	int largest=Integer.MIN_VALUE;
	int smallest=Integer.MAX_VALUE;
	for(int i=0;i<number.length;i++){
		if(largest<number[i]){
		 largest=number[i];
		}
			if(smallest>number[i]){
				smallest=number[i];
			}

	}
	 System.out.println("smallest value is:"+smallest);
	 return largest;
	
	}
	public static void main(String[]args){
	int number[]={1,2,4,8,6,3,7};
	System.out.println("largest valuse is:"+getlargest(number));
	//System.out.println("smallest values is:"+getlargest(number));
	}
}
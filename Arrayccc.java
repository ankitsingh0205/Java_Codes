import java.util.Scanner;
class Arrayccc{
	public static void updatearr(int marks[]){
		for(int i=0;i<marks.length;i++){
			 marks[i]=marks[i]+1;
		}
	}
	public static void main (String[]args){
	int marks[]={10,20,30,40,50};
	updatearr(marks);
		for(int i=0;i<marks.length;i++){
			System.out.print(marks[i]+" ");
		}
	
		System.out.println();
	
	//Scanner sc=new Scanner(System.in);
	//marks[0]=sc.nextInt();
	//marks[1]=sc.nextInt();
	//marks[2]=sc.nextInt();
	//System.out.println("phy:"+marks[0]);
	//System.out.println("phy:"+marks[1]);
	//System.out.println("phy:"+marks[2]);
	//System.out.println("Total of 3 Subjects:"+marks[0]+marks[1]+marks[2]);
	}
}
//Binary Search Tree
class Binarysearch{
	public static int binary_search(int number[],int key){
	int start=0,end=number.length-1;
		while(start<=end){
		int mid=(start+end) /2;

		if(number[mid]==key){
		return mid;
		}
		if(number[mid]<key){
		start=mid+1;
		}else{
		 end=mid-1;
	}
		}
		 return-1;
	}
	 public static void main(String[]args){
	 int number[]={1,5,3,4,6,7,8,9,10};
	 int key=5;
	 System.out.println("index for key is:"+binary_search(number,key));
	 }
}
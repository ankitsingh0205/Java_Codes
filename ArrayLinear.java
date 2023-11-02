// Linear Search
class ArrayLinear{
	public static int Linear_Search(int numbers[],int key){
	for(int i=0;i<numbers.length;i++){
	if(numbers[i]==key){
	return i;
}
	}
	 return -1;
}
	public static void main(String[]args){
		int numbers[]={2,4,6,10,12,14,16,18,20};
		int key=10;
		int index=Linear_Search( number, key);
		if(index==1){
			System.out.println("Inesx is not found:");
		}else{
		System.out.prinln("Index is found:"+index);
		}
}
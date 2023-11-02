// for a given set of string find largest string
// "apple","mango","banana"
class LargestString{
	public static void main(String[]args){
	String Fruits[]={"apple","carrot","banana"};
	String largest=Fruits[0];
	for(int i=0;i<Fruits.length;i++){
	if(largest.compareTo(Fruits[i]) < 0){
	largest=Fruits[i];
}
	}
	 System.out.println(largest);
}
  }
// Comparison String
class Comparison{
	public static void main (String[]args){
	String s1="Ankit";
	String s2="Ankit";
	String s3= new String("Ankit");
	if(s1==s2){
	System.out.println("String are equal");
	}
	 else{
	 System.out.println("String are not equal");
	 }
	 if (s1.equals(s3)){
	 System.out.println("Strings are  equal");
	 }
	  else{
	   System.out.println("Strings are not equal");
	  }
	}
}
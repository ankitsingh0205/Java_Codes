class Constructors{
	public static void main(String[]args){
	Student s=new Student();
	Student s1=new Student("Ankit Kumar Singh");
	Student s2=new Student(101);
	System.out.println(s1);
	System.out.println(s2);

	}
}
class Student{
	String name;
	int roll;
	Student(){
	System.out.println("Constructor is called....");
	}
	Student (String name){
		this.name=name;
		//System.out.println(s1);
	}
	Student (int roll){
		this.roll=roll;
		//System.out.println(s2);
	}
}
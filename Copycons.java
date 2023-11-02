// Copy Constructor
import java.util.Scanner;
class Copycons{
	public static void main (String[]args){
	Student s1=new Student();
	s1.name="Ankit Singh";
	s1.roll=456;
	s1.mobile=9109731111L;
	s1.password="abcd";
	s1.marks[0]=96;
	s1.marks[1]=95;
	s1.marks[2]=98;
	System.out.println(s1.name);
	System.out.println(s1.roll);
	System.out.println(s1.mobile);
	System.out.println(s1.password);
	System.out.println(s1.marks[2]);
	Student s2=new Student(s1);
	s2.password="xyz";
	s2.marks[2]=101;
	for(int i=0;i<=3;i++){
		System.out.println(s2.marks[i]);
	}



	}
}
class Student{
	String name;
	int roll;
	Long mobile;
	String password;
	int marks[];
// this is copy constructor
	/*Student(Student s1){
		marks=new int [3];
		this.name=s1.name;
		this.roll=s1.roll;
		this.mobile=s1.mobile;*/

	//this is deep copy constructor
		Student(Student s1){
		marks=new int [3];
		this.name=s1.name;
		this.roll=s1.roll;
		for(int i=0;i<marks.length;i++){
			this.marks[i]=s1.marks[i];
		}

	}

	Student(){
	marks=new int[3];
	System.out.println("Constructor is called");

	}
	 Student(String name ){
	 marks=new int[3];
	 this.name=name;
	 }
	 Student(int roll){
	 marks=new int[3];
	 this.roll=roll;
	 }
	 Student(Long mobile){
	   marks=new int[3];
	   this.mobile=mobile;
	  }
	 //Student(String password){
	  //marks=new int[3];
	  //this.password=password;
	  }
	 

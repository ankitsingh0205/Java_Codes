// Inheritence is when properites & method base class are passed to be derived class it is called inheritence.
class Inhertience{
	public static void main (String[]args){
	 Fish shark=new Fish();
	 shark.eat();
	 shark.swim();
	 shark.lungs();
	 

	}
}
//Base class
class Animals{
	String color;

	void eat(){
	System.out.println("eats");

}
	void breathe(){
	System.out.println("breathe");
	}
}
// Derived class
class Fish extends Animals{
  int fins;

  void swim(){
  System.out.println("Swims");
}
  void lungs(){
  System.out.println("lungs");
  }
}
	

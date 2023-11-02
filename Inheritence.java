// Types of Inheritence
// Single Inheritence
class Inheritence{
	public static void main(String[]args){
	Dog dobby=new Dog();
	dobby.eat();
	dobby.legs=4;
	System.out.println(dobby.legs);

	}
}
class Animal{
	String color;

	void eat(){
	System.out.println("eats");
	}

	 void breathe(){
	 System.out.println("brethes");
	 }
}
  class Mammal extends Animal{
   int legs;
  }
  class Dog extends Mammal{
  String breed;

  }
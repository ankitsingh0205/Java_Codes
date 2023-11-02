// Hierarchial Inheritence
// One is base class and multiple derived class.
class Hierarchical{
	public static void main(String[]args){
	Fish am=new Fish();
	am.eat();
	am.swim();
	Birds an=new Birds();
	an.fly();
	an.breathe();

	//am.fly();
	//am.walk();

	}
}
class Animals{
	String color;

	void eat(){
	System.out.println("eats");
	}
	void breathe(){
	System.out.println("breathes");

	}
}
class Mammals extends Animals{
	void walk(){
	System.out.println("walks on the road");
	}
}
class Fish extends Animals{
	void swim(){
	System.out.println("Swims in the water");
	}
}
class Birds extends Animals{
	void fly(){
	System.out.println("fly in the air");
	}
}
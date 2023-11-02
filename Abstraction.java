// Abstraction
// Hiding all unnecessary details and showing  only important part of the user
// Abstractclass                 Interfaces
// Abstract class
//cannot create a crate  of instance class
//can have abstract/non abstract methods
//can have constructors
class Abstraction{
	public static void main(String[]args){
		Horse h=new Horse();
		h.eat();
		h.walk();
		System.out.println(h.color);
		Chicken ch=new Chicken();
		ch.walk();
		ch.eat();


	}
}
abstract class Animals{
	String color;
	Animals(){
		color="Brown";
	}
	void eat(){
	System.out.println("animals eats plant");
	}
	abstract void walk();
}
class Horse extends Animals{
	void changecolor(){
		color="dark brown";
	}
	void walk(){
		System.out. println("Horse walk on 4 legs");
	}
}
class Chicken extends Animals{
	void changecolor(){
		color="yellow";
	}
	void walk(){
		System.out.println("chicken walk on 2 legs");
	}
}



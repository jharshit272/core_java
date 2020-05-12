package programs;

 interface Interface{
	 void m1();
 }

class Parent implements Interface{
	
	public void m1(){
		System.out.println("Parent m1");
	}
}
class Child extends Parent{
	public void m1(){
		System.out.println("Child m1");
	}
	void m2(){
		System.out.println("Child m2");
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		Interface parentRef = new Child();
		parentRef.m1();
		((Child)parentRef).m2();
		
		Child child = (Child) new Parent();
		child.m1();
	}
	
}

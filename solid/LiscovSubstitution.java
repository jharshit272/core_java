package solid;

public class LiscovSubstitution {

	//Liskov Substitution Principle also states – subtype objects can 
	//replace super type objects without affecting the functionality 
	//inherent in the super type.




	public static void main(String[] args) {
		Eclipse ec = new Circle();
		ec.printType();
		ec.setLengthOfAxisX(10);
		ec.setLengthOfAxisY(15);
		System.out.println(ec.getLengthOfAxisX());
		System.out.println(ec.getLengthOfAxisY());
		//Circle is no long a circle
		
	}

		

}


class Eclipse{
	
	int x;
	int y;
	
	void printType() {
		System.out.println("I am Eclipse");
	}
	
	void setLengthOfAxisX(int x) {
		this.x = x;
	}
	
	void setLengthOfAxisY(int y) {
		this.y = y;
	}
	
	int getLengthOfAxisX() {
		return this.x;
	}
	
	int getLengthOfAxisY() {
		return this.y;
	}
}
class Circle extends Eclipse{

	void printType() {
		System.out.println("I am Circle");
	}

}

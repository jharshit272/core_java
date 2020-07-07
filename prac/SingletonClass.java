package prac;

public class SingletonClass {
	int i=0;
	static SingletonClass singletonClass = new SingletonClass();
	private SingletonClass() {
	}

	public static SingletonClass getInstance() {
		return singletonClass;
	}
}

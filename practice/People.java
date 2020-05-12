package practice;

public class People implements Comparable<People> {
	
	int age;
	int weight;
	Integer height;
	
	public Integer getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	People(int age,	int weight,	int height){
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	public String toString(){
		return 	 age + " " + weight+ " "+height;		
	}

	@Override
	public int compareTo(People o) {
		return this.height.compareTo(o.height);
		
	}
}

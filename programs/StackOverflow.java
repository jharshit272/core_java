package programs;

public class StackOverflow {


	public static void main(String[] args) {
		try{
			recursivelyPrint(10);
		}catch(StackOverflowError e){
			System.out.println("Catched exception");
		}

		try{
			recursivelyPrint(1);
		}catch(StackOverflowError e){
			System.out.println("Catched exception");
		}
		
		try{
			recursivelyPrint(1);
		}catch(RuntimeException e){
			System.out.println("Catched exception");
		}
		
	}

	private static void recursivelyPrint(int i) {
		if(i==0){
			return ;
		}else{
			System.out.println(i);
			recursivelyPrint(i+1);
		}

	}
}

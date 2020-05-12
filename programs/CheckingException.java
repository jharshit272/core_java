package programs;

public class CheckingException {

	
	public static void main(String[] args) {
	
		 
		try{
			 
	    fib(5);	
	  
		}catch(VirtualMachineError err){
			System.out.println("Error");
		}
		
		 throw new RuntimeException();
	}

	private static void fib(int i) {
		System.out.println("Hello");
		fib(3);
		
	}
	
}

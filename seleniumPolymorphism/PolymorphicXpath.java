package seleniumPolymorphism;

interface Xpath{
	void getXpathFromGrid();
	void getXpathFromSidePanel();
}

class ParentXpath implements Xpath{

	public void getXpathFromGrid(){
		//navigating to grid
		System.out.println("Parent m1 Total level");
	}

	@Override
	public void getXpathFromSidePanel() {
		System.out.println("Parent m1 Total level");		
	}
}
class Monthly extends ParentXpath{
	public void getXpathFromGrid(){
		//navigating to monthly grid
		System.out.println("Monthly");
	}	
	@Override
	public void getXpathFromSidePanel() {
		System.out.println("Parent m1 Total level");		
	}
}

class Weekly extends ParentXpath{
	//navigating to weekly grid
	public void getXpathFromGrid(){
		System.out.println("Weekly");
	}
	@Override
	public void getXpathFromSidePanel() {
		System.out.println("Parent m1 Total level");		
	}
}

public class PolymorphicXpath {

	public static void main(String[] args) {
		Xpath xpath = new Monthly();
		xpath.getXpathFromGrid();
	}	
}

/*
 * package mobileIron;
 
//https://codeinterview.io/LOONLCQTIN
interface CoffeeMachine{
	  
	  void addGroundCoffee(Integer coffeeType);
	  CoffeeDrink brewFilterCoffee()  ;
	}

	interface PremiumFeature{
	  
	  CoffeeDrink brewExpresso() ;
	}

	class RegularCoffeeMachine implements CoffeeMachine{
	  
	  Integer coffeeType;
	  BrewingUnit brewingUnit;
	  
	  public void addGroundCoffee(Integer coffeeType){    
	  }
	  public CoffeeDrink brewFilterCoffee(){ 
	    return new CoffeeDrink();    
	  }
	  
	  
	  class PremiumCoffeeMachine implements CoffeeMachine, PremiumFeature{
	  
	  Integer coffeeType;
	  BrewingUnit brewingUnit;
	  Grinder grinder;
	  public void adGroundCoffee(Integer coffeeType){   
	    
	  }
	  public CoffeeDrink brewFilterCoffee(){
	    
	    return new CoffeeDrink();
	    
	  }
	  
	  public CoffeeDrink brewExpresso(){
	    
	    return new CoffeeDrink();
	    
	  }
	  
	  class ExpressoMachine implements CoffeeMachine, PremiumFeature{
	  
	  Integer coffeeType;
	  BrewingUnit brewingUnit;
	  Grinder grinder;
	  public void adGroundCoffee(Integer coffeeType){   
	    
	  }
	  
	   public CoffeeDrink brewFilterCoffee(){
	    
	    return new CoffeeDrink();
	    
	  }
	  
	  public CoffeeDrink brewExpresso(){
	    
	    return new CoffeeDrink();
	    
	  }
	  
	  
	}
	
	*/

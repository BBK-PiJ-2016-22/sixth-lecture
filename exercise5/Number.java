public class Number{

	private int number;
	private Number nextNumber;
	
	Number(int number){
		
		this.number = number;
	}

	
	public int getNumber(){
		
		return number;
	
	}
	
	public Number getNextNumber(){
		
		return nextNumber;
	
	}
	
	public void setNextNumber(Number nextNumber){
		
		this.nextNumber = nextNumber; 
	
	}
	
}
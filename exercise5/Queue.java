public class Queue{
	
	Number header = null;
	
	public static void main(String[] args){
	
		Queue q = new Queue();
		q.Launcher();

		
	
	}
	
	public void Launcher(){
	
		System.out.println("There are "+size()+" items in the queue.");
		System.out.println("Inserting request 1");
		Number firstNumber = new Number(1);
		insert(firstNumber);
		System.out.println("Inserting request 2");
		Number secondNumber = new Number(2);
		insert(secondNumber);
		System.out.println("Inserting request 3");
		Number thirdNumber = new Number(3);
		insert(thirdNumber);	
		System.out.println("There are "+size()+" items in the queue.");
		Number retrieveOne = retrieve();
		System.out.println("Retrieving request " + retrieveOne.getNumber());
		Number retrieveTwo = retrieve();
		System.out.println("Retrieving request " + retrieveTwo.getNumber());
		System.out.println("There are "+size()+" items in the queue.");
	}


	public void insert(Number number){
		
		Number pointer = header;
		
		if(header == null){
			
			header = number;
		
		}else{
		
			while(pointer.getNextNumber() != null){
			
				pointer = pointer.getNextNumber();

			}
		
			pointer.setNextNumber(number);				
		
		}
	}
	
	
	public Number retrieve(){
		
		Number pointer = header;
		
		if (header == null){
			System.out.println("List is empty");
			return null;
		
		}else{
			
			header = pointer.getNextNumber();
			pointer.setNextNumber(null); 
			return pointer;
		}
			
	}
	
	public int size(){
		
		Number pointer = header;
		int counter = 1;
		
		if(header == null){
			
			return 0;
		
		}else{
		
			while(pointer.getNextNumber() != null){
			
				pointer = pointer.getNextNumber();
				counter ++;		
			}
			
			return counter; 		
		}
	}
}	


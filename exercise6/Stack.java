public class Stack{
	
	
	private Number[] array;
	public static int size = 0;
		
	
	Stack(int stackLength){
		
		this.array = new Number[stackLength];
		
	}

	
	public Number[] getArray(){
		
		return array;
	
	}
	
	public Number getElement(int element){
		
		return array[element];
	
	}
	
	
	
	public void push(Number numberToPush){
		
		if(size < array.length){
		
			array[size] = numberToPush; 
			size++;	
		
		} else {
			
			System.out.println("Stack OverFlow");	
				
		}
	}


	public Number pop(){
		
		Number toPop = array[size-1];
		
		if (size == 0){
			System.out.println("Stack is empty");
			return null;
		
		}else{
			
			array[size-1] = null;
		
			size = size - 1;
		
			return toPop;
		}
	}
	
	public boolean empty(){
		
		if(size == 0){
			return true;
		}else{
			return false;
		}
		
	}


}






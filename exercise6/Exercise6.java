public class Exercise6{

	public static void main(String[] args){
		
		Exercise6 e = new Exercise6();
		e.Launch();
		
	}
	
	public void Launch(){
		
		
		Stack firstStack = new Stack(4);	
		
		boolean status = firstStack.empty();
		
		if(status){
			System.out.println("list is empty");
		}else{
			System.out.println("list is not empty");
		}

		
		Number firstNumber = new Number(1);	
		System.out.println("Pushing " +firstNumber.getNumber());
		firstStack.push(firstNumber);
		
		Number secondNumber = new Number(2);	
		System.out.println("Pushing "+secondNumber.getNumber());
		firstStack.push(secondNumber);
		
		Number thirdNumber = new Number(3);	
		System.out.println("Pushing "+thirdNumber.getNumber());
		firstStack.push(thirdNumber);
		
		Number fourthNumber = new Number(4);	
		System.out.println("Pushing "+fourthNumber.getNumber());
		firstStack.push(fourthNumber);
		
		boolean status1 = firstStack.empty();
		
		if(status1){
			System.out.println("list is empty");
		}else{
			System.out.println("list is not empty");
		}
				
		Number myNumber = firstStack.pop();
		
		System.out.println("Popping "+myNumber.getNumber());
	
		Number myNumber1 = firstStack.pop();
		
		System.out.println("Popping "+myNumber1.getNumber());
		
		
		Number myNumber2 = firstStack.pop();
		
		System.out.println("Popping "+myNumber2.getNumber());
		
		Number myNumber3 = firstStack.pop();
		
		System.out.println("Popping "+myNumber3.getNumber());
		
		boolean status2 = firstStack.empty();

		
		if(status2){
			System.out.println("list is empty");
		}else{
			System.out.println("list is not empty");
		}
		
		Number fifthNumber = new Number(6);
		firstStack.push(fifthNumber);
		System.out.println("Pushing "+fifthNumber.getNumber());

		Number sixthNumber = new Number(7);
		firstStack.push(sixthNumber);
		System.out.println("Pushing "+sixthNumber.getNumber());
		
		Number myNumber4 = firstStack.pop();
		
		System.out.println("Popping "+myNumber4.getNumber());
		
		Number myNumber5 = firstStack.pop();
		
		System.out.println("Popping "+myNumber5.getNumber());
		

		boolean status3 = firstStack.empty();
		
		
		if(status3){
			System.out.println("list is empty");
		}else{
			System.out.println("list is not empty");
		}
	
	}




}
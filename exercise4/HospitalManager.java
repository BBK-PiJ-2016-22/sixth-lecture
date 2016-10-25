public class HospitalManager{

	private Patient header;
	private Patient trailer;	


	public static void main (String[] args){
		
		HospitalManager myManager = new HospitalManager();
			
		myManager.Launch();	
	
	}
	


	public void Launch(){
		
		Patient firstPatient = new Patient("Jim", 34, "very sick");
		
		header = firstPatient;
		
		Patient secondPatient = new Patient("Harald", 43, "Polio");
		addPatient(secondPatient);
		
		Patient thirdPatient = new Patient("Eric", 32, "OD");
		addPatient(thirdPatient);
		
		Patient fourthPatient = new Patient("Jerry", 22, "Small Pox");
		addPatient(fourthPatient);
		
		Patient fifthPatient = new Patient("Peter",113, "Bronchitis");
		addPatient(fifthPatient);
		
		Patient sixthPatient = new Patient("Mongi", 32, "Anaphylatic Shock");
		addPatient(sixthPatient);
		
		Patient seventhPatient = new Patient("Poul", 22, "Cancer");
		addPatient(seventhPatient);
		
		System.out.println("first name: " + firstPatient.getName());
		System.out.println("first next: " + firstPatient.getNextPatient().getName());
		System.out.println("second name: " + secondPatient.getName());
		System.out.println("second next: " + secondPatient.getNextPatient().getName());
		System.out.println("third name: " + thirdPatient.getName());
		System.out.println("third next: " + thirdPatient.getNextPatient().getName());
		System.out.println("sixth name: " + sixthPatient.getName());
		//printPatients();
		
		//deletePatient(seventhPatient);
		
		//printPatients();
		
		

	}
	
	public void addPatient(Patient newPatient){
		
		Patient pointer = header;
		// if the list is empty
		if(header == null){
			
			header = newPatient;	
		
		} else if (header != null && trailer == null){
			System.out.println("here");
			
			
			pointer.setNextPatient(newPatient);
			trailer = pointer.getNextPatient();
			pointer.getNextPatient().setNextPatient(header);

			
		}else{
			System.out.println("There");
			while(!pointer.getNextPatient().equals(trailer)){
				
				pointer = pointer.getNextPatient();
			
			}
			
			pointer.setNextPatient(newPatient);
			trailer = pointer.getNextPatient();
			pointer.getNextPatient().setNextPatient(header);
			 
		
		}
	
	}

	
	public void printPatients(){
    	
    	Patient pointer = header; 
    	
    	if(header == null){
    		System.out.println("List is Empty");
    	
    	}else if (header != null && pointer.getNextPatient() == null){
    	
    		System.out.println("Patient name: " + pointer.getName());
    		System.out.println("Age: " + pointer.getAge());
    		System.out.println("Illness: " + pointer.getIllness());
    		System.out.println();

    	
    	}else if (header != null && pointer.getNextPatient() != null){
    		
    		System.out.println("Patient name: " + pointer.getName());
    		System.out.println("Age: " + pointer.getAge());
    		System.out.println("Illness: " + pointer.getIllness());
    		System.out.println();

    		
    		while(!pointer.getNextPatient().equals(trailer)){
    			
    			pointer = pointer.getNextPatient();

    			System.out.println("Patient name: " + pointer.getName());
    			System.out.println("Age: " + pointer.getAge());
    			System.out.println("Illness: " + pointer.getIllness());
    			System.out.println();
    		}
    	
    	}	
    	
    	
    }	



	
	public boolean deletePatient(Patient delete){
        
        Patient pointer = header;
		
		if(pointer == null){
			
			System.out.println("List is empty");
			return false; 
		
		}else if(delete.getName().equals(pointer.getName()) ){
			
			header = pointer.getNextPatient();
			pointer.setNextPatient(null);
			return true;
			
			 
		}else{
		
			while(pointer.getNextPatient().getName() != delete.getName() && pointer != null){
				
				pointer = pointer.getNextPatient();
			
			}
			
			if(pointer == null){
			
				return false;
			
			}else{
				
				pointer.setNextPatient(pointer.getNextPatient().getNextPatient());
				return true;	
			
			}		
		}
		
		
		       
    }
	



}
	

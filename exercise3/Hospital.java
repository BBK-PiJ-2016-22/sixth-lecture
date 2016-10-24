public class Hospital{

	private Patient header;

	public static void main (String[] args){
		
		Hospital myHospital = new Hospital();
			
		myHospital.Launch();	
	
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
		
		Patient sixthPatient = new Patient("Mongi", 32, "Anaphylactic Shock");
		addPatient(sixthPatient);
		
		Patient seventhPatient = new Patient("Poul", 22, "Cancer");
		addPatient(seventhPatient);
		
		
		printPatientsFowards();

		printPatientsBackwards();
		
		
		deletePatient(firstPatient);
		
		deletePatient(fourthPatient);
		
		
		printPatientsFowards();
		
		printPatientsBackwards();

		
		
		
		

	}
	
	public void addPatient(Patient newPatient){
		
		Patient pointer = header;
		// if the list is empty
		if(header == null){
			
			header = newPatient;	
		
		} else if (header != null){
		
			while(pointer.getNextPatient() != null){
				
				pointer = pointer.getNextPatient();
			
			}
			
			pointer.setNextPatient(newPatient); 
			pointer.getNextPatient().setPreviousPatient(pointer);
		}
	
	}

	
	public void printPatientsFowards(){
    	
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

    		
    		while(pointer.getNextPatient() != null){
    			
    			pointer = pointer.getNextPatient();

    			System.out.println("Patient name: " + pointer.getName());
    			System.out.println("Age: " + pointer.getAge());
    			System.out.println("Illness: " + pointer.getIllness());
    			System.out.println();
    		}
    	
    	}	
    		
    }	

	public void printPatientsBackwards(){
    	
    	Patient pointer = header; 
    	
    	if(header == null){
    		System.out.println("List is Empty");
    		return;
    	}
    	
    	while(pointer.getNextPatient() != null ){
    	
    		pointer = pointer.getNextPatient();
    	
    	}	
    	
			System.out.println("Patient name: " + pointer.getName());
    		System.out.println("Age: " + pointer.getAge());
    		System.out.println("Illness: " + pointer.getIllness());
    		System.out.println();
			
			while(pointer.getPreviousPatient() != null){
			
				pointer = pointer.getPreviousPatient();
				System.out.println("Patient name: " + pointer.getName());
    			System.out.println("Age: " + pointer.getAge());
    			System.out.println("Illness: " + pointer.getIllness());
    			System.out.println();
				
			}    	
    	
    	   	
    }	
	

	
	public boolean deletePatient(Patient delete){
        
        Patient pointer = header;
		
		if(pointer == null){
			
			System.out.println("List is empty");
			return false; 
		
		}else if(delete.getName().equals(pointer.getName()) ){
			
			header = pointer.getNextPatient();
			pointer.getNextPatient().setPreviousPatient(null);
			pointer.setNextPatient(null);
			return true;
			
			 
		}else{
		
			while(pointer.getNextPatient().getName() != delete.getName() && pointer != null){
				
				pointer = pointer.getNextPatient();
			
			}
			
			
			if(pointer.getNextPatient().getNextPatient() == null){
				pointer.getNextPatient().setPreviousPatient(null);
				pointer.setNextPatient(null);
				
				return true;
			
			}else{
			
				pointer.getNextPatient().getNextPatient().setPreviousPatient(pointer);	
				pointer.setNextPatient(pointer.getNextPatient().getNextPatient());
				return true;
							
			}		
		}		       
    } 
}	

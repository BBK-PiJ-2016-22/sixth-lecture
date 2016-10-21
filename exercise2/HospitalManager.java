public class HospitalManager{

	private Patient listStart;

	public static void main (String[] args){
		
		HospitalManager myManager = new HospitalManager();
			
		myManager.Launch();	
	
	}
	


	public void Launch(){
		
		Patient firstPatient = new Patient("Jim", 34, "very sick");
		
		
		listStart = firstPatient;
		
		Patient secondPatient = new Patient("Harald", 43, "Polio");
		addPatient(secondPatient);
		
		Patient thirdPatient = new Patient("Eric", 32, "OD");
		addPatient(thirdPatient);
		
		Patient fourthPatient = new Patient("Jerry", 22, "Small Pox");
		addPatient(fourthPatient);
		
		printPatients();
		
		int counted = listCounter();
		
		System.out.println(counted);
		
		deletePatient(firstPatient);
		deletePatient(secondPatient);
		
		int counted2 = listCounter(); 
		
		System.out.println(counted2);
		
		

	}
	
	public void addPatient(Patient newPatient){
		Patient pointer = listStart;
		
		/* tells whether the list is empty or not and 
		then sets first element to newPatient */
		if(pointer == null){
		
			pointer = newPatient;
			
		} else {
			
			while (pointer.getNextPatient() != null){
                // firstPatient.getNextPatient() = secondPatient
                // pointer = secondPatient
                // secondPatient.getNextPatient() = thirdPatient
                // thirdPatient.getNextPatient() = null.
                pointer = pointer.getNextPatient();
            }
            // thirdPatient.setNextPatient(fourthPatient)
            pointer.setNextPatient(newPatient);
		
		}
	
	}
	
	public boolean deletePatient(Patient patient) {
        Patient pointer = listStart;
        if (pointer == null){
            // patient not present as list empty
            return false;
        
        } else {
            
            if (pointer.getName().equals(patient.getName())){
                // first element is the patient we wish to delete
                listStart = pointer.getNextPatient();
                return true;
            } else {
                // look down the rest of the list
                while (pointer.getNextPatient().getName()!= patient.getName() && pointer != null){
                    pointer = pointer.getNextPatient();
            	}
            }
                
            if (pointer== null){
                
                return false;
            
            } else {
                    pointer.setNextPatient(pointer.getNextPatient().getNextPatient());
                    return true;
                }           
        }
    }
	
	
	private void printPatients() {
        Patient printThisPatient = listStart;
        Patient nextPatient;
        do {
            System.out.println("NAME: " + printThisPatient.getName() +
                    "\t AGE: " + printThisPatient.getAge() +
                    "\tILLNESS: " + printThisPatient.getIllness());
            nextPatient = printThisPatient.getNextPatient();
            printThisPatient = nextPatient;
        } while (nextPatient != null);
    }

	
	private int listCounter(){
		int counter = 0;
		
		Patient countThisPatient = listStart;
		Patient nextPatient;
		
		do {
			
			nextPatient = countThisPatient.getNextPatient();
			countThisPatient = nextPatient;
			counter += 1;
		} while (nextPatient != null); 
		
	
	return counter; 
	
	}

}

	

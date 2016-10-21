public class HospitalManager{

	private Patient listStart;

	public static void main (String[] args){
		
		HospitalManager myManager = new HospitalManager();
			
		myManager.Launch();	
	
	}
	


	public void Launch(){
		
		//create first element
		Patient firstPatient = new Patient("Poul", 34, "Lyme Disease");
		
		
		// variable storing start of list
		listStart = firstPatient;
		System.out.println(listStart);
		System.out.println(firstPatient);
		 
		
		
		// create second element
		Patient secondPatient = new Patient("John", 43, "AIDS");
		
		
		// linking second element to first element		
		firstPatient.setNextPatient(secondPatient);
		
		
		
		//creating third element
		Patient thirdPatient = new Patient("Jim", 55, "Cancer");
		
		
		//linking third element to third element
		secondPatient.setNextPatient(thirdPatient);	
		
		// create and add fourthPatient
		Patient FourthPatient = new Patient("Peter", 23, "Stomach Cramps"); 
		 
		addPatient(FourthPatient);
		
		System.out.println(FourthPatient);
		System.out.println(thirdPatient.getNextPatient());
		
		printPatients();
		
		deletePatient(secondPatient);
			
		printPatients();

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
}

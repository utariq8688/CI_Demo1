package wipro.service;

public class MyOperations {
	
	public long getSummation(int a, int b) {
//		a = 12;
//		b = 13;
		int c = a + b;
		return c;
		
	}
	
	public String getFullName(String firstName, String lastName) {
//		firstName = "Umer";
//		lastName = "Tariq";
		String fullName = "";
		if(firstName != null && lastName != null) {
			fullName = firstName + " " + lastName;	
		}
		else if(firstName == null) {
			fullName = lastName;	
		}
		
		else if(lastName == null) {
			fullName = firstName;	
		}
		return fullName;
	}

}

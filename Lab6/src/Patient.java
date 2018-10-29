
public class Patient {
	private int ohipNumber;
	private String surname;
	private String firstName;
	public Patient(int i, String firstName, String surname) {
		this.firstName = firstName;
		this.surname = surname;
		this.ohipNumber = i;
	}

	public int getOhipNumber(){
		return ohipNumber;
	}
	public String getSurname(){
		return surname;
	}
	public String getFirstName(){
		return firstName;
	}
	
	public String toString() {
		return firstName + " " + surname;
	}
}

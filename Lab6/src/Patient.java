
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
	
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (o == null)
			return false;
		if (this.getClass() != o.getClass())
			return false;
		return (this.getOhipNumber() == ((Patient) o).getOhipNumber())&&(this.getSurname() == ((Patient) o).getSurname())&&(this.getFirstName() == ((Patient) o).getFirstName());
	}
	
	public int hashCode() {
		return surname.hashCode()+firstName.hashCode();
	}
}

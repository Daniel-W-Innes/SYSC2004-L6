import java.util.HashMap;

public class Lab6c {

	public static void main(String[] args) {
		HashMap<Patient, String> hospital = new HashMap<Patient, String>();
		hospital.put(new Patient(1,"John","Doe"), "C123");
	}

}
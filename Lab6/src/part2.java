import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class part2 {

	public static void main(String[] args) {
		HashMap<Integer, String> gradebook = new HashMap<Integer, String>();
		Random random = new Random();
		String[] grades = new String[] { "F", "D-", "D", "D+", "C-", "C", "C+", "B-", "B", "B+", "A-", "A", "A+" };
		for (int i = 0; i < 1000; ++i) {
			int sn;
			do {
				sn = random.nextInt(10000);
			} while (gradebook.containsKey(sn));
			gradebook.put(sn, grades[random.nextInt(12)]);
		}
		System.out.println(gradebook.size());
		Set<Integer> keys = gradebook.keySet();
		for (Integer stNum : keys) {
			String grade = (String) gradebook.get(stNum);
			System.out.println(stNum + " = " + grade);
		}
	}

}
